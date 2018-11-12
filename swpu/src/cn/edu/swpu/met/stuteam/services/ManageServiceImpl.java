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
 * @author: 朱军
 * @date:2017年12月25日 上午11:35:39
 * @version :1.0
 * 
 */
@Service
public class ManageServiceImpl implements IManageService {
	
	//创建managedao对象
//	@Autowired
	@Resource(name="manageMapper")
	private ManageMapper manageMapper;

	@Override
	public boolean checkUserName(String userId) {
		// TODO Auto-generated method stub
		//调用根据用户的ID查询用户的方法
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
		
		//进行密码验证
		if (user != null && user.getPassword().equals(userPassword)) {
			//设置最后登陆时间按
			try {
				user.setLastlogintime(sdf.parse(sdf.format(date)));
				//修改登陆时间
				manageMapper.updateByPrimaryKey(user);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//密码正确返回user
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
		//定义条件对象
		ManageExample example = new ManageExample();
		Criteria criteria = example.createCriteria();
		if (vo != null) {
			page.setSize(vo.getSize());
			//设置分页查询的起点
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if (vo.getCondition() == null || vo.getSelectString() == null) {
				
			}else {
				switch (vo.getCondition()) {
				case 1://学生学号
					criteria.andIdLike(selectString);
					vo.setId(selectString);
					break;
				case 2://学生性别
					if (selectString.equals("男")) {
						criteria.andSexEqualTo(1);
						vo.setSex(1);
					}else if(selectString.equals("女")) {
						criteria.andSexEqualTo(2);
						vo.setSex(2);
					}
					break;
				case 3://年级专业
					criteria.andMajorLike(selectString);
					vo.setMajor(selectString);
					break;
				case 4://真实名字
					criteria.andRealnameLike(selectString);		
					vo.setRealname(selectString);
					break;
				case 5://电话号码
					criteria.andPhoneLike(selectString);
					vo.setPhone(selectString);
					break;
				case 6://宿舍地址
					criteria.andAddressLike(selectString);
					vo.setAddress(selectString);
					break;
				case 7://身份证号
					criteria.andIdcardLike(selectString);
					vo.setIdcard(selectString);
					break;
				default:
					break;
				}
			}
		}
		//查询符合条件的记录总条数
		page.setTotal(manageMapper.countByExample(example));
		//将分页查询的结果给page对象
		page.setRows(manageMapper.selectPageByQueryVo(vo));
		
		return page;
	}

}
