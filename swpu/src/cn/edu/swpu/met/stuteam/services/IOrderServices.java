package cn.edu.swpu.met.stuteam.services;

import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.Ordertable;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryOrderVo;

/**
 * @ClassName: IOrderServices
 * @Description: TODO
 * @author: ���
 * @date:2018��3��18�� ����10:22:04
 * @version :1.0
 * 
 */
public interface IOrderServices {
	
	/**
	 * ���һ������
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
	 * ��ҳ��ѯ����
	 * @Title: selectPageBy 
	 * @Description: TODO 
	 * @param @param vo
	 * @param @return   
	 * @return Page<Ordertable>    
	 * @throws
	 */
	Page<Ordertable> selectPageBy(QueryOrderVo vo);
	
	
	/**
	 * �����û���ID��ѯ���û�
	 * @Title: selectManageById 
	 * @Description: TODO 
	 * @param @param id
	 * @param @return   
	 * @return Manage    
	 * @throws
	 */
	Manage selectManageById(String id);
	
	
	/**
	 * �����������ֶ�
	 * @Title: cleanChudanInfo 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean cleanChudanInfo(String orderId);
	
	
	/**
	 * ��ӳ�������Ϣ
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
	 * ����ID��ѯ����
	 * @Title: selectOrderById 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return Ordertable    
	 * @throws
	 */
	Ordertable selectOrderById(String orderId);
	
	/**
	 * �����깤
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
	 * ���¹���
	 * @Title: updateOrder 
	 * @Description: TODO 
	 * @param @param order
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean updateOrder(Ordertable order, String changeBy);
	
	
	/**
	 * ��ѯ��Ҫ�޸ĵĹ���
	 * @Title: selectOrderByIdToUpdate 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return Ordertable    
	 * @throws
	 */
	Ordertable selectOrderByIdToUpdate(String orderId);
	
	
	/**
	 * ɾ�������Ĵӱ�
	 * @Title: deleteOrderEndsByTabId 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return int    
	 * @throws
	 */
	int deleteOrderEndsByTabId(String  orderId);
	
	/**
	 * ɾ������
	 * @Title: deleteOredrById 
	 * @Description: TODO 
	 * @param @param orderId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean deleteOredrById(String orderId);

}
