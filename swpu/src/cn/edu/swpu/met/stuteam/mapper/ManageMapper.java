package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.ManageExample;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface ManageMapper {
    int countByExample(ManageExample example);

    int deleteByExample(ManageExample example);

    int deleteByPrimaryKey(String id);

    int insert(Manage record);

    int insertSelective(Manage record);

    List<Manage> selectByExample(ManageExample example);

    Manage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByExample(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByPrimaryKeySelective(Manage record);

    int updateByPrimaryKey(Manage record);
    
    /**
     * ∑÷“≥≤È—Ø
     * @Title: selectPageByQueryVo 
     * @Description: TODO 
     * @param @param vo
     * @param @return   
     * @return List<Manage>    
     * @throws
     */
	List<Manage> selectPageByQueryVo(QueryVo vo);
    
    
}