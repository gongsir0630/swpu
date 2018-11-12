package cn.edu.swpu.met.stuteam.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryVo;
import cn.edu.swpu.met.stuteam.services.IManageService;
import cn.edu.swpu.met.stuteam.services.ISignServices;

/**
 * @ClassName: ManageController
 * @Description: TODO
 * @author: ���
 * @date:2017��12��23�� ����9:09:50
 * @version :1.0
 * 
 */
@Controller
//@RequestMapping("/manage")  ��һ������������·������ȡ��խ��·��
public class ManageController {
	/*
	 * �βδ���˵��
	 * 1.����Ҫ�󶨵Ĳ����Ǽ��ϵ�ʱ����Ҫ�����Ϸŵ����н��а�װ��mvc����ʶ��󶨵ļ�������
	 */
	
	/*
	 * ���ز�����˵��
	 * 1.ModelAndView �޵еģ����Դ������ݺ���ͼ   ������ʹ��
	 * 2.String  ֻ������������ͼ��·��  ����ʱ����Ҫ����������Ҫʹ���β������Model ��������ݣ�    **�ٷ�����ҵ�Ƽ����ַ�ʽ��ʽ�����Խ�������ݺ���ͼ���з���
	 * 3.void ��Ҫʹ���β������request��response��  �������ǵķ�������ʵ��ҳ������ݵĴ��� ��  **�����ڵ������ǣ�ajax����Ҫ����ͼ��������Ҫ�Ǵ���ajax��������response����json����
	 */
	@Autowired
	private ServletContext application;
	
	@Autowired
	private IManageService manageService;
	
	@Autowired
	private ISignServices signService;
	
	/**
	 * ����ajax����   ����û����Ƿ����
	 * @Title: checkName 
	 * @Description: TODO 
	 * @param @param userId
	 * @param @param response
	 * @param @return
	 * @param @throws IOException   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value="checkName.action")//.action ����ʡ��
	public @ResponseBody Map<String, Boolean> checkName(String userId,HttpServletResponse response) throws IOException{
//		System.out.println("������"+manageService);
//		System.out.println("�û���ID"+userId);
		boolean isExist = manageService.checkUserName(userId);
		Map<String, Boolean> result = new HashMap<>();
//		System.out.println(isExist);
		if (isExist) {
			result.put("isExist", true);
			//response.getWriter().print("{\"isExist\":true}");
		}else {
			result.put("isExist", false);
			//response.getWriter().print("{\"isExist\":false}");
		}
		return result;
	}
	
	
	/**
	 * ���е�½��������֤
	 * @Title: login 
	 * @Description: TODO 
	 * @param @param username ��ҳ���ϵ��û���
	 * @param @param password ��ҳ���ϵ�����
	 * @param @param model
	 * @param @param session
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "login.action")
	public String login(String username, String password, Model model, HttpSession session){
		Manage user = manageService.loginManage(username, password);
		if (user == null) {
			return "login";//��ת����½ҳ��
		}
		//��user�ŵ�session��������
		//���ûػ���ʱʱ��Ϊ30����
		session.setMaxInactiveInterval(1800);
		session.setAttribute("user", user);
		return "welcome";
	}
	
	/**
	 * ��ת��ҳ
	 * @Title: toWelcom 
	 * @Description: TODO 
	 * @param @param model
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "toWelcome.action")
	public String toWelcom(Model model){
		return "welcome";
	}
	
	/**
	 * ע����½��������ж���
	 * @Title: logout 
	 * @Description: TODO 
	 * @param @param session
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "logout.action")
	public String logout(HttpSession session, HttpServletRequest request){
		session.removeAttribute("user");
		return "login";
	}
	
	/**
	 * ��ѯ���еĹ���Ա��Ϣ
	 * @Title: manageList 
	 * @Description: TODO 
	 * @param @param session
	 * @param @param request
	 * @param @param model
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "manageList.action")
	public String manageList(QueryVo vo, HttpServletRequest request, Model model){
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("QUeryVo======"+vo);
//		List<Manage> manages = manageService.getAllManage();
//		System.out.println(manages.size());
//		ManageList manageList = new ManageList();
//		manageList.setManages(manages);
//		model.addAttribute("manageList", manageList);
//		model.addAttribute("manages", manages);
		
		//��ѯ��ҳ����
		Page<Manage> page = manageService.selectPageBy(vo);
		model.addAttribute("page", page);
		model.addAttribute("condition", vo.getCondition());
		model.addAttribute("selectString", vo.getSelectString());
		return "manageList";
	}
	
	
	/**
	 * ����û�
	 * @Title: manageAdd 
	 * @Description: TODO 
	 * @param @param manage
	 * @param @param model
	 * @param @param response
	 * @param @return
	 * @param @throws ParseException   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value = "manageAdd.action")
	public @ResponseBody Map<String, Boolean> manageAdd(Manage manage, Model model,HttpServletResponse response) throws ParseException{
		Date date = new Date();  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		manage.setCreatedate(sdf.parse(sdf.format(date)));
		System.out.println("****"+manage);
		boolean addSuccess = manageService.addManage(manage);
		// �ض�����������ַ�����Ϊ�ض���ĵ�ַ��
		// �ض����൱��ִ�����µ�request��response������֮ǰ������������ᶪʧ
		// ���Ҫָ�������������Ҫ���ض����url������� ?itemId=1 �������������
		// ʹ��ת���ķ�ʽʵ�֡�ת�����������ַ������ԭ���������ַ��
		// ת����û��ִ���µ�request��response������֮ǰ���������������
		Map<String, Boolean> result = new HashMap<>();
		if (addSuccess) {
			result.put("addSuccess", true);
		}else {
			result.put("addSuccess", false);
		}
		return result;
		
//		if (addSuccess) {
//			return "redirect:/manageList.action";
//		}
//		return "forward:/manageList.action";
	}
	
	/**
	 * �鿴�û�����
	 * @Title: manageView 
	 * @Description: TODO 
	 * @param @param id
	 * @param @param model
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "/manageView.action")
	public String manageView(String id,Model model){
		//����ID��ѯ�û�
		Manage manage = manageService.queryManageById(id);
		model.addAttribute("thisManage", manage);
		return "manageView";
	}
	
	@RequestMapping(value = "/manageUpdate.action")
	public @ResponseBody Map<String, Boolean> manageUpdate(Manage manage,Model model, String  oldPassword, HttpSession session){
		if (manage.getPassword() == null || manage.getPassword() == "" || manage.getPassword().equals("")) {
			manage.setPassword(oldPassword);
		}
		Manage loginUser = (Manage) session.getAttribute("user");
		manage.setChangeby(loginUser.getId());
		manage.setChangetime(new Date());
		System.out.println("hahahh"+manage);
		//�޸��û�����Ϣ
		boolean updateSuccess = manageService.updateManage(manage);
		Map<String, Boolean> result = new HashMap<>();
		if (updateSuccess) {
			result.put("updateSuccess", true);
		}else {
			result.put("updateSuccess", false);
		}
		return result;
	}
	
	/**
	 * @throws IOException 
	 * �����û�    �޸�  ɾ��
	 * @Title: operateManage 
	 * @Description: TODO 
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "/operateManage.action")
	public String operateManage(String id, String operate, Model model, HttpSession session, HttpServletResponse response) throws IOException {
		//��ѯ��ǰ�������Ķ���
		Manage thisManage = manageService.queryManageById(id);
		//�жϲ�������
		if ("manageUpdate".equals(operate)) {//���ȷ���޸ĺ�Ĳ���
			
		}else if ("manageUpdateRequest".equals(operate)) {//����޸��û��İ�ť������ת�޸ı�ҳ��
			model.addAttribute("thisManage", thisManage);
			return "manageUpdate";
			
		}else if ("manageDelete".equals(operate)) {//ɾ���û�
			boolean delSuccess = manageService.deleteManage(id);
			if (delSuccess) {
				response.getWriter().print("{\"delSuccess\":true}");
			}else {
				response.getWriter().print("{\"delSuccess\":false}");
			}
		}
		return null;
	}
	
	/**
	 * ɾ���û�
	 * @Title: deleteManage 
	 * @Description: TODO 
	 * @param @param id
	 * @param @param oldPassword
	 * @param @param model
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value = "deleteManage.action")
	public @ResponseBody Map<String, Boolean> deleteManage(String userId, Model model) {
		Map<String, Boolean> result = new HashMap<>();
		System.out.println(userId);
		if (userId == null) {
			result.put("delSuccess", false);
		}else {
			boolean delSuccess = manageService.deleteManage(userId);
			
			if (delSuccess) {
				result.put("delSuccess", true);
			}else {
				result.put("delSuccess", false);
			}
		}
		return result;
	}
	/**
	 * �������û����޸�ʱ������У�鵱ǰ���޸��û���ԭ���룬���벻��ȷ����У��
	 * @Title: checkOldPassword 
	 * @Description: TODO 
	 * @param @param id
	 * @param @param oldPassword
	 * @param @param model
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value = "checkOldPassword.action")
	public @ResponseBody Map<String, Boolean> checkOldPassword(String userId , String oldPassword,Model model) {
		System.err.println(userId);
		Manage manage = manageService.loginManage(userId, oldPassword);
		System.out.println("**********"+manage);
		Map<String, Boolean> result = new HashMap<>();
		if (manage != null) {
			result.put("isRight", true);
		}else {
			result.put("isRight", false);
		}
		return result;
	}
	
	/**
	 * ����û��Ƿ�����鳤Ȩ��
	 * @Title: checkPower 
	 * @Description: TODO 
	 * @param @param userId
	 * @param @param model
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value = "checkPower.action")
	public @ResponseBody Map<String, Boolean>  checkPower(String userId, Model model){
		Map<String, Boolean> result = new HashMap<>();
		//�жϵ�ǰ��½�ߵ�ID
		if (userId != null) {
			Manage manage = manageService.queryManageById(userId);
			//System.out.println("�û�������"+manage.getType());
			if (manage.getType() == 1) {//������鳤
				result.put("isTeamer", true); 
			}else {
				result.put("isTeamer", false);
			}
		}
		
		return result;
		
	}
	
	
	

}
