package cn.edu.swpu.met.stuteam.pojo;

import org.springframework.stereotype.Component;


@Component("manageSignTools")
public class ManageSignTools {
    private Integer id;

    private String signtable;

    private String toolid;

    private Integer station;
    
    private ToolTools tooltool;//附加属性 未使用
    
    private String toolName;//附加属性 已使用

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigntable() {
        return signtable;
    }

    public void setSigntable(String signtable) {
        this.signtable = signtable == null ? null : signtable.trim();
    }

    public String getToolid() {
        return toolid;
    }

    public void setToolid(String toolid) {
        this.toolid = toolid == null ? null : toolid.trim();
    }

    public Integer getStation() {
        return station;
    }

    public void setStation(Integer station) {
        this.station = station;
    }

	public ToolTools getTooltool() {
		return tooltool;
	}

	public void setTooltool(ToolTools tooltool) {
		this.tooltool = tooltool;
	}

	public String getToolName() {
		return toolName;
	}

	public void setToolName(String toolName) {
		this.toolName = toolName;
	}

	@Override
	public String toString() {
		return "ManageSignTools [id=" + id + ", signtable=" + signtable
				+ ", toolid=" + toolid + ", station=" + station + ", tooltool="
				+ tooltool + ", toolName=" + toolName + "]";
	}
	
	
}