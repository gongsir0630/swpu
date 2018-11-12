package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.ManageSignBikes;
import cn.edu.swpu.met.stuteam.pojo.ManageSignBikesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageSignBikesMapper {
    int countByExample(ManageSignBikesExample example);

    int deleteByExample(ManageSignBikesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManageSignBikes record);

    int insertSelective(ManageSignBikes record);

    List<ManageSignBikes> selectByExample(ManageSignBikesExample example);

    ManageSignBikes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManageSignBikes record, @Param("example") ManageSignBikesExample example);

    int updateByExample(@Param("record") ManageSignBikes record, @Param("example") ManageSignBikesExample example);

    int updateByPrimaryKeySelective(ManageSignBikes record);

    int updateByPrimaryKey(ManageSignBikes record);
    
    List<ManageSignBikes> selectBySignTableId(String signTableId);
}