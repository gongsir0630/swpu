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
 * @author: ���
 * @date:2018��1��6�� ����7:15:14
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
		//��ѯ�����ڼܵĹ���
		toolsExample.createCriteria().andStationEqualTo(1);
		return toolToolsMapper.selectByExample(toolsExample);
	}

	@Override
	public List<ToolKeys> getAllKeys() {
		// TODO Auto-generated method stub
		ToolKeysExample example = new ToolKeysExample();
		//��ѯ�ڼܵ�Կ��	
		example.createCriteria().andStationEqualTo(1);
		return toolKeysMapper.selectByExample(example);
	}

	@Override
	public List<ToolBikes> getAllBikes() {
		// TODO Auto-generated method stub
		ToolBikesExample example = new ToolBikesExample();
		//��ѯ�ڼܵ����г�
		example.createCriteria().andStationEqualTo(1);
		return toolBikesMapper.selectByExample(example);
	}

	@Override
	public boolean addsign(ManageSign manageSign) {
		//System.out.println("������"+manageSign);
		// TODO Auto-generated method stub
		String id = manageSign.getId();
		//�������һ����ǩ������Ϣ
		int rows =  manageSignMapper.insert(manageSign);
		//��ӹ������г��ӱ���Ϣ
		/*
		 * 1.���Ȳ�ѯ�����еĹ������г�
		 * 2.��ѡ�е����г�station�ֶ�����Ϊ1��û��ѡ�е�����Ϊ2
		 * 3.Ȼ���������
		 */
		List<ToolBikes> bikes = getAllBikes(); 
		String[] bikesId = manageSign.getBikes();
		for (ToolBikes bike : bikes) {
			//��ȡ���г���ID
			Integer bikeIdInt = bike.getId();
			//��int����ת��string����
			String bikeId1 = new String(bikeIdInt+"");
			ManageSignBikes manageSignBike = new ManageSignBikes();
			manageSignBike.setBikeid(bikeId1);
			manageSignBike.setSigntableid(id);
			//����״̬��ƥ��
			for (String bikeId : bikesId) {
				if (bikeId.equals(bikeId1) || bikeId == bikeId1) {
					manageSignBike.setStation(1);
					break;
				}else {
					manageSignBike.setStation(2);
					continue;
				}
			}
			//��������ӵ����ݿ�
			if (manageSignBikesMapper.insert(manageSignBike) == 0) {
				return false;
			} 
		}
		
		//���Կ�״ӱ�
		List<ToolKeys> keys = getAllKeys();
		String[] keysId = manageSign.getKeys();
		for (ToolKeys key : keys) {
			Integer keyIdInt = key.getId();
			//��int����ת��string����
			String keyId1 = new String(keyIdInt+"");
			ManageSignKeys manageSignKey = new ManageSignKeys();
			manageSignKey.setKeyid(keyId1);
			manageSignKey.setSigntableid(id);
			//Կ��״̬ƥ��
			for (String keyId : keysId) {
				if (keyId.equals(keyId1) || keyId == keyId1) {
					manageSignKey.setStation(1);
					break;
				}else {
					manageSignKey.setStation(2);
					continue;
				}
			}
			//��������ӵ����ݿ�
			if (manageSignKeysMapper.insert(manageSignKey) == 0) {
				return false;
			} 
		}
		
		
		List<ToolTools> tools = getAllTools();
		String[] toolsId = manageSign.getTools();
		for (ToolTools tool : tools) {
			Integer toolIdInt = tool.getId();
			//��int����ת��string����
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
			//��������ӵ����ݿ�
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
			//��ȡǩ�����Ž��дӱ��ѯ
			String signTableId = lastSign.getId();
			//1.��ѯֵ����Ա�ӱ�  ������Ҫһ��һ��ѯ����Ա������
			List<ManageSignWatchs> watchs = manageSignWatchsMapper.selectBySignTableId(signTableId);
//			for (ManageSignWatchs manageSignWatchs : watchs) {
//				System.out.println(manageSignWatchs);
//			}
			lastSign.setWatchsArray(watchs); 
			//2.��ѯ��ͬ���г��ӱ�   ��Ҫ��ѯ�����г�������
			List<ManageSignBikes> bikes = manageSignBikesMapper.selectBySignTableId(signTableId);
			lastSign.setBikesArray(bikes);
			//3.��ѯԿ�״ӱ�   ��Ҫ��ѯ��Կ�׵�����
			List<ManageSignKeys> keys = manageSignKeysMapper.selectBySignTableId(signTableId);
			lastSign.setKeysArray(keys); 
			//4.��ѯ���ߴӱ�   ��Ҫ��ѯ���ߵ�����
			List<ManageSignTools> tools = manageSignToolsMapper.selectBySignTableId(signTableId);
			lastSign.setToolsArray(tools);
			
			//��ѯ��д�˺�ǩ���˵�����
			//������Ĵ��������ֺ�ȷ�����������Ը�ֵ
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
	 * ��ҳ����ʵ����
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
		//��ȡ����ʲô���в�ѯ��һ��valueֵ��
		Integer condition = vo.getCondition();
		//�����������Ĳ�ѯ�ַ���
		String selectString = vo.getSelectString();
		//������ҳ����
		Page<ManageSign> page = new Page<>();
		if (vo != null) {//������в�ѯ������
			page.setSize(vo.getSize());
			//�жϷ�ҳ��ѯ����㣬�����Ƿ��Ǵӵ�һҳ��ʼ
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			//�ж��Ǹ���ʲô���в�ѯ
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
		
		//���������ѯ����
		//1.��ȡ��ѯ��¼������
		page.setTotal(manageSignMapper.countByExample(example));
		//2.����ҳ��ѯ�ļ�¼������ҳ������
		//�´���һ�����ϣ������洢��������ǩ������Ϣ����ѯ�ӱ���Ϣ����
		List<ManageSign> signList = new ArrayList<ManageSign>();
		//��ȡδ��ѯ�ӱ�ļ���
		List<ManageSign> signs = manageSignMapper.selectPageByQueryVo(vo);
		
		for (ManageSign manageSign : signs) {
			String signTableId = manageSign.getId();
			//1.��ѯֵ����Ա�ӱ�  ������Ҫһ��һ��ѯ����Ա������
			List<ManageSignWatchs> watchs = manageSignWatchsMapper.selectBySignTableId(signTableId);
			manageSign.setWatchsArray(watchs); 
			//2.��ѯ��ͬ���г��ӱ�   ��Ҫ��ѯ�����г�������
			List<ManageSignBikes> bikes = manageSignBikesMapper.selectBySignTableId(signTableId);
			manageSign.setBikesArray(bikes);
			//3.��ѯԿ�״ӱ�   ��Ҫ��ѯ��Կ�׵�����
			List<ManageSignKeys> keys = manageSignKeysMapper.selectBySignTableId(signTableId);
			manageSign.setKeysArray(keys); 
			//4.��ѯ���ߴӱ�   ��Ҫ��ѯ���ߵ�����
			List<ManageSignTools> tools = manageSignToolsMapper.selectBySignTableId(signTableId);
			manageSign.setToolsArray(tools);
			
			//������Ĵ��������ֺ�ȷ�����������Ը�ֵ
			manageSign.setCreate(manageService.queryManageById(manageSign.getCreatename()).getRealname());
			if (manageSign.getConfirmname() != null) {
				manageSign.setConfir(manageService.queryManageById(manageSign.getConfirmname()).getRealname());
			}
			//��ӵ�����ļ�����
			signList.add(manageSign);
		}
		page.setRows(signList);
		return page;
	}

	@Override
	public boolean deleteSign(String signId) {
		//ɾ������
		int row1 = deleteManageSignById(signId);
		//ɾ���ӱ�
		boolean row2 = deleteSignBYTW(signId);
		return row1>0 && row2?true:false;
	}

	@Override
	public ManageSign getCompleteSignById(String signId) {
		// TODO Auto-generated method stub
		ManageSign sign = getSignById(signId);
		//1.��ѯֵ����Ա�ӱ�  ������Ҫһ��һ��ѯ����Ա������
		List<ManageSignWatchs> watchs = manageSignWatchsMapper.selectBySignTableId(signId);
		sign.setWatchsArray(watchs); 
		//2.��ѯ��ͬ���г��ӱ�   ��Ҫ��ѯ�����г�������
		List<ManageSignBikes> bikes = manageSignBikesMapper.selectBySignTableId(signId);
		sign.setBikesArray(bikes);
		//3.��ѯԿ�״ӱ�   ��Ҫ��ѯ��Կ�׵�����
		List<ManageSignKeys> keys = manageSignKeysMapper.selectBySignTableId(signId);
		sign.setKeysArray(keys); 
		//4.��ѯ���ߴӱ�   ��Ҫ��ѯ���ߵ�����
		List<ManageSignTools> tools = manageSignToolsMapper.selectBySignTableId(signId);
		sign.setToolsArray(tools);
		
		//������Ĵ��������ֺ�ȷ�����������Ը�ֵ
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
		//ɾ����ǩ�����µ����дӱ�
		deleteSignBYTW(id);
		//����ǩ�����ID���¸�ǩ�������ǩ������Ϣ
		int rows =  manageSignMapper.updateByPrimaryKey(manageSign);
		//��ӹ������г��ӱ���Ϣ
		/*
		 * 1.���Ȳ�ѯ�����еĹ������г�
		 * 2.��ѡ�е����г�station�ֶ�����Ϊ1��û��ѡ�е�����Ϊ2
		 * 3.Ȼ���������
		 */
		List<ToolBikes> bikes = getAllBikes(); 
		String[] bikesId = manageSign.getBikes();
		for (ToolBikes bike : bikes) {
			//��ȡ���г���ID
			Integer bikeIdInt = bike.getId();
			//��int����ת��string����
			String bikeId1 = new String(bikeIdInt+"");
			ManageSignBikes manageSignBike = new ManageSignBikes();
			manageSignBike.setBikeid(bikeId1);
			manageSignBike.setSigntableid(id);
			//����״̬��ƥ��
			for (String bikeId : bikesId) {
				if (bikeId.equals(bikeId1) || bikeId == bikeId1) {
					manageSignBike.setStation(1);
					break;
				}else {
					manageSignBike.setStation(2);
					continue;
				}
			}
			//��������ӵ����ݿ�
			if (manageSignBikesMapper.insert(manageSignBike) == 0) {
				return false;
			} 
		}
		
		//���Կ�״ӱ�
		List<ToolKeys> keys = getAllKeys();
		String[] keysId = manageSign.getKeys();
		for (ToolKeys key : keys) {
			Integer keyIdInt = key.getId();
			//��int����ת��string����
			String keyId1 = new String(keyIdInt+"");
			ManageSignKeys manageSignKey = new ManageSignKeys();
			manageSignKey.setKeyid(keyId1);
			manageSignKey.setSigntableid(id);
			//Կ��״̬ƥ��
			for (String keyId : keysId) {
				if (keyId.equals(keyId1) || keyId == keyId1) {
					manageSignKey.setStation(1);
					break;
				}else {
					manageSignKey.setStation(2);
					continue;
				}
			}
			//��������ӵ����ݿ�
			if (manageSignKeysMapper.insert(manageSignKey) == 0) {
				return false;
			} 
		}
		
		
		List<ToolTools> tools = getAllTools();
		String[] toolsId = manageSign.getTools();
		for (ToolTools tool : tools) {
			Integer toolIdInt = tool.getId();
			//��int����ת��string����
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
			//��������ӵ����ݿ�
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
