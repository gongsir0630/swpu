package cn.edu.swpu.met.stuteam.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.mapper.ManageSignBikesMapper;
import cn.edu.swpu.met.stuteam.mapper.ManageSignKeysMapper;
import cn.edu.swpu.met.stuteam.mapper.ManageSignMapper;
import cn.edu.swpu.met.stuteam.mapper.ManageSignToolsMapper;
import cn.edu.swpu.met.stuteam.mapper.ManageSignWatchsMapper;
import cn.edu.swpu.met.stuteam.mapper.ToolBikesMapper;
import cn.edu.swpu.met.stuteam.mapper.ToolKeysMapper;
import cn.edu.swpu.met.stuteam.mapper.ToolToolsMapper;
import cn.edu.swpu.met.stuteam.pojo.ManageSign;
import cn.edu.swpu.met.stuteam.pojo.ManageSignBikes;
import cn.edu.swpu.met.stuteam.pojo.ManageSignBikesExample;
import cn.edu.swpu.met.stuteam.pojo.ManageSignExample;
import cn.edu.swpu.met.stuteam.pojo.ManageSignExample.Criteria;
import cn.edu.swpu.met.stuteam.pojo.ManageSignKeys;
import cn.edu.swpu.met.stuteam.pojo.ManageSignKeysExample;
import cn.edu.swpu.met.stuteam.pojo.ManageSignTools;
import cn.edu.swpu.met.stuteam.pojo.ManageSignToolsExample;
import cn.edu.swpu.met.stuteam.pojo.ManageSignWatchs;
import cn.edu.swpu.met.stuteam.pojo.ManageSignWatchsExample;
import cn.edu.swpu.met.stuteam.pojo.ToolBikes;
import cn.edu.swpu.met.stuteam.pojo.ToolBikesExample;
import cn.edu.swpu.met.stuteam.pojo.ToolKeys;
import cn.edu.swpu.met.stuteam.pojo.ToolKeysExample;
import cn.edu.swpu.met.stuteam.pojo.ToolTools;
import cn.edu.swpu.met.stuteam.pojo.ToolToolsExample;
import cn.edu.swpu.met.stuteam.pojo.vo.QuerySignVo;

/**
 * @ClassName: SignServicesImpl
 * @Description: TODO
 * @author: 朱军
 * @date:2018年1月6日 下午7:15:14
 * @version :1.0
 * 
 */
@Service
public class SignServicesImpl implements ISignServices {
	
	@Autowired
	private IManageService manageService;
	
	@Resource(name = "manageSignMapper")
	private ManageSignMapper  manageSignMapper;
	
	@Resource(name = "toolBikesMapper")
	private ToolBikesMapper toolBikesMapper;
	
	@Resource(name = "toolKeysMapper")
	private ToolKeysMapper  toolKeysMapper;
	
	@Resource(name = "toolToolsMapper")
	private ToolToolsMapper  toolToolsMapper;
	
	@Resource(name = "manageSignKeysMapper")
	private ManageSignKeysMapper manageSignKeysMapper;
	
	@Resource(name = "manageSignToolsMapper")
	private ManageSignToolsMapper manageSignToolsMapper;
	
	@Resource(name = "manageSignBikesMapper")
	private ManageSignBikesMapper manageSignBikesMapper;
	
	@Resource(name = "manageSignWatchsMapper")
	private ManageSignWatchsMapper manageSignWatchsMapper;
	
	@Override
	public List<ToolTools> getAllTools() {
		// TODO Auto-generated method stub
		ToolToolsExample toolsExample = new ToolToolsExample();
		//查询所有在架的工具
		toolsExample.createCriteria().andStationEqualTo(1);
		return toolToolsMapper.selectByExample(toolsExample);
	}

	@Override
	public List<ToolKeys> getAllKeys() {
		// TODO Auto-generated method stub
		ToolKeysExample example = new ToolKeysExample();
		//查询在架的钥匙	
		example.createCriteria().andStationEqualTo(1);
		return toolKeysMapper.selectByExample(example);
	}

	@Override
	public List<ToolBikes> getAllBikes() {
		// TODO Auto-generated method stub
		ToolBikesExample example = new ToolBikesExample();
		//查询在架的自行车
		example.createCriteria().andStationEqualTo(1);
		return toolBikesMapper.selectByExample(example);
	}

	@Override
	public boolean addsign(ManageSign manageSign) {
		//System.out.println("哈哈哈"+manageSign);
		// TODO Auto-generated method stub
		String id = manageSign.getId();
		//首先添加一条主签到表信息
		int rows =  manageSignMapper.insert(manageSign);
		//添加公用自行车从表信息
		/*
		 * 1.首先查询出所有的公用自行车
		 * 2.把选中的自行车station字段设置为1，没有选中的设置为2
		 * 3.然后逐条添加
		 */
		List<ToolBikes> bikes = getAllBikes(); 
		String[] bikesId = manageSign.getBikes();
		for (ToolBikes bike : bikes) {
			//获取自行车的ID
			Integer bikeIdInt = bike.getId();
			//将int类型转成string类型
			String bikeId1 = new String(bikeIdInt+"");
			ManageSignBikes manageSignBike = new ManageSignBikes();
			manageSignBike.setBikeid(bikeId1);
			manageSignBike.setSigntableid(id);
			//进行状态的匹配
			for (String bikeId : bikesId) {
				if (bikeId.equals(bikeId1) || bikeId == bikeId1) {
					manageSignBike.setStation(1);
					break;
				}else {
					manageSignBike.setStation(2);
					continue;
				}
			}
			//将对象添加到数据库
			if (manageSignBikesMapper.insert(manageSignBike) == 0) {
				return false;
			} 
		}
		
		//添加钥匙从表
		List<ToolKeys> keys = getAllKeys();
		String[] keysId = manageSign.getKeys();
		for (ToolKeys key : keys) {
			Integer keyIdInt = key.getId();
			//将int类型转成string类型
			String keyId1 = new String(keyIdInt+"");
			ManageSignKeys manageSignKey = new ManageSignKeys();
			manageSignKey.setKeyid(keyId1);
			manageSignKey.setSigntableid(id);
			//钥匙状态匹配
			for (String keyId : keysId) {
				if (keyId.equals(keyId1) || keyId == keyId1) {
					manageSignKey.setStation(1);
					break;
				}else {
					manageSignKey.setStation(2);
					continue;
				}
			}
			//将对象添加到数据库
			if (manageSignKeysMapper.insert(manageSignKey) == 0) {
				return false;
			} 
		}
		
		
		List<ToolTools> tools = getAllTools();
		String[] toolsId = manageSign.getTools();
		for (ToolTools tool : tools) {
			Integer toolIdInt = tool.getId();
			//将int类型转成string类型
			String toolId1 = new String(toolIdInt+"");
			
			ManageSignTools manageSignTool = new ManageSignTools();
			manageSignTool.setToolid(toolId1);
			manageSignTool.setSigntable(id);
			for (String toolId : toolsId) {
				
				if (toolId.equals(toolId1) || toolId == toolId1) {
					manageSignTool.setStation(1);
					break;
				}else {
					manageSignTool.setStation(2);
					continue;
				}
			}
			//将对象添加到数据库
			if (manageSignToolsMapper.insert(manageSignTool) == 0) {
				return false;
			}
		}
		
		
		
		List<ManageSignWatchs> watchsArray = manageSign.getWatchsArray();
		for (ManageSignWatchs manageSignWatch : watchsArray) {
			if (manageSignWatchsMapper.insert(manageSignWatch) == 0) {
				return false;
			}
		}
		return rows>0?true:false;
	}

	@Override
	public ManageSign getLastSign() {
		// TODO Auto-generated method stub
		ManageSign lastSign = manageSignMapper.selectLastSign();
		if (lastSign != null) {
			//获取签到表编号进行从表查询
			String signTableId = lastSign.getId();
			//1.查询值班人员从表  这里需要一对一查询管理员的姓名
			List<ManageSignWatchs> watchs = manageSignWatchsMapper.selectBySignTableId(signTableId);
//			for (ManageSignWatchs manageSignWatchs : watchs) {
//				System.out.println(manageSignWatchs);
//			}
			lastSign.setWatchsArray(watchs); 
			//2.查询共同自行车从表   需要查询出自行车的名字
			List<ManageSignBikes> bikes = manageSignBikesMapper.selectBySignTableId(signTableId);
			lastSign.setBikesArray(bikes);
			//3.查询钥匙从表   需要查询吃钥匙的名字
			List<ManageSignKeys> keys = manageSignKeysMapper.selectBySignTableId(signTableId);
			lastSign.setKeysArray(keys); 
			//4.查询工具从表   需要查询工具的名字
			List<ManageSignTools> tools = manageSignToolsMapper.selectBySignTableId(signTableId);
			lastSign.setToolsArray(tools);
			
			//查询填写人和签字人的姓名
			//给对象的创建人名字和确认人名字属性赋值
			lastSign.setCreate(manageService.queryManageById(lastSign.getCreatename()).getRealname());
			if (lastSign.getConfirmname() != null) {
				lastSign.setConfir(manageService.queryManageById(lastSign.getConfirmname()).getRealname());
			}
		}
		
		return lastSign;
	}

	@Override
	public boolean updateConfirmName(String signTableId, String confirmname) {
		// TODO Auto-generated method stub
		int rows = manageSignMapper.updateConfirmName(signTableId, confirmname);
		return rows>0?true:false;
	}

	@Override
	public ManageSign getSignById(String signTableId) {
		// TODO Auto-generated method stub
		ManageSign sign = manageSignMapper.selectByPrimaryKey(signTableId);
		return sign;
	}

	@Override
	public int deleteManageSignById(String signTableId) {
		// TODO Auto-generated method stub
		return manageSignMapper.deleteByPrimaryKey(signTableId);
	}

	@Override
	public boolean deleteSignBYTW(String signTableId) {
		// TODO Auto-generated method stub
		ManageSignBikesExample example = new ManageSignBikesExample();
		ManageSignToolsExample example2 = new ManageSignToolsExample();
		ManageSignKeysExample example3 = new ManageSignKeysExample();
		ManageSignWatchsExample example4 = new ManageSignWatchsExample();
		
		example.createCriteria().andSigntableidEqualTo(signTableId);
		example2.createCriteria().andSigntableEqualTo(signTableId);
		example3.createCriteria().andSigntableidEqualTo(signTableId);
		example4.createCriteria().andSigntableidEqualTo(signTableId);
		
		int bike = manageSignBikesMapper.deleteByExample(example);
		int tool = manageSignKeysMapper.deleteByExample(example3);
		int key = manageSignToolsMapper.deleteByExample(example2);
		int watch = manageSignWatchsMapper.deleteByExample(example4);
		return (bike > 0 & tool  > 0 & key > 0 & watch > 0) ? true:false;
	}
	
	
	/*
	 * 分页部分实现类
	 * <p>Title: selectSignByVo</p> 
	 * <p>Description: </p> 
	 * @param querySign
	 * @return 
	 * @see cn.edu.swpu.met.stuteam.services.ISignServices#selectSignByVo(cn.edu.swpu.met.stuteam.pojo.vo.QuerySignVo)
	 */
	@Override
	public Page<ManageSign> selectSignByVo(QuerySignVo vo) {
		// TODO Auto-generated method stub
		ManageSignExample example = new ManageSignExample();
		Criteria criteria = example.createCriteria();
		//获取更具什么进行查询（一个value值）
		Integer condition = vo.getCondition();
		//输入框中输入的查询字符串
		String selectString = vo.getSelectString();
		//创建分页对象
		Page<ManageSign> page = new Page<>();
		if (vo != null) {//如果带有查询的条件
			page.setSize(vo.getSize());
			//判断分页查询的起点，看看是否是从第一页开始
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			//判断是根据什么进行查询
			if (vo.getCondition() != null) {
				switch (condition) {
				case 1:
					criteria.andIdLike(selectString);
					vo.setId(selectString);
					break;
				case 2:
					criteria.andCreatenameLike(selectString);	
					vo.setCreatename(selectString);
					break;
				case 3:
					criteria.andConfirmnameLike(selectString);
					vo.setConfirmname(selectString);
					break;
				case 4:
					criteria.andRemarksLike(selectString);
					vo.setRemarks(selectString);
					break;

				default:
					break;
				}
			}
			
		}
		
		//如果不带查询条件
		//1.获取查询记录的总数
		page.setTotal(manageSignMapper.countByExample(example));
		//2.将分页查询的记录方法分页对象中
		//新创建一个集合，用来存储打包过后的签到表信息（查询从表信息过后）
		List<ManageSign> signList = new ArrayList<ManageSign>();
		//获取未查询从表的集合
		List<ManageSign> signs = manageSignMapper.selectPageByQueryVo(vo);
		
		for (ManageSign manageSign : signs) {
			String signTableId = manageSign.getId();
			//1.查询值班人员从表  这里需要一对一查询管理员的姓名
			List<ManageSignWatchs> watchs = manageSignWatchsMapper.selectBySignTableId(signTableId);
			manageSign.setWatchsArray(watchs); 
			//2.查询共同自行车从表   需要查询出自行车的名字
			List<ManageSignBikes> bikes = manageSignBikesMapper.selectBySignTableId(signTableId);
			manageSign.setBikesArray(bikes);
			//3.查询钥匙从表   需要查询吃钥匙的名字
			List<ManageSignKeys> keys = manageSignKeysMapper.selectBySignTableId(signTableId);
			manageSign.setKeysArray(keys); 
			//4.查询工具从表   需要查询工具的名字
			List<ManageSignTools> tools = manageSignToolsMapper.selectBySignTableId(signTableId);
			manageSign.setToolsArray(tools);
			
			//给对象的创建人名字和确认人名字属性赋值
			manageSign.setCreate(manageService.queryManageById(manageSign.getCreatename()).getRealname());
			if (manageSign.getConfirmname() != null) {
				manageSign.setConfir(manageService.queryManageById(manageSign.getConfirmname()).getRealname());
			}
			//添加到打包的集合中
			signList.add(manageSign);
		}
		page.setRows(signList);
		return page;
	}

	@Override
	public boolean deleteSign(String signId) {
		//删除主表
		int row1 = deleteManageSignById(signId);
		//删除从表
		boolean row2 = deleteSignBYTW(signId);
		return row1>0 && row2?true:false;
	}

	@Override
	public ManageSign getCompleteSignById(String signId) {
		// TODO Auto-generated method stub
		ManageSign sign = getSignById(signId);
		//1.查询值班人员从表  这里需要一对一查询管理员的姓名
		List<ManageSignWatchs> watchs = manageSignWatchsMapper.selectBySignTableId(signId);
		sign.setWatchsArray(watchs); 
		//2.查询共同自行车从表   需要查询出自行车的名字
		List<ManageSignBikes> bikes = manageSignBikesMapper.selectBySignTableId(signId);
		sign.setBikesArray(bikes);
		//3.查询钥匙从表   需要查询吃钥匙的名字
		List<ManageSignKeys> keys = manageSignKeysMapper.selectBySignTableId(signId);
		sign.setKeysArray(keys); 
		//4.查询工具从表   需要查询工具的名字
		List<ManageSignTools> tools = manageSignToolsMapper.selectBySignTableId(signId);
		sign.setToolsArray(tools);
		
		//给对象的创建人名字和确认人名字属性赋值
		sign.setCreate(manageService.queryManageById(sign.getCreatename()).getRealname());
		if (sign.getConfirmname() != null) {
			sign.setConfir(manageService.queryManageById(sign.getConfirmname()).getRealname());
		}
		return sign;
	}

	@Override
	public boolean updateManageSignById(ManageSign manageSign) {
		// TODO Auto-generated method stub
		String id = manageSign.getId();
		//删除该签到表下的所有从表
		deleteSignBYTW(id);
		//根据签到表的ID更新改签到表的主签到表信息
		int rows =  manageSignMapper.updateByPrimaryKey(manageSign);
		//添加公用自行车从表信息
		/*
		 * 1.首先查询出所有的公用自行车
		 * 2.把选中的自行车station字段设置为1，没有选中的设置为2
		 * 3.然后逐条添加
		 */
		List<ToolBikes> bikes = getAllBikes(); 
		String[] bikesId = manageSign.getBikes();
		for (ToolBikes bike : bikes) {
			//获取自行车的ID
			Integer bikeIdInt = bike.getId();
			//将int类型转成string类型
			String bikeId1 = new String(bikeIdInt+"");
			ManageSignBikes manageSignBike = new ManageSignBikes();
			manageSignBike.setBikeid(bikeId1);
			manageSignBike.setSigntableid(id);
			//进行状态的匹配
			for (String bikeId : bikesId) {
				if (bikeId.equals(bikeId1) || bikeId == bikeId1) {
					manageSignBike.setStation(1);
					break;
				}else {
					manageSignBike.setStation(2);
					continue;
				}
			}
			//将对象添加到数据库
			if (manageSignBikesMapper.insert(manageSignBike) == 0) {
				return false;
			} 
		}
		
		//添加钥匙从表
		List<ToolKeys> keys = getAllKeys();
		String[] keysId = manageSign.getKeys();
		for (ToolKeys key : keys) {
			Integer keyIdInt = key.getId();
			//将int类型转成string类型
			String keyId1 = new String(keyIdInt+"");
			ManageSignKeys manageSignKey = new ManageSignKeys();
			manageSignKey.setKeyid(keyId1);
			manageSignKey.setSigntableid(id);
			//钥匙状态匹配
			for (String keyId : keysId) {
				if (keyId.equals(keyId1) || keyId == keyId1) {
					manageSignKey.setStation(1);
					break;
				}else {
					manageSignKey.setStation(2);
					continue;
				}
			}
			//将对象添加到数据库
			if (manageSignKeysMapper.insert(manageSignKey) == 0) {
				return false;
			} 
		}
		
		
		List<ToolTools> tools = getAllTools();
		String[] toolsId = manageSign.getTools();
		for (ToolTools tool : tools) {
			Integer toolIdInt = tool.getId();
			//将int类型转成string类型
			String toolId1 = new String(toolIdInt+"");
			
			ManageSignTools manageSignTool = new ManageSignTools();
			manageSignTool.setToolid(toolId1);
			manageSignTool.setSigntable(id);
			for (String toolId : toolsId) {
				if (toolId.equals(toolId1) || toolId == toolId1) {
					manageSignTool.setStation(1);
					break;
				}else {
					manageSignTool.setStation(2);
					continue;
				}
			}
			//将对象添加到数据库
			if (manageSignToolsMapper.insert(manageSignTool) == 0) {
				return false;
			}
		}
		List<ManageSignWatchs> watchsArray = manageSign.getWatchsArray();
		for (ManageSignWatchs manageSignWatch : watchsArray) {
			if (manageSignWatchsMapper.insert(manageSignWatch) == 0) {
				return false;
			}
		}
		return rows > 0?true:false;
	}
	

}
