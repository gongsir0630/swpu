package cn.edu.swpu.met.stuteam.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.swpu.met.common.util.CommonsUtils;
import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.ManageSign;
import cn.edu.swpu.met.stuteam.pojo.ManageSignWatchs;
import cn.edu.swpu.met.stuteam.pojo.ToolBikes;
import cn.edu.swpu.met.stuteam.pojo.ToolKeys;
import cn.edu.swpu.met.stuteam.pojo.ToolTools;
import cn.edu.swpu.met.stuteam.pojo.vo.ManageWatch;
import cn.edu.swpu.met.stuteam.pojo.vo.QuerySignVo;
import cn.edu.swpu.met.stuteam.services.IManageService;
import cn.edu.swpu.met.stuteam.services.ISignServices;

/**
 * @ClassName: SignController
 * @Description: TODO
 * @author: ���
 * @date:2018��1��6�� ����7:52:20
 * @version :1.0
 * 
 */
@Controller
public class SignController {
	@Autowired
	private ServletContext application;
	
	@Autowired
	private ISignServices signService;
	
	@Autowired
	private IManageService manageService;
	
	/**
	 * �鿴��һ��Ľ��ӱ�
	 * @Title: showBeforeSign 
	 * @Description: TODO 
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "showBefSig.action")
	public String showBeforeSign(Model model){
		//��ѯ����һ���ֵ����־
		/*
		 * �����������һ��û����дǩ������ô�죬����ʲô�����жϣ������ȡ���ݿ����һ������,���һ����¼������һ�����
		 */
		//��ȡǩ���������һ����¼
		ManageSign lastSign = signService.getLastSign();
		model.addAttribute("lastsign", lastSign);
		//��ѯ�����е�ֵ����Ա
		List<Manage> allManage = manageService.getAllManage();
		model.addAttribute("allManage", allManage);
		return "signTableBef";
	}
	
	/**
	 * �������ǩ���İ�ť���������ǩ����ҳ��
	 * @Title: signAddIn 
	 * @Description: TODO 
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "toSignAdd.action")
	public String signAddIn(Model model){
		//���ҳ����Ҫ��ѯ�����ߵ����������ֵ����Ա�����
		List<Manage> allManage = manageService.getAllManage();
		List<ToolTools> tools = signService.getAllTools();
		List<ToolKeys> keys = signService.getAllKeys();
		List<ToolBikes> bikes = signService.getAllBikes(); 
		model.addAttribute("tools", tools);
		model.addAttribute("keys", keys);
		model.addAttribute("bikes", bikes);
		model.addAttribute("allManage", allManage);
		return "signAdd";
	}
	
	/**
	 * ���һ���µ�ǩ����¼
	 * @Title: addSign 
	 * @Description: TODO 
	 * @param @param manageSign
	 * @param @param model
	 * @param @param request
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "addSign.action")
	public @ResponseBody Map<String, Boolean> addSign(ManageSign manageSign, Model model,HttpServletRequest request, String secondCommit) {
		//�����洢��������Ӧ������Map����
		Map<String, Boolean> addSignMap = new HashMap<>();
		//1.���ɶ������
		String signTableId = CommonsUtils.getSignTableId(manageSign.getCreatetime(), manageSign.getBanci());
		
		//2.��ʼ��ǩ����Ĳ��ֲ���
		//2.1����ǩ����ı��
		manageSign.setId(signTableId); 
		//2.2���ݻ�ȡ��ֵ���˵���Ϣ������request��ȡ�ٵ�������Ϣ
		List<ManageSignWatchs> manageSignWatchs = new ArrayList<>();
		String[] watchs =  manageSign.getWatchs();
		for (String watchId : watchs) {
			ManageSignWatchs manageSignWatch = new ManageSignWatchs();
			//����ֵ���˵�ID
			manageSignWatch.setManageid(watchId);
			//����ǩ�����ID
			manageSignWatch.setSigntableid(signTableId);
			//����ֵ����Ա��ֵ��״̬
			manageSignWatch.setStaion(Integer.parseInt(request.getParameter(watchId)));
			manageSignWatchs.add(manageSignWatch);
		}
		//2.3����ֵ����Ա�ӱ�
		manageSign.setWatchsArray(manageSignWatchs);
		//��ʼ���������
		
		//3.�ж��ǲ����Ѿ�����ǩ����
		//����ǩ����ı�Ž��в�ѯ��������Բ�ѯ��һ����¼����˵���Ѿ����ڼ�¼������˵��������
		ManageSign sign = signService.getSignById(signTableId);
		System.out.println("���ݱ�Ų�ѯ����ǩ����Ϣ��"+sign);
		if (sign != null) {//����Ѿ����ڸ�ǩ����
			if (secondCommit == null) {//�ж��Ƿ���һ���ύ�����������Ӧ��ҳ����������ύ������Ƕ����ύ������
				System.out.println("�ð��ǩ����Ϣ�Ѿ����ڣ�");
				addSignMap.put("isExist", true);
				return addSignMap;
			}
		}
		System.out.println("ǿ���ύ������"+secondCommit);
		if (secondCommit != null) {//�����ǿ���ύ
			if (secondCommit.equals("yes") || secondCommit == "yes") {
				System.out.println("��ʼ����ɾ����������������");
				//ɾ��ǩ����������Ϣ
				signService.deleteManageSignById(signTableId);
				//ɾ����ǩ�����Ӧ�Ĵӱ���Ϣ
				signService.deleteSignBYTW(signTableId);
			}
		}
		
		//4.���ö�����ӷ���������ǩ��������
		boolean addSignSucceess = signService.addsign(manageSign);
		if (addSignSucceess) {
			addSignMap.put("addSuccess", true);
		}else {
			addSignMap.put("addSuccess", false);
		}
		//���ǩ����ķ���
		return addSignMap;
	}
	
	/**
	 * ���ȷ��ǩ�����޸ĵ�ǰǩ�����ȷ��ǩ��������
	 * @Title: confirmSIgn 
	 * @Description: TODO 
	 * @param @param model
	 * @param @param confirmname
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "confirmSign.action")
	public String confirmSIgn(Model model, String confirmname, String signTableId){
		//�޸�ǩ����
		boolean isSuccess = signService.updateConfirmName(signTableId,confirmname);
		if (isSuccess) {
			return "redirect:/toSignAdd.action";
		}
		return "redirect:/showBefSig.action";
		
	}
	
	
	/**
	 * �鿴ǩ����Ϣ�б����з�ҳ
	 * @Title: toSignList 
	 * @Description: TODO 
	 * @param @param model
	 * @param @param querySign   
	 * @return void    
	 * @throws
	 */
	@RequestMapping(value = "signList.action")
	public String toSignList(Model model, QuerySignVo vo){
		Page<ManageSign> page = signService.selectSignByVo(vo);
		model.addAttribute("page", page);
		model.addAttribute("condition", vo.getCondition());
		model.addAttribute("selectString", vo.getSelectString());
		return "signList";
		
	}
	
	/**
	 * ɾ��һ��ǩ����
	 * @Title: deleteManage 
	 * @Description: TODO 
	 * @param @param signId
	 * @param @param model
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value = "deleteSign.action")
	public @ResponseBody Map<String, Boolean> deleteManage(String signId, Model model) {
		Map<String, Boolean> result = new HashMap<>();
		System.out.println(signId);
		if (signId == null) {
			result.put("delSuccess", false);
		}else {
			boolean delSuccess = signService.deleteSign(signId);
			
			if (delSuccess) {
				result.put("delSuccess", true);
			}else {
				result.put("delSuccess", false);
			}
		}
		return result;
	}
	
	/**
	 * ����ID�鿴һ����¼
	 * @Title: showSignById 
	 * @Description: TODO 
	 * @param @param model
	 * @param @param signId
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "showSignById.action")
	public String showSignById(Model model, String signId, String address){
		
		ManageSign sign = signService.getCompleteSignById(signId);
		System.out.println("��Ҫ�޸ĵ�ǩ����===="+sign);
		System.out.println(address);
		model.addAttribute("address", address);
		model.addAttribute("sign", sign);
		//���ҳ����Ҫ��ѯ�����ߵ����������ֵ����Ա�����
		List<ToolTools> tools = signService.getAllTools();
		List<ToolKeys> keys = signService.getAllKeys();
		List<ToolBikes> bikes = signService.getAllBikes();
		model.addAttribute("tools", tools);
		model.addAttribute("keys", keys);
		model.addAttribute("bikes", bikes);
		
		//���´��ֵ����Ա��һ��
		List<ManageSignWatchs> watchs = sign.getWatchsArray();
		List<Manage> allManage = manageService.getAllManage();
		List<ManageWatch> manageWatchs = new ArrayList<>();
		for (Manage manage : allManage) {//�������е�ֵ������Ա
			ManageWatch mWatch = new ManageWatch();
			String id = manage.getId();
			mWatch.setId(id);
			mWatch.setRealName(manage.getRealname());
			for (ManageSignWatchs manageSignWatchs : watchs) {
				if (manageSignWatchs.getManageid().equals(id)) {
					mWatch.setExist(1);
					mWatch.setStation(manageSignWatchs.getStaion());
				}
			}
			manageWatchs.add(mWatch);
		}
		model.addAttribute("allManage", allManage);
		model.addAttribute("watchs", manageWatchs);
		return "signUpdate";
	}
	
	/**
	 * ����id����ǩ����
	 * @Title: updateSign 
	 * @Description: TODO 
	 * @param @param manageSign
	 * @param @param model
	 * @param @param request
	 * @param @param secondCommit
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value = "updateSign.action")
	public @ResponseBody Map<String, Boolean> updateSign(ManageSign manageSign, Model model,HttpServletRequest request ) {
		//�����洢��������Ӧ������Map����
		Map<String, Boolean> updateSignMap = new HashMap<>();
		String signTableId = manageSign.getId();
		//���ݻ�ȡ��ֵ���˵���Ϣ������request��ȡ�ٵ�������Ϣ
		List<ManageSignWatchs> manageSignWatchs = new ArrayList<ManageSignWatchs>();
		String[] watchs =  manageSign.getWatchs();
		for (String watchId : watchs) {
			ManageSignWatchs manageSignWatch = new ManageSignWatchs();
			//����ֵ���˵�ID
			manageSignWatch.setManageid(watchId);
			//��ֵ����Ա�ӱ�����ǩ�����ID
			manageSignWatch.setSigntableid(signTableId);
			//����ֵ����Ա��ֵ��״̬��״̬ͨ��request��
			manageSignWatch.setStaion(Integer.parseInt(request.getParameter(watchId)));
			manageSignWatchs.add(manageSignWatch);
		}
		//����ֵ����Ա�ӱ�
		manageSign.setWatchsArray(manageSignWatchs);
		if ("0".equals(manageSign.getConfirmname()) ||  manageSign.getConfirmname() == "0" ) {
			manageSign.setConfirmname(null);
		}
		//��ʼ���������
		//����ǩ����������Ϣ
		boolean updateSuccess = signService.updateManageSignById(manageSign);
		if (updateSuccess) {
			updateSignMap.put("updateSuccess", true);
		}else {
			updateSignMap.put("updateSuccess", false);
		}
		return updateSignMap;
	}
}
