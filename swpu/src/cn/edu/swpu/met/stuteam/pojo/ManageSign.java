package cn.edu.swpu.met.stuteam.pojo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component("manageSign")
public class ManageSign {
	
    private String id;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    private Integer week;

    private String banci;

    private String createname;//创建签到表的学号
    private String create;//创建人的名字

    private String confirmname;//确认人的学号
    private String confir;//确认人的名字

    private String latesdes;//该属性可能用不到

    private String bikesdes;

    private String keysdes;

    private String cdmd125;

    private String cdmd182;

    private String cuq;//联通端口流量

    private String edu;

    private Integer logistics1;//后勤未受理

    private Integer logistics2;//后勤未完工

    private Integer cdmdunfinish;//电信待完成

    private String remarks;
    //签到表从页面添加所需要用到的属性
    private String[] bikes;
    private String[] keys;
    private String[] tools;
    private String[] watchs;
    
    //签到表查询需要用的属性
    private List<ManageSignWatchs> watchsArray; //当前值班人员
    private List<ManageSignBikes> bikesArray;//当前班次自行车在班状况
    private List<ManageSignKeys> keysArray;//钥匙在班状况
    private List<ManageSignTools> toolsArray;//工具在班状况
    
    public String[] getBikes() {
		return bikes;
	}

	public void setBikes(String[] bikes) {
		this.bikes = bikes;
	}

	public String[] getKeys() {
		return keys;
	}

	public void setKeys(String[] keys) {
		this.keys = keys;
	}

	public String[] getTools() {
		return tools;
	}

	public void setTools(String[] tools) {
		this.tools = tools;
	}

	public String[] getWatchs() {
		return watchs;
	}

	public void setWatchs(String[] watchs) {
		this.watchs = watchs;
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreatetime() {
		return createtime;
    }

    public void setCreatetime(Date createtime) {
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
    	String dateString = df.format(createtime);
        this.createtime = java.sql.Date.valueOf(dateString);
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci == null ? null : banci.trim();
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public String getConfirmname() {
        return confirmname;
    }

    public void setConfirmname(String confirmname) {
        this.confirmname = confirmname == null ? null : confirmname.trim();
    }

    public String getLatesdes() {
        return latesdes;
    }

    public void setLatesdes(String latesdes) {
        this.latesdes = latesdes == null ? null : latesdes.trim();
    }

    public String getBikesdes() {
        return bikesdes;
    }

    public void setBikesdes(String bikesdes) {
        this.bikesdes = bikesdes == null ? null : bikesdes.trim();
    }

    public String getKeysdes() {
        return keysdes;
    }

    public void setKeysdes(String keysdes) {
        this.keysdes = keysdes == null ? null : keysdes.trim();
    }

    public String getCdmd125() {
        return cdmd125;
    }

    public void setCdmd125(String cdmd125) {
        this.cdmd125 = cdmd125 == null ? null : cdmd125.trim();
    }

    public String getCdmd182() {
        return cdmd182;
    }

    public void setCdmd182(String cdmd182) {
        this.cdmd182 = cdmd182 == null ? null : cdmd182.trim();
    }

    public String getCuq() {
        return cuq;
    }

    public void setCuq(String cuq) {
        this.cuq = cuq == null ? null : cuq.trim();
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu == null ? null : edu.trim();
    }

    public Integer getLogistics1() {
        return logistics1;
    }

    public void setLogistics1(Integer logistics1) {
        this.logistics1 = logistics1;
    }

    public Integer getLogistics2() {
        return logistics2;
    }

    public void setLogistics2(Integer logistics2) {
        this.logistics2 = logistics2;
    }

    public Integer getCdmdunfinish() {
        return cdmdunfinish;
    }

    public void setCdmdunfinish(Integer cdmdunfinish) {
        this.cdmdunfinish = cdmdunfinish;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

	public List<ManageSignWatchs> getWatchsArray() {
		return watchsArray;
	}

	public void setWatchsArray(List<ManageSignWatchs> watchsArray) {
		this.watchsArray = watchsArray;
	}
	
	
	public List<ManageSignBikes> getBikesArray() {
		return bikesArray;
	}

	public void setBikesArray(List<ManageSignBikes> bikesArray) {
		this.bikesArray = bikesArray;
	}

	public List<ManageSignKeys> getKeysArray() {
		return keysArray;
	}

	public void setKeysArray(List<ManageSignKeys> keysArray) {
		this.keysArray = keysArray;
	}

	public List<ManageSignTools> getToolsArray() {
		return toolsArray;
	}

	public void setToolsArray(List<ManageSignTools> toolsArray) {
		this.toolsArray = toolsArray;
	}

	public String getCreate() {
//		if (this.getCreatename() != null) {//如果创建人的学号不为空
//			//根据学号查询出创建人的姓名
//			System.out.println("________________"+this.getCreatename());
//			ManageServiceImpl manageServiceImpl = new ManageServiceImpl();
//			System.err.println(manageServiceImpl);
//			String createName = manageServiceImpl.queryManageById(this.getCreatename()).getRealname();
//			this.setCreate(createName);
//			return createName;
//		}
		return create;
	}

	public void setCreate(String create) {
		this.create = create;
	}

	public String getConfir() {
//		if (this.getConfirmname() != null) {//如果创建人的学号不为空
//			//根据学号查询出创建人的姓名
//			return	new ManageServiceImpl().queryManageById(this.getConfirmname()).getRealname();
//		}
		return confir;
	}

	public void setConfir(String confir) {
		this.confir = confir;
	}

	@Override
	public String toString() {
		return "ManageSign [id=" + id + ", createtime=" + createtime
				+ ", week=" + week + ", banci=" + banci + ", createname="
				+ createname + ", create=" + create + ", confirmname="
				+ confirmname + ", confir=" + confir + ", latesdes=" + latesdes
				+ ", bikesdes=" + bikesdes + ", keysdes=" + keysdes
				+ ", cdmd125=" + cdmd125 + ", cdmd182=" + cdmd182 + ", cuq="
				+ cuq + ", edu=" + edu + ", logistics1=" + logistics1
				+ ", logistics2=" + logistics2 + ", cdmdunfinish="
				+ cdmdunfinish + ", remarks=" + remarks + ", bikes="
				+ Arrays.toString(bikes) + ", keys=" + Arrays.toString(keys)
				+ ", tools=" + Arrays.toString(tools) + ", watchs="
				+ Arrays.toString(watchs) + ", watchsArray=" + watchsArray
				+ ", bikesArray=" + bikesArray + ", keysArray=" + keysArray
				+ ", toolsArray=" + toolsArray + "]";
	}
    
    
}