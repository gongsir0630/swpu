package cn.edu.swpu.met.stuteam.pojo.vo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import cn.edu.swpu.met.stuteam.pojo.Manage;
import cn.edu.swpu.met.stuteam.pojo.Orderend;

/**
 * @ClassName: QueryOrderVo
 * @Description: TODO
 * @author: 朱军
 * @date:2018年3月22日 下午2:45:43
 * @version :1.0
 * 
 */
public class QueryOrderVo {
	
	private String chudanren;
	private String chudanname;
	private Date chudandate;//出单时间
	private String chudandatesString;
	private Manage chudan;
	private String dateDiff;//出单计时
	
    private String id;

    private Integer tabletype;

    private String address;

    private Integer usertype;

    private String username;

    private Date appointmenttime;
    private String appointmenttimeString; //附加属性

    private String userphone;

    private Integer station;

    private String description;

    private String startname;//派单人的学号

    private String startNameString;//派单人的姓名

    private String endname;
    private List<Orderend> orderends;
    private String[] endIds;//从页面接收完工人的ID数组

    private Date starttime;
    private String starttimeString;//附加属性

    private Date endtime;
    private String endtimeString;//附加属性

    private String reason;

    private String solve;

    private Integer duankou;

    private Integer mianban;

    private Integer shuijingtou;

    private Integer wangxian;

    private String remark;

    private Date changedate;
    private String changedateString;//附加属性

    private String changeby;//更改者的学号

    private String changenamestring;//更改者的姓名
    
    private String recordman;

    private String recordName;
    
		
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

	
	public String getChudanren() {
		return chudanren;
	}
	public void setChudanren(String chudanren) {
		this.chudanren = chudanren;
	}
	public String getChudanname() {
		return chudanname;
	}
	public void setChudanname(String chudanname) {
		this.chudanname = chudanname;
	}
	public Date getChudandate() {
		return chudandate;
	}
	public void setChudandate(Date chudandate) {
		this.chudandate = chudandate;
	}
	public String getChudandatesString() {
		return chudandatesString;
	}
	public void setChudandatesString(String chudandatesString) {
		this.chudandatesString = chudandatesString;
	}
	public Manage getChudan() {
		return chudan;
	}
	public void setChudan(Manage chudan) {
		this.chudan = chudan;
	}
	public String getDateDiff() {
		return dateDiff;
	}
	public void setDateDiff(String dateDiff) {
		this.dateDiff = dateDiff;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getTabletype() {
		return tabletype;
	}
	public void setTabletype(Integer tabletype) {
		this.tabletype = tabletype;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getUsertype() {
		return usertype;
	}
	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getAppointmenttime() {
		return appointmenttime;
	}
	public void setAppointmenttime(Date appointmenttime) {
		this.appointmenttime = appointmenttime;
	}
	public String getAppointmenttimeString() {
		return appointmenttimeString;
	}
	public void setAppointmenttimeString(String appointmenttimeString) {
		this.appointmenttimeString = appointmenttimeString;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public Integer getStation() {
		return station;
	}
	public void setStation(Integer station) {
		this.station = station;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartname() {
		return startname;
	}
	public void setStartname(String startname) {
		this.startname = startname;
	}
	public String getEndname() {
		return endname;
	}
	public void setEndname(String endname) {
		this.endname = endname;
	}
	public List<Orderend> getOrderends() {
		return orderends;
	}
	public void setOrderends(List<Orderend> orderends) {
		this.orderends = orderends;
	}
	public String[] getEndIds() {
		return endIds;
	}
	public void setEndIds(String[] endIds) {
		this.endIds = endIds;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public String getStarttimeString() {
		return starttimeString;
	}
	public void setStarttimeString(String starttimeString) {
		this.starttimeString = starttimeString;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getEndtimeString() {
		return endtimeString;
	}
	public void setEndtimeString(String endtimeString) {
		this.endtimeString = endtimeString;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getSolve() {
		return solve;
	}
	public void setSolve(String solve) {
		this.solve = solve;
	}
	public Integer getDuankou() {
		return duankou;
	}
	public void setDuankou(Integer duankou) {
		this.duankou = duankou;
	}
	public Integer getMianban() {
		return mianban;
	}
	public void setMianban(Integer mianban) {
		this.mianban = mianban;
	}
	public Integer getShuijingtou() {
		return shuijingtou;
	}
	public void setShuijingtou(Integer shuijingtou) {
		this.shuijingtou = shuijingtou;
	}
	public Integer getWangxian() {
		return wangxian;
	}
	public void setWangxian(Integer wangxian) {
		this.wangxian = wangxian;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getChangedate() {
		return changedate;
	}
	public void setChangedate(Date changedate) {
		this.changedate = changedate;
	}
	public String getChangedateString() {
		return changedateString;
	}
	public void setChangedateString(String changedateString) {
		this.changedateString = changedateString;
	}
	public String getChangeby() {
		return changeby;
	}
	public void setChangeby(String changeby) {
		this.changeby = changeby;
	}
	public String getChangenamestring() {
		return changenamestring;
	}
	public void setChangenamestring(String changenamestring) {
		this.changenamestring = changenamestring;
	}
	public String getRecordman() {
		return recordman;
	}
	public void setRecordman(String recordman) {
		this.recordman = recordman;
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
	public String getStartNameString() {
		return startNameString;
	}
	public void setStartNameString(String startNameString) {
		this.startNameString = startNameString;
	}
	@Override
	public String toString() {
		return "QueryOrderVo [chudanren=" + chudanren + ", chudanname="
				+ chudanname + ", chudandate=" + chudandate
				+ ", chudandatesString=" + chudandatesString + ", chudan="
				+ chudan + ", dateDiff=" + dateDiff + ", id=" + id
				+ ", tabletype=" + tabletype + ", address=" + address
				+ ", usertype=" + usertype + ", username=" + username
				+ ", appointmenttime=" + appointmenttime
				+ ", appointmenttimeString=" + appointmenttimeString
				+ ", userphone=" + userphone + ", station=" + station
				+ ", description=" + description + ", startname=" + startname
				+ ", startNameString=" + startNameString + ", endname="
				+ endname + ", orderends=" + orderends + ", endIds="
				+ Arrays.toString(endIds) + ", starttime=" + starttime
				+ ", starttimeString=" + starttimeString + ", endtime="
				+ endtime + ", endtimeString=" + endtimeString + ", reason="
				+ reason + ", solve=" + solve + ", duankou=" + duankou
				+ ", mianban=" + mianban + ", shuijingtou=" + shuijingtou
				+ ", wangxian=" + wangxian + ", remark=" + remark
				+ ", changedate=" + changedate + ", changedateString="
				+ changedateString + ", changeby=" + changeby
				+ ", changenamestring=" + changenamestring + ", recordman="
				+ recordman + ", recorName=" + recordName + ", condition="
				+ condition + ", selectString=" + selectString + ", page="
				+ page + ", size=" + size + ", startRow=" + startRow + "]";
	}
	public String getRecordName() {
		return recordName;
	}
	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}
	
	
}
