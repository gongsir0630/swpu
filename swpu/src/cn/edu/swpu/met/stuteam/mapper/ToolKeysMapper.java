package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.ToolKeys;
import cn.edu.swpu.met.stuteam.pojo.ToolKeysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolKeysMapper {
    int countByExample(ToolKeysExample example);

    int deleteByExample(ToolKeysExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolKeys record);

    int insertSelective(ToolKeys record);

    List<ToolKeys> selectByExample(ToolKeysExample example);

    ToolKeys selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToolKeys record, @Param("example") ToolKeysExample example);

    int updateByExample(@Param("record") ToolKeys record, @Param("example") ToolKeysExample example);

    int updateByPrimaryKeySelective(ToolKeys record);

    int updateByPrimaryKey(ToolKeys record);
}