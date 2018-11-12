package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.ManageSignKeys;
import cn.edu.swpu.met.stuteam.pojo.ManageSignKeysExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ManageSignKeysMapper {
    int countByExample(ManageSignKeysExample example);

    int deleteByExample(ManageSignKeysExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManageSignKeys record);

    int insertSelective(ManageSignKeys record);

    List<ManageSignKeys> selectByExample(ManageSignKeysExample example);

    ManageSignKeys selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManageSignKeys record, @Param("example") ManageSignKeysExample example);

    int updateByExample(@Param("record") ManageSignKeys record, @Param("example") ManageSignKeysExample example);

    int updateByPrimaryKeySelective(ManageSignKeys record);

    int updateByPrimaryKey(ManageSignKeys record);
    
    List<ManageSignKeys> selectBySignTableId(String signTableId);
}