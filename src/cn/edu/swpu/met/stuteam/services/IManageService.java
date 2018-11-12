package cn.edu.swpu.met.stuteam.services;

import java.util.List;

import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryVo;

/**
 * @ClassName: IManageService
 * @Description: TODO
 * @author: 朱军
 * @date:2017年12月25日 上午11:34:54
 * @version :1.0
 * 
 */
public interface IManageService {
	
	/**
	 * 检查用户名是否正确
	 * @Title: checkUserName 
	 * @Description: TODO 
	 * @param @param userId 输入用户名
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	public boolean checkUserName(String userId);
	
	/**
	 * 根据用户名和密码判断用户是否可以登陆成功
	 * @Title: loginManage 
	 * @Description: TODO 
	 * @param @param userId  用户名（学号）
	 * @param @param userPassword 用户的密码
	 * @param @return   
	 * @return Manage    
	 * @throws
	 */
	public Manage loginManage(String userId, String userPassword);
	
	/**
	 * 获取所有的成员信息
	 * @Title: getAllManage 
	 * @Description: TODO 
	 * @param @return   
	 * @return List<Manage>    
	 * @throws
	 */
	public List<Manage> getAllManage();
	
	
	/**
	 * 添加一个新的用户
	 * @Title: addManage 
	 * @Description: TODO 
	 * @param @param manage 传如有一个Manage对象
	 * @param @return   
	 * @return boolean   返回添加是否成功 
	 * @throws
	 */
	public boolean addManage(Manage manage);
	
	
	/**
	 * 根据用户的ID查询用户
	 * @Title: queryManageById 
	 * @Description: TODO 
	 * @param @param id
	 * @param @return   
	 * @return Manage    
	 * @throws
	 */
	public Manage queryManageById(String id);
	
	
	/**
	 * 修改用户的信息
	 * @Title: updateManage 
	 * @Description: TODO 
	 * @param @param manage
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	public boolean updateManage(Manage manage);
	
	
	/**
	 * 根据ID删除用户
	 * @Title: deleteManage 
	 * @Description: TODO 
	 * @param @param id
	 * @param @return   
	 * @return boolean    
	 * @throws
	 */
	public boolean deleteManage(String id);
	
	
	/**
	 * 根据条件进行分页查询 条件放在包装类QueryVo中
	 * @Title: selectPageBy 
	 * @Description: TODO 
	 * @param @param vo
	 * @param @return   
	 * @return Page<Manage>    
	 * @throws
	 */
	public Page<Manage> selectPageBy(QueryVo vo);
}
