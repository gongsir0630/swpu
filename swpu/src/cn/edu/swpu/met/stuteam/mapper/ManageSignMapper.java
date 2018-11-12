package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.ManageSign;
import cn.edu.swpu.met.stuteam.pojo.ManageSignExample;
import cn.edu.swpu.met.stuteam.pojo.vo.QuerySignVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ManageSignMapper {
    int countByExample(ManageSignExample example);

    int deleteByExample(ManageSignExample example);

    int deleteByPrimaryKey(String id);

    int insert(ManageSign record);

    int insertSelective(ManageSign record);

    List<ManageSign> selectByExample(ManageSignExample example);

    ManageSign selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ManageSign record, @Param("example") ManageSignExample example);

    int updateByExample(@Param("record") ManageSign record, @Param("example") ManageSignExample example);

    int updateByPrimaryKeySelective(ManageSign record);

    int updateByPrimaryKey(ManageSign record);
    
    ManageSign selectLastSign();
    
    //注解实现多参数入参
	int updateConfirmName(@Param("id")String signTableId, @Param("confirmname")String confirmname);
	
	/**
	 * 按条件进行分页查询
	 * @Title: selectPageByQueryVo 
	 * @Description: TODO 
	 * @param @param vo
	 * @param @return   
	 * @return List<ManageSign>    
	 * @throws
	 */
	List<ManageSign> selectPageByQueryVo(QuerySignVo vo);
}