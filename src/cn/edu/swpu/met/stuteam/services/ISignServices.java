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
 * @author: 朱军
 * @date:2018年1月6日 下午7:13:48
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
	 * 获取签到表中最后一条数据，然后根据查询出来的ID进行从表查询
	 * @Title: getLastSign 
	 * @Description: TODO 
	 * @param    
	 * @return void    
	 * @throws
	 */
	ManageSign getLastSign();
	
	
	/**
	 * 给签到表添加确认签字人的名字
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
	 * 根据ID查询签到表信息
	 * @Title: getSignById 
	 * @Description: TODO 
	 * @param @param signTableId   
	 * @return void    
	 * @throws
	 */
	ManageSign getSignById(String signTableId);
	
	
	/**
	 * 根据ID删除一条签到表信息
	 * @Title: deleteManageSignById 
	 * @Description: TODO 
	 * @param @param signTableId
	 * @param @return   
	 * @return int    
	 * @throws
	 */
	int deleteManageSignById(String signTableId);
	
	
	/**
	 * 删除某条签到表的从表信息  Bikes Keys Tools Watchs
	 * @Title: deleteSignBYTW
	 * @Description: TODO 
	 * @param @param signTableId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean deleteSignBYTW(String signTableId);

	
	/**
	 * 根据条件查询出分页的信息
	 * @Title: selectSignByVo 
	 * @Description: TODO 
	 * @param @param querySign
	 * @param @return   
	 * @return Page<ManageSign>    
	 * @throws
	 */
	Page<ManageSign> selectSignByVo(QuerySignVo querySign);
	
	
	/**
	 * 删除签到表
	 * @Title: deleteSign 
	 * @Description: TODO 
	 * @param @param signId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean deleteSign(String signId);
	
	
	/**
	 * 查询签到表记录，包括主表和从表的记录
	 * @Title: getCompleteSignById 
	 * @Description: TODO 
	 * @param @param signId
	 * @param @return   
	 * @return ManageSign    
	 * @throws
	 */
	ManageSign getCompleteSignById(String signId);
	
	/**
	 * 跟新一个签到表的主表和从表
	 * @Title: updateManageSignById 
	 * @Description: TODO 
	 * @param @param signTableId
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	boolean updateManageSignById(ManageSign manageSign);


}
