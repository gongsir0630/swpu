package cn.edu.swpu.met.stuteam.pojo.vo;
/**
 * @ClassName: QueryVo
 * @Description: TODO
 * @author: ���
 * @date:2018��1��2�� ����7:56:19
 * @version :1.0
 * 
 */
public class QueryVo {
	//��ѯ����
	//ѧ��ģ����ѯ
	private String id;
	//���Ա���в�ѯ
	private Integer sex;
	//רҵģ����ѯ
	private String major;
	//��ʵ����ģ����ѯ
	private String realname;
	//�绰����ģ����ѯ
	private String phone;
	//���ݵ�ַģ����ѯ
	private String address;
	//���֤��ģ����ѯ
	private String idcard;
	//����ʲô���в�ѯ
	private Integer condition;
	//��ѯ���ֶ�
	private String selectString;
	
	//��ҳ����Ϣ
	//��ǰҳ��ҳ��
	private Integer page;
	//ÿҳ��¼����
	private Integer size = 8; 
	//Ĭ�ϴӵ�һ����¼��ʼ��ѯ   ��ʼ��
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
