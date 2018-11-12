package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.ToolBikes;
import cn.edu.swpu.met.stuteam.pojo.ToolBikesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolBikesMapper {
    int countByExample(ToolBikesExample example);

    int deleteByExample(ToolBikesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolBikes record);

    int insertSelective(ToolBikes record);

    List<ToolBikes> selectByExample(ToolBikesExample example);

    ToolBikes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToolBikes record, @Param("example") ToolBikesExample example);

    int updateByExample(@Param("record") ToolBikes record, @Param("example") ToolBikesExample example);

    int updateByPrimaryKeySelective(ToolBikes record);

    int updateByPrimaryKey(ToolBikes record);
}