package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.ToolTools;
import cn.edu.swpu.met.stuteam.pojo.ToolToolsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolToolsMapper {
    int countByExample(ToolToolsExample example);

    int deleteByExample(ToolToolsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolTools record);

    int insertSelective(ToolTools record);

    List<ToolTools> selectByExample(ToolToolsExample example);

    ToolTools selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToolTools record, @Param("example") ToolToolsExample example);

    int updateByExample(@Param("record") ToolTools record, @Param("example") ToolToolsExample example);

    int updateByPrimaryKeySelective(ToolTools record);

    int updateByPrimaryKey(ToolTools record);
}