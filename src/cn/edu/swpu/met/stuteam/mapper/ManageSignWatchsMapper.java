package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.ManageSignWatchs;
import cn.edu.swpu.met.stuteam.pojo.ManageSignWatchsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ManageSignWatchsMapper {
    int countByExample(ManageSignWatchsExample example);

    int deleteByExample(ManageSignWatchsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManageSignWatchs record);

    int insertSelective(ManageSignWatchs record);

    List<ManageSignWatchs> selectByExample(ManageSignWatchsExample example);

    ManageSignWatchs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManageSignWatchs record, @Param("example") ManageSignWatchsExample example);

    int updateByExample(@Param("record") ManageSignWatchs record, @Param("example") ManageSignWatchsExample example);

    int updateByPrimaryKeySelective(ManageSignWatchs record);

    int updateByPrimaryKey(ManageSignWatchs record);
    
    List<ManageSignWatchs> selectBySignTableId(String signTableId);
}