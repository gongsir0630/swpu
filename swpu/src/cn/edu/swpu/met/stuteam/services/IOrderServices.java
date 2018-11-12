package cn.edu.swpu.met.stuteam.services;

import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.Ordertable;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryOrderVo;

/**
 * @ClassName: IOrderServices
 * @Description: TODO
 * @author: 朱军
 * @date:2018年3月18日 下午10:22:04
 * @version :1.0
 * 
 */
public interface IOrderServices {
	
	/**
	 * 添加一条工单
	 * @Title: addSign 
	 * @Description: TODO 
	 * @param @param order
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean addSign(Ordertable order);
	
	/**
	 * 
	 * @Title: selectUnfinishOrder 
	 * @Description: TODO 
	 * @param @param vo
	 * @param @return   
	 * @return Page<Ordertable>    
	 * @throws
	 */
	Page<Ordertable> selectUnfinishOrder(QueryOrderVo vo);
	
	/**
	 * 分页查询工单
	 * @Title: selectPageBy 
	 * @Description: TODO 
	 * @param @param vo
	 * @param @return   
	 * @return Page<Ordertable>    
	 * @throws
	 */
	Page<Ordertable> selectPageBy(QueryOrderVo vo);
	
	
	/**
	 * 根据用户的ID查询出用户
	 * @Title: selectManageById 
	 * @Description: TODO 
	 * @param @param id
	 * @param @return   
	 * @return Manage    
	 * @throws
	 */
	Manage selectManageById(String id);
	
	
	/**
	 * 清除出单相关字段
	 * @Title: cleanChudanInfo 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean cleanChudanInfo(String orderId);
	
	
	/**
	 * 添加出单的信息
	 * @Title: addChudanInfo 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @param realname
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean addChudanInfo(String orderId, String realname);
	
	/**
	 * 根据ID查询工单
	 * @Title: selectOrderById 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return Ordertable    
	 * @throws
	 */
	Ordertable selectOrderById(String orderId);
	
	/**
	 * 工单完工
	 * @Title: finish 
	 * @Description: TODO 
	 * @param @param order
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean finish(Ordertable order);
	
	/**
	 * @param changeBy 
	 * 更新工单
	 * @Title: updateOrder 
	 * @Description: TODO 
	 * @param @param order
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean updateOrder(Ordertable order, String changeBy);
	
	
	/**
	 * 查询需要修改的工单
	 * @Title: selectOrderByIdToUpdate 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return Ordertable    
	 * @throws
	 */
	Ordertable selectOrderByIdToUpdate(String orderId);
	
	
	/**
	 * 删除工单的从表
	 * @Title: deleteOrderEndsByTabId 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return int    
	 * @throws
	 */
	int deleteOrderEndsByTabId(String  orderId);
	
	/**
	 * 删除工单
	 * @Title: deleteOredrById 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean deleteOredrById(String orderId);

}
