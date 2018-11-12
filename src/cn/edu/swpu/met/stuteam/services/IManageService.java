package cn.edu.swpu.met.stuteam.services;

import java.util.List;

import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryVo;

/**
 * @ClassName: IManageService
 * @Description: TODO
 * @author: ���
 * @date:2017��12��25�� ����11:34:54
 * @version :1.0
 * 
 */
public interface IManageService {
	
	/**
	 * ����û����Ƿ���ȷ
	 * @Title: checkUserName 
	 * @Description: TODO 
	 * @param @param userId �����û���
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	public boolean checkUserName(String userId);
	
	/**
	 * �����û����������ж��û��Ƿ���Ե�½�ɹ�
	 * @Title: loginManage 
	 * @Description: TODO 
	 * @param @param userId  �û�����ѧ�ţ�
	 * @param @param userPassword �û�������
	 * @param @return   
	 * @return Manage    
	 * @throws
	 */
	public Manage loginManage(String userId, String userPassword);
	
	/**
	 * ��ȡ���еĳ�Ա��Ϣ
	 * @Title: getAllManage 
	 * @Description: TODO 
	 * @param @return   
	 * @return List<Manage>    
	 * @throws
	 */
	public List<Manage> getAllManage();
	
	
	/**
	 * ���һ���µ��û�
	 * @Title: addManage 
	 * @Description: TODO 
	 * @param @param manage ������һ��Manage����
	 * @param @return   
	 * @return boolean   ��������Ƿ�ɹ� 
	 * @throws
	 */
	public boolean addManage(Manage manage);
	
	
	/**
	 * �����û���ID��ѯ�û�
	 * @Title: queryManageById 
	 * @Description: TODO 
	 * @param @param id
	 * @param @return   
	 * @return Manage    
	 * @throws
	 */
	public Manage queryManageById(String id);
	
	
	/**
	 * �޸��û�����Ϣ
	 * @Title: updateManage 
	 * @Description: TODO 
	 * @param @param manage
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	public boolean updateManage(Manage manage);
	
	
	/**
	 * ����IDɾ���û�
	 * @Title: deleteManage 
	 * @Description: TODO 
	 * @param @param id
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	public boolean deleteManage(String id);
	
	
	/**
	 * �����������з�ҳ��ѯ �������ڰ�װ��QueryVo��
	 * @Title: selectPageBy 
	 * @Description: TODO 
	 * @param @param vo
	 * @param @return   
	 * @return Page<Manage>    
	 * @throws
	 */
	public Page<Manage> selectPageBy(QueryVo vo);
}
