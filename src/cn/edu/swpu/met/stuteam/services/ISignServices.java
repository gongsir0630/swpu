package cn.edu.swpu.met.stuteam.services;

import java.util.List;

import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.pojo.ManageSign;
import cn.edu.swpu.met.stuteam.pojo.ToolBikes;
import cn.edu.swpu.met.stuteam.pojo.ToolKeys;
import cn.edu.swpu.met.stuteam.pojo.ToolTools;
import cn.edu.swpu.met.stuteam.pojo.vo.QuerySignVo;

/**
 * @ClassName: ISignServices
 * @Description: TODO
 * @author: ���
 * @date:2018��1��6�� ����7:13:48
 * @version :1.0
 * 
 */
public interface ISignServices {

	List<ToolTools> getAllTools();

	List<ToolKeys> getAllKeys();

	List<ToolBikes> getAllBikes();

	boolean addsign(ManageSign manageSign);
	
	
	/**
	 * @return 
	 * ��ȡǩ���������һ�����ݣ�Ȼ����ݲ�ѯ������ID���дӱ��ѯ
	 * @Title: getLastSign 
	 * @Description: TODO 
	 * @param    
	 * @return void    
	 * @throws
	 */
	ManageSign getLastSign();
	
	
	/**
	 * ��ǩ�������ȷ��ǩ���˵�����
	 * @Title: updateConfireName 
	 * @Description: TODO 
	 * @param @param signTableId
	 * @param @param confirmname
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean updateConfirmName(String signTableId, String confirmname);
	
	
	/**
	 * ����ID��ѯǩ������Ϣ
	 * @Title: getSignById 
	 * @Description: TODO 
	 * @param @param signTableId   
	 * @return void    
	 * @throws
	 */
	ManageSign getSignById(String signTableId);
	
	
	/**
	 * ����IDɾ��һ��ǩ������Ϣ
	 * @Title: deleteManageSignById 
	 * @Description: TODO 
	 * @param @param signTableId
	 * @param @return   
	 * @return int    
	 * @throws
	 */
	int deleteManageSignById(String signTableId);
	
	
	/**
	 * ɾ��ĳ��ǩ����Ĵӱ���Ϣ  Bikes Keys Tools Watchs
	 * @Title: deleteSignBYTW
	 * @Description: TODO 
	 * @param @param signTableId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean deleteSignBYTW(String signTableId);

	
	/**
	 * ����������ѯ����ҳ����Ϣ
	 * @Title: selectSignByVo 
	 * @Description: TODO 
	 * @param @param querySign
	 * @param @return   
	 * @return Page<ManageSign>    
	 * @throws
	 */
	Page<ManageSign> selectSignByVo(QuerySignVo querySign);
	
	
	/**
	 * ɾ��ǩ����
	 * @Title: deleteSign 
	 * @Description: TODO 
	 * @param @param signId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean deleteSign(String signId);
	
	
	/**
	 * ��ѯǩ�����¼����������ʹӱ�ļ�¼
	 * @Title: getCompleteSignById 
	 * @Description: TODO 
	 * @param @param signId
	 * @param @return   
	 * @return ManageSign    
	 * @throws
	 */
	ManageSign getCompleteSignById(String signId);
	
	/**
	 * ����һ��ǩ���������ʹӱ�
	 * @Title: updateManageSignById 
	 * @Description: TODO 
	 * @param @param signTableId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean updateManageSignById(ManageSign manageSign);


}
