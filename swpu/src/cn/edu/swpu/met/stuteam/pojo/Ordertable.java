
package cn.edu.swpu.met.stuteam.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Ordertable {
	
	private String chudanren;
	private String chudanname;
	private Date chudandate;//出单时间
	private String chudandatesString;
	private Manage chudan;
	private String dateDiff;//出单计时
	
    private String id;//

    private Integer tabletype;

    private String address;//

    private Integer usertype;

    private String username;
    
    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date appointmenttime;
    private String appointmenttimeString; //附加属性

    private String userphone;//

    private Integer station;

    private String description;//

    private String startname;//派单人的学号

    private String startnamestring;//派单人的姓名//

    private String endname;
    private List<Orderend> orderends;//
    private String[] endIds;//从页面接收完工人的ID数组
    
    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date starttime;
    private String starttimeString;//附加属性
    
    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date endtime;
    private String endtimeString;//附加属性//

    private String reason;//

    private String solve;//

    private Integer duankou;

    private Integer mianban;

    private Integer shuijingtou;

    private Integer wangxian;

    private String remark;
    
    private Date changedate;
    private String changedateString;//附加属性//

    private String changeby;//更改者的学号

    private String changenamestring;//更改者的姓名//
    
    private String recordman;

    private String recordname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
        this.address = address == null ? null : address.trim();
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
        this.username = username == null ? null : username.trim();
    }

    public Date getAppointmenttime() {
        return appointmenttime;
    }

    public void setAppointmenttime(Date appointmenttime) {
    	if (appointmenttime != null) {
    		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	this.appointmenttimeString = dFormat.format(appointmenttime);
		}
        this.appointmenttime = appointmenttime;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
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
        this.description = description == null ? null : description.trim();
    }

    public String getStartname() {
        return startname;
    }

    public void setStartname(String startname) {
        this.startname = startname == null ? null : startname.trim();
    }

    public String getStartnamestring() {
        return startnamestring;
    }

    public void setStartnamestring(String startnamestring) {
        this.startnamestring = startnamestring == null ? null : startnamestring.trim();
    }

    public String getEndname() {
        return endname;
    }

    public void setEndname(String endname) {
        this.endname = endname == null ? null : endname.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
    	if (starttime != null) {
    		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	this.starttimeString = dFormat.format(starttime);
		}
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
    	if (endtime != null) {
    		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	this.endtimeString = dFormat.format(endtime);
		}
        this.endtime = endtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getSolve() {
        return solve;
    }

    public void setSolve(String solve) {
        this.solve = solve == null ? null : solve.trim();
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
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
    	if (changedate !=null) {
    		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	this.changedateString = dFormat.format(changedate);
		}
        this.changedate = changedate;
    }

    public String getChangeby() {
        return changeby;
    }

    public void setChangeby(String changeby) {
        this.changeby = changeby == null ? null : changeby.trim();
    }

    public String getChangenamestring() {
        return changenamestring;
    }

    public void setChangenamestring(String changenamestring) {
        this.changenamestring = changenamestring == null ? null : changenamestring.trim();
    }

	public String getAppointmenttimeString() {
		return appointmenttimeString;
	}

	public void setAppointmenttimeString(String appointmenttimeString) {
		this.appointmenttimeString = appointmenttimeString;
	}

	public String getStarttimeString() {
		return starttimeString;
	}

	public void setStarttimeString(String starttimeString) {
		this.starttimeString = starttimeString;
	}

	public String getEndtimeString() {
		return endtimeString;
	}

	public void setEndtimeString(String endtimeString) {
		this.endtimeString = endtimeString;
	}

	public String getChangedateString() {
		return changedateString;
	}

	public void setChangedateString(String changedateString) {
		this.changedateString = changedateString;
	}

	public String getChudanname() {
		return chudanname;
	}

	public void setChudanname(String chudanname) {
		this.chudanname = chudanname;
	}

	public String getChudanren() {
		return chudanren;
	}

	public void setChudanren(String chudanren) {
		this.chudanren = chudanren;
	}

	public Date getChudandate() {
		return chudandate;
	}

	public void setChudandate(Date chudandate) {
		if (chudandate != null) {
			DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    	this.chudandatesString = dFormat.format(chudandate);
		}
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

	public List<Orderend> getOrderends() {
		return orderends;
	}

	public void setOrderends(List<Orderend> orderends) {
		this.orderends = orderends;
	}

	public String getRecordman() {
		return recordman;
	}

	public void setRecordman(String recordman) {
		this.recordman = recordman;
	}

	public String getRecordname() {
		return recordname;
	}

	public void setRecordname(String recordname) {
		this.recordname = recordname;
	}

	public String[] getEndIds() {
		return endIds;
	}

	public void setEndIds(String[] endIds) {
		this.endIds = endIds;
	}

	@Override
	public String toString() {
		return "Ordertable [chudanren=" + chudanren + ", chudanname="
				+ chudanname + ", chudandate=" + chudandate
				+ ", chudandatesString=" + chudandatesString + ", chudan="
				+ chudan + ", dateDiff=" + dateDiff + ", id=" + id
				+ ", tabletype=" + tabletype + ", address=" + address
				+ ", usertype=" + usertype + ", username=" + username
				+ ", appointmenttime=" + appointmenttime
				+ ", appointmenttimeString=" + appointmenttimeString
				+ ", userphone=" + userphone + ", station=" + station
				+ ", description=" + description + ", startname=" + startname
				+ ", startnamestring=" + startnamestring + ", endname="
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
				+ recordman + ", recordname=" + recordname + "]";
	}

	
}



