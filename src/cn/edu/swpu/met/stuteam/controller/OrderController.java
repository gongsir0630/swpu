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
 * @author: ���
 * @date:2018��3��18�� ����10:18:18
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
	 * ȥ�����ҳ�棬��ѯ�����е�ֵ���ұ�����Ա
	 * @Title: toOrderAdd 
	 * @Description: TODO 
	 * @param @param model
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "toOrderAdd.action")
	public String toOrderAdd(Model model){
		//��ѯ�����е�ֵ����Ա��Ϊ�ɵ��ˣ�����ǳ���ֵ������������ɵ����ڱ�ע��˵����
		List<Manage> allManage = manageService.getAllManage();
		model.addAttribute("allManage",allManage);
		return "orderAdd";
	}
	
	/**
	 * ��Ӷ����ķ���
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
	 * �鿴δ�깤�Ĺ��������������ɹ��Ĺ�����
	 * @Title: showUnfinishOrder 
	 * @Description: TODO 
	 * @param @param model
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@RequestMapping(value = "showUnfinishOrder.action")
	public String showUnfinishOrder(Model model,QueryOrderVo vo){
		vo.setCondition(0);//����0��ʾ��ѯ��Ϊ�깤�Ĺ���
		vo.setSize(5);
		Page<Ordertable> page = ordeService.selectUnfinishOrder(vo);
		model.addAttribute("page", page);
		List<Manage> allManage = manageService.getAllManage();
		model.addAttribute("allManage", allManage);
		return "orderUnfinishList";
	}
	
	/**
	 * ���ȡ��������ɾ��������Ϣ
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
	 * �����������ӳ�����Ϣ
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
	 * ����깤��ť����η���
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
		//��ѯ����������Ϣ��Ϊҳ����ʾ
		List<Manage> allManage = manageService.getAllManage();
		Ordertable order = ordeService.selectOrderById(orderId);
		model.addAttribute("allManage", allManage);
		model.addAttribute("order", order);
		return "orderFinish";
	}
	
	
	/**
	 *  �ύ�깤��
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
	 * ��ҳ��ѯ���еĹ���
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
	 * ����޸Ĺ�����ť�����޸�ҳ��
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
	 * ���¹���
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
	 * ɾ������
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
