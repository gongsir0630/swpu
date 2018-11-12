package cn.edu.swpu.met.stuteam.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.swpu.met.common.util.Page;
import cn.edu.swpu.met.stuteam.mapper.ManageMapper;
import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.ManageExample;
import cn.edu.swpu.met.stuteam.pojo.ManageExample.Criteria;
import cn.edu.swpu.met.stuteam.pojo.vo.QueryVo;

/**
 * @ClassName: ManageServiceImpl
 * @Description: TODO
 * @author: ���
 * @date:2017��12��25�� ����11:35:39
 * @version :1.0
 * 
 */
@Service
public class ManageServiceImpl implements IManageService {
	
	//����managedao����
//	@Autowired
	@Resource(name="manageMapper")
	private ManageMapper manageMapper;

	@Override
	public boolean checkUserName(String userId) {
		// TODO Auto-generated method stub
		//���ø����û���ID��ѯ�û��ķ���
		Manage user = manageMapper.selectByPrimaryKey(userId);
		if (user != null) {
			return true;
		}
		return false;
	}

	@Override
	public Manage loginManage(String userId, String userPassword) {
		// TODO Auto-generated method stub
		System.out.println(manageMapper);
		Manage user = manageMapper.selectByPrimaryKey(userId);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//����������֤
		if (user != null && user.getPassword().equals(userPassword)) {
			//��������½ʱ�䰴
			try {
				user.setLastlogintime(sdf.parse(sdf.format(date)));
				//�޸ĵ�½ʱ��
				manageMapper.updateByPrimaryKey(user);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//������ȷ����user
			return user;
		}
		return null;
	}

	@Override
	public List<Manage> getAllManage() {
		// TODO Auto-generated method stub
		return manageMapper.selectByExample(null);
	}

	@Override
	public boolean addManage(Manage manage) {
		// TODO Auto-generated method stub
		return manageMapper.insert(manage)>0?true:false;
	}

	@Override
	public Manage queryManageById(String  id) {
		// TODO Auto-generated method stub
		return manageMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean updateManage(Manage manage) {
		// TODO Auto-generated method stub
		return manageMapper.updateByPrimaryKey(manage)>0?true:false;
	}

	@Override
	public boolean deleteManage(String id) {
		// TODO Auto-generated method stub
		return manageMapper.deleteByPrimaryKey(id)>0?true:false;
	}

	@Override
	public Page<Manage> selectPageBy(QueryVo vo) {
		// TODO Auto-generated method stub
		String selectString = vo.getSelectString();
		Page<Manage> page = new Page<Manage>();
		//������������
		ManageExample example = new ManageExample();
		Criteria criteria = example.createCriteria();
		if (vo != null) {
			page.setSize(vo.getSize());
			//���÷�ҳ��ѯ�����
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if (vo.getCondition() == null || vo.getSelectString() == null) {
				
			}else {
				switch (vo.getCondition()) {
				case 1://ѧ��ѧ��
					criteria.andIdLike(selectString);
					vo.setId(selectString);
					break;
				case 2://ѧ���Ա�
					if (selectString.equals("��")) {
						criteria.andSexEqualTo(1);
						vo.setSex(1);
					}else if(selectString.equals("Ů")) {
						criteria.andSexEqualTo(2);
						vo.setSex(2);
					}
					break;
				case 3://�꼶רҵ
					criteria.andMajorLike(selectString);
					vo.setMajor(selectString);
					break;
				case 4://��ʵ����
					criteria.andRealnameLike(selectString);		
					vo.setRealname(selectString);
					break;
				case 5://�绰����
					criteria.andPhoneLike(selectString);
					vo.setPhone(selectString);
					break;
				case 6://�����ַ
					criteria.andAddressLike(selectString);
					vo.setAddress(selectString);
					break;
				case 7://���֤��
					criteria.andIdcardLike(selectString);
					vo.setIdcard(selectString);
					break;
				default:
					break;
				}
			}
		}
		//��ѯ���������ļ�¼������
		page.setTotal(manageMapper.countByExample(example));
		//����ҳ��ѯ�Ľ����page����
		page.setRows(manageMapper.selectPageByQueryVo(vo));
		
		return page;
	}

}
