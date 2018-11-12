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
 * @author: 朱军
 * @date:2018年1月6日 下午7:52:20
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
	 * 查看上一班的交接本
	 * @Title: showBeforeSign 
	 * @Description: TODO 
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "showBefSig.action")
	public String showBeforeSign(Model model){
		//查询出上一班的值班日志
		/*
		 * 分析：如果上一班没有填写签到表怎么办，根据什么进行判断，如果获取数据库最后一条数据,最后一条记录属于哪一个班次
		 */
		//获取签到表中最后一条记录
		ManageSign lastSign = signService.getLastSign();
		model.addAttribute("lastsign", lastSign);
		//查询出所有的值班人员
		List<Manage> allManage = manageService.getAllManage();
		model.addAttribute("allManage", allManage);
		return "signTableBef";
	}
	
	/**
	 * 点击本班签到的按钮后进入新增签到表页面
	 * @Title: signAddIn 
	 * @Description: TODO 
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "toSignAdd.action")
	public String signAddIn(Model model){
		//这个页面需要查询出工具的情况，所有值班人员的情况
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
	 * 添加一条新的签到记录
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
		//用来存储服务器响应参数的Map集合
		Map<String, Boolean> addSignMap = new HashMap<>();
		//1.生成订单编号
		String signTableId = CommonsUtils.getSignTableId(manageSign.getCreatetime(), manageSign.getBanci());
		
		//2.初始化签到表的部分参数
		//2.1设置签到表的编号
		manageSign.setId(signTableId); 
		//2.2根据获取的值班人的信息，利用request获取迟到旷班信息
		List<ManageSignWatchs> manageSignWatchs = new ArrayList<>();
		String[] watchs =  manageSign.getWatchs();
		for (String watchId : watchs) {
			ManageSignWatchs manageSignWatch = new ManageSignWatchs();
			//设置值班人的ID
			manageSignWatch.setManageid(watchId);
			//设置签到表的ID
			manageSignWatch.setSigntableid(signTableId);
			//设置值班人员的值班状态
			manageSignWatch.setStaion(Integer.parseInt(request.getParameter(watchId)));
			manageSignWatchs.add(manageSignWatch);
		}
		//2.3设置值班人员从表
		manageSign.setWatchsArray(manageSignWatchs);
		//初始化参数完毕
		
		//3.判断是不是已经存在签到表
		//根据签到表的编号进行查询，如果可以查询出一条记录，则说明已经存在记录，否者说明不存在
		ManageSign sign = signService.getSignById(signTableId);
		System.out.println("根据编号查询出的签到信息："+sign);
		if (sign != null) {//如果已经存在该签到表
			if (secondCommit == null) {//判断是否是一次提交，如果是则响应到页面请求二次提交，如果是二次提交则跳过
				System.out.println("该班的签到信息已经存在！");
				addSignMap.put("isExist", true);
				return addSignMap;
			}
		}
		System.out.println("强行提交参数："+secondCommit);
		if (secondCommit != null) {//如果是强行提交
			if (secondCommit.equals("yes") || secondCommit == "yes") {
				System.out.println("开始进行删除。。。。。。。");
				//删除签到表主表信息
				signService.deleteManageSignById(signTableId);
				//删除该签到表对应的从表信息
				signService.deleteSignBYTW(signTableId);
			}
		}
		
		//4.调用订单添加方法，进行签到表的添加
		boolean addSignSucceess = signService.addsign(manageSign);
		if (addSignSucceess) {
			addSignMap.put("addSuccess", true);
		}else {
			addSignMap.put("addSuccess", false);
		}
		//添加签到表的方法
		return addSignMap;
	}
	
	/**
	 * 点击确认签到后，修改当前签到表的确认签到人姓名
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
		//修改签到表
		boolean isSuccess = signService.updateConfirmName(signTableId,confirmname);
		if (isSuccess) {
			return "redirect:/toSignAdd.action";
		}
		return "redirect:/showBefSig.action";
		
	}
	
	
	/**
	 * 查看签到信息列表，进行分页
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
	 * 删除一张签到表
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
	 * 根据ID查看一条记录
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
		System.out.println("需要修改的签到表===="+sign);
		System.out.println(address);
		model.addAttribute("address", address);
		model.addAttribute("sign", sign);
		//这个页面需要查询出工具的情况，所有值班人员的情况
		List<ToolTools> tools = signService.getAllTools();
		List<ToolKeys> keys = signService.getAllKeys();
		List<ToolBikes> bikes = signService.getAllBikes();
		model.addAttribute("tools", tools);
		model.addAttribute("keys", keys);
		model.addAttribute("bikes", bikes);
		
		//重新打包值班人员这一栏
		List<ManageSignWatchs> watchs = sign.getWatchsArray();
		List<Manage> allManage = manageService.getAllManage();
		List<ManageWatch> manageWatchs = new ArrayList<>();
		for (Manage manage : allManage) {//遍历所有的值班室人员
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
	 * 根据id更新签到表
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
		//用来存储服务器响应参数的Map集合
		Map<String, Boolean> updateSignMap = new HashMap<>();
		String signTableId = manageSign.getId();
		//根据获取的值班人的信息，利用request获取迟到旷班信息
		List<ManageSignWatchs> manageSignWatchs = new ArrayList<ManageSignWatchs>();
		String[] watchs =  manageSign.getWatchs();
		for (String watchId : watchs) {
			ManageSignWatchs manageSignWatch = new ManageSignWatchs();
			//设置值班人的ID
			manageSignWatch.setManageid(watchId);
			//给值班人员从表设置签到表的ID
			manageSignWatch.setSigntableid(signTableId);
			//设置值班人员的值班状态（状态通过request）
			manageSignWatch.setStaion(Integer.parseInt(request.getParameter(watchId)));
			manageSignWatchs.add(manageSignWatch);
		}
		//设置值班人员从表
		manageSign.setWatchsArray(manageSignWatchs);
		if ("0".equals(manageSign.getConfirmname()) ||  manageSign.getConfirmname() == "0" ) {
			manageSign.setConfirmname(null);
		}
		//初始化参数完毕
		//更新签到表主表信息
		boolean updateSuccess = signService.updateManageSignById(manageSign);
		if (updateSuccess) {
			updateSignMap.put("updateSuccess", true);
		}else {
			updateSignMap.put("updateSuccess", false);
		}
		return updateSignMap;
	}
}
