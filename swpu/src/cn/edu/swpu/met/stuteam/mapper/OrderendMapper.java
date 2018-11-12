package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.Orderend;
import cn.edu.swpu.met.stuteam.pojo.OrderendExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderendMapper {
    int countByExample(OrderendExample example);

    int deleteByExample(OrderendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orderend record);

    int insertSelective(Orderend record);

    List<Orderend> selectByExample(OrderendExample example);

    Orderend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orderend record, @Param("example") OrderendExample example);

    int updateByExample(@Param("record") Orderend record, @Param("example") OrderendExample example);

    int updateByPrimaryKeySelective(Orderend record);

    int updateByPrimaryKey(Orderend record);
    
    /**
     * 一对一查询从表
     * @Title: selectByOne2One 
     * @Description: TODO 
     * @param @param orderId
     * @param @return   
     * @return List<Orderend>    
     * @throws
     */
	List<Orderend> selectByOne2One(String orderId);
}