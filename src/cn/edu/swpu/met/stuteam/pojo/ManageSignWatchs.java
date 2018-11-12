package cn.edu.swpu.met.stuteam.pojo;

import org.springframework.stereotype.Component;

@Component("mangeSignWatchs")
public class ManageSignWatchs {
    private Integer id;

    private String signtableid;

    private String manageid;
    
    private Integer staion;
    //新增一条属性   查询用户的信息
    private Manage manage; //新增属性 暂时未用
    
    private String realName;//新增属性，已经使用

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigntableid() {
        return signtableid;
    }

    public void setSigntableid(String signtableid) {
        this.signtableid = signtableid == null ? null : signtableid.trim();
    }

    public String getManageid() {
        return manageid;
    }

    public void setManageid(String manageid) {
        this.manageid = manageid == null ? null : manageid.trim();
    }

    public Integer getStaion() {
        return staion;
    }

    public void setStaion(Integer staion) {
        this.staion = staion;
    }

	public Manage getManage() {
		return manage;
	}

	public void setManage(Manage manage) {
		this.manage = manage;
	}


	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	@Override
	public String toString() {
		return "ManageSignWatchs [id=" + id + ", signtableid=" + signtableid
				+ ", manageid=" + manageid + ", staion=" + staion + ", manage="
				+ manage + ", realName=" + realName + "]";
	}
}