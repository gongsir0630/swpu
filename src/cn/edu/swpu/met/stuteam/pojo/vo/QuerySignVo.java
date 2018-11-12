package cn.edu.swpu.met.stuteam.pojo.vo;
/**
 * @ClassName: QuerySign
 * @Description: TODO
 * @author: 朱军
 * @date:2018年2月4日 下午6:37:54
 * @version :1.0
 * 
 */
public class QuerySignVo {
	//查询的信息
	//按照什么进行查询，对应jsp页面的下拉选框的value
	private Integer condition;
	//输入查询的字符串
	private String selectString;
	
	//分页的信息
	//当前页的页码
	private Integer page;
	//每页记录条数
	private Integer size = 8; 
	//默认从第一条记录开始查询   开始行
	private Integer startRow = 0;
	
	//查询的字符串
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
