package cn.edu.swpu.met.stuteam.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.Orderend;
import cn.edu.swpu.met.stuteam.pojo.Ordertable;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryOrderVo;
import cn.edu.swpu.met.stuteam.services.IManageService;
import cn.edu.swpu.met.stuteam.services.IOrderServices;


/**
 * @ClassName: OrderController
 * @Description: TODO
 * @author: 朱军
 * @date:2018年3月18日 下午10:18:18
 * @version :1.0
 * 
 */
@Controller
public class OrderController {
	@Autowired
	private IOrderServices ordeService;
	
	@Autowired
	private ServletContext application;
	
	@Autowired
	private IManageService manageService;
	
	
	
	/**
	 * 去到添加页面，查询出所有的值班室编制人员
	 * @Title: toOrderAdd 
	 * @Description: TODO 
	 * @param @param model
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "toOrderAdd.action")
	public String toOrderAdd(Model model){
		//查询出所有的值班人员作为派单人（如果是除了值班室以外的人派单，在备注中说明）
		List<Manage> allManage = manageService.getAllManage();
		model.addAttribute("allManage",allManage);
		return "orderAdd";
	}
	
	/**
	 * 添加订单的方法
	 * @Title: orderAdd 
	 * @Description: TODO 
	 * @param @param model
	 * @param @param order
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "orderAdd.action")
	public @ResponseBody Map<String, Boolean> orderAdd(Model model, Ordertable order){
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		boolean addSuccess = ordeService.addSign(order);
		map.put("addSuccess", addSuccess);
		return map;
	}
	
	/**
	 * 查看未完工的工单（包括正在派工的工单）
	 * @Title: showUnfinishOrder 
	 * @Description: TODO 
	 * @param @param model
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "showUnfinishOrder.action")
	public String showUnfinishOrder(Model model,QueryOrderVo vo){
		vo.setCondition(0);//条件0表示查询出为完工的工单
		vo.setSize(5);
		Page<Ordertable> page = ordeService.selectUnfinishOrder(vo);
		model.addAttribute("page", page);
		List<Manage> allManage = manageService.getAllManage();
		model.addAttribute("allManage", allManage);
		return "orderUnfinishList";
	}
	
	/**
	 * 点击取消出单后删除出单信息
	 * @Title: exitChudan 
	 * @Description: TODO 
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping( value = "exitChudan.action")
	public @ResponseBody Map<String, Boolean> exitChudan(String orderId) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		boolean exitSUccess = ordeService.cleanChudanInfo(orderId);
		map.put("exitSuccess", exitSUccess);
		return map;
	}
	
	
	/**
	 * 点击出单，添加出单信息
	 * @Title: chudan 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @param realname
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping( value = "chuDan.action")
	public @ResponseBody Map<String, Boolean> chudan(String orderId,String realname) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		boolean chuDanSuccess = ordeService.addChudanInfo(orderId,realname);
		map.put("chuDanSuccess", chuDanSuccess);
		return map;
	}
	
	/**
	 * 点击完工按钮进入次方法
	 * @Title: finishOrder 
	 * @Description: TODO 
	 * @param @param model
	 * @param @param orderId
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "finishOrder.action")
	public String finishOrder(Model model, String orderId){
		//查询出工单的信息作为页面显示
		List<Manage> allManage = manageService.getAllManage();
		Ordertable order = ordeService.selectOrderById(orderId);
		model.addAttribute("allManage", allManage);
		model.addAttribute("order", order);
		return "orderFinish";
	}
	
	
	/**
	 *  提交完工表单
	 * @Title: finish 
	 * @Description: TODO 
	 * @param @param order
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping( value = "finish.action")
	public @ResponseBody Map<String, Boolean> finish(Ordertable order) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		boolean finishSuccess = ordeService.finish(order);
		map.put("finishSuccess", finishSuccess);
		return map;
	}
	
	/**
	 * 分页查询所有的工单
	 * @Title: showOrderPage 
	 * @Description: TODO 
	 * @param @param model
	 * @param @param vo
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "showOrderPage.action")
	public String showOrderPage(Model model,QueryOrderVo vo){
		vo.setSize(8);
		Page<Ordertable> page = ordeService.selectPageBy(vo);
		model.addAttribute("page", page);
		model.addAttribute("condition", vo.getCondition());
		model.addAttribute("selectString", vo.getSelectString());
		return "orderList";
	}
	
	
	/**
	 * 点击修改工单按钮进入修改页面
	 * @Title: updateOrder 
	 * @Description: TODO 
	 * @param @param model
	 * @param @param orderId
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "toUpdateOrder.action")
	public String toupdateOrder(Model model,String orderId){
		Ordertable thisOrder = ordeService.selectOrderByIdToUpdate(orderId);
		List<Manage> allManage = manageService.getAllManage();
		List<Orderend> orderends = thisOrder.getOrderends();
		List<Manage> newallManage = new ArrayList<>();
		for (Manage manage : allManage) {
			for (Orderend orderend : orderends) {
				if (orderend.getManageInfo().getId() .equals(manage.getId())) {
					manage.setJionFinishOrder(1);
					break;
				}
			}
			newallManage.add(manage);
		}
		model.addAttribute("allManage", newallManage);
		model.addAttribute("order", thisOrder);
		return "orderUpdate";
	}
	
	/**
	 * 更新工单
	 * @Title: updateOrder 
	 * @Description: TODO 
	 * @param @param order
	 * @param @param changeBy
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value="updateOrder.action")
	public @ResponseBody Map<String, Boolean> updateOrder(Ordertable order,String changeBy) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		boolean updateSuccess = ordeService.updateOrder(order,changeBy);
		map.put("updateSuccess", updateSuccess);
		return map;
	}
	
	/**
	 * 删除工单
	 * @Title: deleteOrder 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return Map<String,Boolean>    
	 * @throws
	 */
	@RequestMapping(value= "deleteOrder.action")
	public @ResponseBody Map<String, Boolean> deleteOrder(String  orderId) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		boolean delSuccess = ordeService.deleteOredrById(orderId);
		map.put("delSuccess", delSuccess);
		return map;
	}
	
	
	
}
