package cn.edu.swpu.met.stuteam.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.swpu.met.common.util.CommonsUtils;
import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.mapper.ManageMapper;
import cn.edu.swpu.met.stuteam.mapper.OrderendMapper;
import cn.edu.swpu.met.stuteam.mapper.OrdertableMapper;
import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.Orderend;
import cn.edu.swpu.met.stuteam.pojo.OrderendExample;
import cn.edu.swpu.met.stuteam.pojo.Ordertable;
import cn.edu.swpu.met.stuteam.pojo.OrdertableExample;
import cn.edu.swpu.met.stuteam.pojo.OrdertableExample.Criteria;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryOrderVo;



/**
 * @ClassName: OrderServicesImpl
 * @Description: TODO
 * @author: 朱军
 * @date:2018年3月18日 下午10:23:17
 * @version :1.0
 * 
 */
@Service
public class OrderServicesImpl implements IOrderServices{
	
	@Resource(name = "ordertableMapper")
	private OrdertableMapper ordertableMapper;
	
	@Resource(name="manageMapper")
	private ManageMapper manageMapper;
	
	@Resource(name="orderendMapper")
	private OrderendMapper orderendMapper;

	@Override
	public boolean addSign(Ordertable order) {
		// TODO Auto-generated method stub
		//设置ID和状态
		DateFormat dFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		//添加工单的同时根据派单人的学号查询出牌单人的真实姓名
		order.setStartnamestring(selectManageById(order.getStartname()).getRealname());
		order.setStation(1);
		order.setId(dFormat.format(order.getStarttime()));
		int rows = ordertableMapper.insert(order);
		return rows>0?true:false;
	}

	@Override
	public Page<Ordertable> selectUnfinishOrder(QueryOrderVo vo) {
		// TODO Auto-generated method stub
		Page<Ordertable> page = new Page<Ordertable>();
		OrdertableExample example = new OrdertableExample();
		Criteria criteria = example.createCriteria();
		criteria.andStationNotEqualTo(3);//3代表已经完工的工单
		if (vo != null) {
			page.setSize(vo.getSize());
			//设置分页查询的起点
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
		}
		page.setTotal(ordertableMapper.countByExample(example));
		List<Ordertable> orders =  ordertableMapper.selectUnfishiOrderByLimit(vo);
		List<Ordertable> orders1 =  new ArrayList<>();
		for (Ordertable o : orders) {
			String manageId = o.getChudanren();
			if (manageId != null) {//添加出单人的信息
				o.setChudan(selectManageById(manageId));
			}
			if (o.getStation() == 2) {//如果是正在出单的工单 计算出单时间
				o.setDateDiff(CommonsUtils.getDateDifferent(new Date(), o.getChudandate()));
			}
			orders1.add(o);
		}
		page.setRows(orders1);
		return page;
	}
	
	@Override
	public Page<Ordertable> selectPageBy(QueryOrderVo vo) {
		// TODO Auto-generated method stub
		String selectString = vo.getSelectString();
		//1.创建分页对象
		Page<Ordertable> page = new Page<Ordertable>();
		//定义条件对象
		OrdertableExample example = new OrdertableExample();
		Criteria criteria = example.createCriteria();
		if (vo != null) {
			page.setSize(vo.getSize());
			//设置分页查询的起点
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if (vo.getCondition() == null || vo.getSelectString() == null) {//如果没有条件则查询出所有
				
			}else {
				switch (vo.getCondition()) {
				case 1:
					criteria.andIdLike(selectString);
					vo.setId(selectString);
					break;
				case 2:
					criteria.andAddressLike(selectString);
					vo.setAddress(selectString);
					break;
				case 3:
					
					criteria.andUserphoneLike(selectString);
					vo.setUserphone(selectString);
					break;
				case 4:
					criteria.andDescriptionLike(selectString);
					vo.setDescription(selectString);
					break;
				case 5:
					criteria.andStartnamestringLike(selectString);
					vo.setStartNameString(selectString);
					break;
				case 6:
					criteria.andReasonLike(selectString);
					vo.setReason(selectString);
					break;
				case 7:
					criteria.andSolveLike(selectString);
					vo.setSolve(selectString);
					break;
				case 8:
					criteria.andRecordnameLike(selectString);
					vo.setRecordName(selectString);
					break;
				case 9:
					criteria.andTabletypeEqualTo(Integer.parseInt(selectString));
					vo.setTabletype(Integer.parseInt(selectString));
					break;
				default:
					break;
				}
			}
		}
		//查询符合条件的记录总条数
		page.setTotal(ordertableMapper.countByExample(example));
		List<Ordertable> befList = ordertableMapper.selectPageByQueryVo(vo);
		List<Ordertable> endList = new ArrayList<>();
		for (Ordertable order : befList) {
			String orderId = order.getId();
			List<Orderend> ends = orderendMapper.selectByOne2One(orderId);
			order.setOrderends(ends);
			endList.add(order);
		}
		System.out.println("查询出来的结果："+endList.toString());
		page.setRows(endList);

		return page;
	}
	
	@Override
	public Manage selectManageById(String id) {
		return ordertableMapper.selectManageByPrimaryKey(id);
	}

	@Override
	public boolean cleanChudanInfo(String orderId) {
		// TODO Auto-generated method stub
		Ordertable order = ordertableMapper.selectByPrimaryKey(orderId);
		order.setChudan(null);
		order.setChudandate(null);
		order.setChudandatesString(null);
		order.setChudanname(null);
		order.setChudanren(null);
		order.setStation(1);
		//更新工单
		return ordertableMapper.updateByPrimaryKey(order)>0?true:false;
	}

	@Override
	public boolean addChudanInfo(String orderId, String realname) {
		// TODO Auto-generated method stub
		Manage manage = selectManageById(realname);
		Ordertable order = ordertableMapper.selectByPrimaryKey(orderId);
		order.setChudan(manage);
		order.setChudandate(new Date());
		order.setChudanname(manage.getRealname());
		order.setChudanren(realname);
		order.setStation(2);//更改工单的状态   未派工---到---派工
		return ordertableMapper.updateByPrimaryKeySelective(order)>0?true:false;
	}

	@Override
	public Ordertable selectOrderById(String orderId) {
		// TODO Auto-generated method stub
		return ordertableMapper.selectByPrimaryKey(orderId);
	}

	@Override
	public boolean finish(Ordertable order) {
		// TODO Auto-generated method stub
		System.out.println(order.toString());
		//进行对象的整合
		String orderId = order.getId();
		//1,查询出表中已有字段
		Ordertable tableOrder = selectOrderById(orderId);
		tableOrder.setStation(3);
		tableOrder.setRecordman(order.getRecordman());
		tableOrder.setRecordname(selectManageById(order.getRecordman()).getRealname());
		tableOrder.setEndtime(order.getEndtime());
		tableOrder.setReason(order.getReason());
		tableOrder.setSolve(order.getSolve());
		tableOrder.setDuankou(order.getDuankou());
		tableOrder.setShuijingtou(order.getShuijingtou());
		tableOrder.setMianban(order.getMianban());
		tableOrder.setWangxian(order.getWangxian());
		if (order.getUsername() != null) {
			tableOrder.setUsername(order.getUsername());
		}
		//在完工人从表添加完工人
		String[] ends = order.getEndIds();
		for (String id : ends) {
			Orderend orderend = new Orderend(orderId, id);
			orderendMapper.insert(orderend);
		}
		//更新工单
		int row = ordertableMapper.updateByPrimaryKeySelective(tableOrder);
		return row>0?true:false;
	}

	@Override
	public boolean updateOrder(Ordertable order, String changeby ) {
		// TODO Auto-generated method stub
		String orderId = order.getId();
		//给工单添加修改人信息
		Date date = new Date();
		order.setChangedate(date);
		order.setChangeby(changeby);
		order.setChangenamestring(selectManageById(changeby).getRealname());
		//删除对应的从表
		deleteOrderEndsByTabId(orderId);
		//重新添加从表
		String[] endIds = order.getEndIds();
		for (String id : endIds) {
			Orderend orderend = new Orderend(orderId, id);
			orderendMapper.insert(orderend);
		}
		//修改工单
		int rows = ordertableMapper.updateByPrimaryKeySelective(order);
		return rows>0?true:false;
	}

	@Override
	public Ordertable selectOrderByIdToUpdate(String orderId) {
		// TODO Auto-generated method stub
		Ordertable order = selectOrderById(orderId);
		order.setOrderends(orderendMapper.selectByOne2One(orderId));
		System.out.println("需要修改的Order="+order);
		return order;
	}

	@Override
	public int deleteOrderEndsByTabId(String orderId) {
		// TODO Auto-generated method stub
		OrderendExample example = new OrderendExample();
		example.createCriteria().andOrderidEqualTo(orderId);
		return orderendMapper.deleteByExample(example);
	}

	@Override
	public boolean deleteOredrById(String orderId) {
		// TODO Auto-generated method stub
		//删除主表信息
		int rows = deleteOrderEndsByTabId(orderId);
		//删除从表信息
		int rows1 = ordertableMapper.deleteByPrimaryKey(orderId);
		return (rows > 0 && rows1 > 0)?true:false;
	}
}
