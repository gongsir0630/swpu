package cn.edu.swpu.met.stuteam.pojo.vo;
/**
 * @ClassName: QuerySign
 * @Description: TODO
 * @author: ���
 * @date:2018��2��4�� ����6:37:54
 * @version :1.0
 * 
 */
public class QuerySignVo {
	//��ѯ����Ϣ
	//����ʲô���в�ѯ����Ӧjspҳ�������ѡ���value
	private Integer condition;
	//�����ѯ���ַ���
	private String selectString;
	
	//��ҳ����Ϣ
	//��ǰҳ��ҳ��
	private Integer page;
	//ÿҳ��¼����
	private Integer size = 8; 
	//Ĭ�ϴӵ�һ����¼��ʼ��ѯ   ��ʼ��
	private Integer startRow = 0;
	
	//��ѯ���ַ���
	private String id;
	private String createname;
	private String confirmname;
	private String remarks;
	private String latesdes;
	private String bikesdes;
	private String keysdes;
	
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
	public String getCreatename() {
		return createname;
	}
	public void setCreatename(String createname) {
		this.createname = createname;
	}
	public String getConfirmname() {
		return confirmname;
	}
	public void setConfirmname(String confirmname) {
		this.confirmname = confirmname;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public String getLatesdes() {
		return latesdes;
	}
	public void setLatesdes(String latesdes) {
		this.latesdes = latesdes;
	}
	public String getBikesdes() {
		return bikesdes;
	}
	public void setBikesdes(String bikesdes) {
		this.bikesdes = bikesdes;
	}
	public String getKeysdes() {
		return keysdes;
	}
	public void setKeysdes(String keysdes) {
		this.keysdes = keysdes;
	}
	@Override
	public String toString() {
		return "QuerySignVo [condition=" + condition + ", selectString="
				+ selectString + ", page=" + page + ", size=" + size
				+ ", startRow=" + startRow + ", id=" + id + ", createname="
				+ createname + ", confirmname=" + confirmname + ", remarks="
				+ remarks + ", latesdes=" + latesdes + ", bikesdes=" + bikesdes
				+ ", keysdes=" + keysdes + "]";
	}
	
	
	
}
