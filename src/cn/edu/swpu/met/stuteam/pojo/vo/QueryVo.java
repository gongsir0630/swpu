package cn.edu.swpu.met.stuteam.pojo.vo;
/**
 * @ClassName: QueryVo
 * @Description: TODO
 * @author: 朱军
 * @date:2018年1月2日 下午7:56:19
 * @version :1.0
 * 
 */
public class QueryVo {
	//查询条件
	//学号模糊查询
	private String id;
	//按性别进行查询
	private Integer sex;
	//专业模糊查询
	private String major;
	//真实姓名模糊查询
	private String realname;
	//电话号码模糊查询
	private String phone;
	//根据地址模糊查询
	private String address;
	//身份证号模糊查询
	private String idcard;
	//根据什么进行查询
	private Integer condition;
	//查询的字段
	private String selectString;
	
	//分页的信息
	//当前页的页码
	private Integer page;
	//每页记录条数
	private Integer size = 8; 
	//默认从第一条记录开始查询   开始行
	private Integer startRow = 0;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Integer getCondition() {
		return condition;
	}
	public void setCondition(Integer condition) {
		this.condition = condition;
	}
	public String getSelectString() {
		return selectString;
	}
	public void setSelectString(String selectString) {
		this.selectString = selectString;
	}
	@Override
	public String toString() {
		return "QueryVo [id=" + id + ", sex=" + sex + ", major=" + major
				+ ", realname=" + realname + ", phone=" + phone + ", address="
				+ address + ", idcard=" + idcard + ", condition=" + condition
				+ ", selectString=" + selectString + ", page=" + page
				+ ", size=" + size + ", startRow=" + startRow + "]";
	}
	
	
	
	
	
}
