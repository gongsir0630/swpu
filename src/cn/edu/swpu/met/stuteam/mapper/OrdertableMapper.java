package cn.edu.swpu.met.stuteam.mapper;

import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.Ordertable;
import cn.edu.swpu.met.stuteam.pojo.OrdertableExample;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryOrderVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrdertableMapper {
    int countByExample(OrdertableExample example);

    int deleteByExample(OrdertableExample example);

    int deleteByPrimaryKey(String id);

    int insert(Ordertable record);

    int insertSelective(Ordertable record);

    List<Ordertable> selectByExample(OrdertableExample example);

    Ordertable selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Ordertable record, @Param("example") OrdertableExample example);

    int updateByExample(@Param("record") Ordertable record, @Param("example") OrdertableExample example);

    int updateByPrimaryKeySelective(Ordertable record);

    int updateByPrimaryKey(Ordertable record);
    
    /**
	 * ����ѧ�Ų�ѯ����
	 * @Title: selectManageByPrimaryKey 
	 * @Description: TODO 
	 * @param @param id
	 * @param @return   
	 * @return Manage    
	 * @throws
	 */
	Manage selectManageByPrimaryKey(String id);
	
	/**
	 * ���������з�ҳ��ѯ
	 * @Title: selectPageByQueryVo 
	 * @Description: TODO 
	 * @param @param vo
	 * @param @return   
	 * @return List<Ordertable>    
	 * @throws
	 */
	List<Ordertable> selectPageByQueryVo(QueryOrderVo vo);
	
	/**
	 * ��ҳ��ѯδ�깤����
	 * @Title: selectUnfishiOrderByLimit 
	 * @Description: TODO 
	 * @param @return   
	 * @return List<Ordertable>    
	 * @throws
	 */
	List<Ordertable> selectUnfishiOrderByLimit(QueryOrderVo vo);
}