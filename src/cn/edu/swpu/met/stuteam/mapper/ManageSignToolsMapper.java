package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.ManageSignTools;
import cn.edu.swpu.met.stuteam.pojo.ManageSignToolsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ManageSignToolsMapper {
    int countByExample(ManageSignToolsExample example);

    int deleteByExample(ManageSignToolsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManageSignTools record);

    int insertSelective(ManageSignTools record);

    List<ManageSignTools> selectByExample(ManageSignToolsExample example);

    ManageSignTools selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManageSignTools record, @Param("example") ManageSignToolsExample example);

    int updateByExample(@Param("record") ManageSignTools record, @Param("example") ManageSignToolsExample example);

    int updateByPrimaryKeySelective(ManageSignTools record);

    int updateByPrimaryKey(ManageSignTools record);
    
    List<ManageSignTools> selectBySignTableId(String signTableId);
}