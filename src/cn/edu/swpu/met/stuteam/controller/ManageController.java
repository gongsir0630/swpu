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
 * @author: 朱军
 * @date:2017年12月23日 下午9:09:50
 * @version :1.0
 * 
 */
@Controller
//@RequestMapping("/manage")  这一句是用来进行路径的提取，窄化路径
public class ManageController {
	/*
	 * 形参传递说明
	 * 1.当需要绑定的参数是集合的时候，需要将集合放到类中进行包装，mvc不能识别绑定的集合类型
	 */
	
	/*
	 * 返回参数的说明
	 * 1.ModelAndView 无敌的，可以传递数据和视图   不建议使用
	 * 2.String  只能用来返回视图的路径  ，这时候需要传递数据需要使用形参里面的Model 对象带数据，    **官方和企业推荐这种方式方式，可以解耦，将数据和视图进行分离
	 * 3.void 需要使用形参里面的request和response，  调用他们的方法可以实现页面和数据的传递 ，  **他存在的意义是：ajax不需要跳视图，所以主要是处理ajax请求，利用response设置json数据
	 */
	@Autowired
	private ServletContext application;
	
	@Autowired
	private IManageService manageService;
	
	@Autowired
	private ISignServices signService;
	
	/**
	 * 处理ajax请求   检查用户名是否存在
	 * @Title: checkName 
	 * @Description: TODO 
	 * @param @param userId
	 * @param @param response
	 * @param @return
	 * @param @throws IOException   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value="checkName.action")//.action 可以省略
	public @ResponseBody Map<String, Boolean> checkName(String userId,HttpServletResponse response) throws IOException{
//		System.out.println("进来啦"+manageService);
//		System.out.println("用户的ID"+userId);
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
	 * 进行登陆的密码验证
	 * @Title: login 
	 * @Description: TODO 
	 * @param @param username 绑定页面上的用户名
	 * @param @param password 绑定页面上的密码
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
			return "login";//跳转到登陆页面
		}
		//将user放到session作用域中
		//设置回话超时时间为30分钟
		session.setMaxInactiveInterval(1800);
		session.setAttribute("user", user);
		return "welcome";
	}
	
	/**
	 * 跳转首页
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
	 * 注销登陆，清楚域中对象
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
	 * 查询所有的管理员信息
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
		
		//查询分页对象
		Page<Manage> page = manageService.selectPageBy(vo);
		model.addAttribute("page", page);
		model.addAttribute("condition", vo.getCondition());
		model.addAttribute("selectString", vo.getSelectString());
		return "manageList";
	}
	
	
	/**
	 * 添加用户
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
		// 重定向后浏览器地址栏变更为重定向的地址，
		// 重定向相当于执行了新的request和response，所以之前的请求参数都会丢失
		// 如果要指定请求参数，需要在重定向的url后面添加 ?itemId=1 这样的请求参数
		// 使用转发的方式实现。转发后浏览器地址栏还是原来的请求地址，
		// 转发并没有执行新的request和response，所以之前的请求参数都存在
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
	 * 查看用户详情
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
		//根据ID查询用户
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
		//修改用户的信息
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
	 * 操作用户    修改  删除
	 * @Title: operateManage 
	 * @Description: TODO 
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "/operateManage.action")
	public String operateManage(String id, String operate, Model model, HttpSession session, HttpServletResponse response) throws IOException {
		//查询当前被操作的对象
		Manage thisManage = manageService.queryManageById(id);
		//判断操作类型
		if ("manageUpdate".equals(operate)) {//点击确认修改后的操作
			
		}else if ("manageUpdateRequest".equals(operate)) {//点击修改用户的按钮进行跳转修改表单页面
			model.addAttribute("thisManage", thisManage);
			return "manageUpdate";
			
		}else if ("manageDelete".equals(operate)) {//删除用户
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
	 * 删除用户
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
	 * 当进行用户的修改时，必须校验当前被修改用户的原密码，密码不正确不能校验
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
	 * 检查用户是否具有组长权限
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
		//判断当前登陆者的ID
		if (userId != null) {
			Manage manage = manageService.queryManageById(userId);
			//System.out.println("用户的类型"+manage.getType());
			if (manage.getType() == 1) {//如果是组长
				result.put("isTeamer", true); 
			}else {
				result.put("isTeamer", false);
			}
		}
		
		return result;
		
	}
	
	
	

}
