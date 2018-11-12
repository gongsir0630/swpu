package cn.edu.swpu.met.stuteam.pojo;

import org.springframework.stereotype.Component;


@Component("manageSignBikes")
public class ManageSignBikes {
    private Integer id;

    private String signtableid;

    private String bikeid;

    private Integer station;
    
    private ToolBikes toolbikeBike;
    
    private String bikeName;//附加属性，已经在使用

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

    public String getBikeid() {
        return bikeid;
    }

    public void setBikeid(String bikeid) {
        this.bikeid = bikeid == null ? null : bikeid.trim();
    }

    public Integer getStation() {
        return station;
    }

    public void setStation(Integer station) {
        this.station = station;
    }

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public ToolBikes getToolbikeBike() {
		return toolbikeBike;
	}

	public void setToolbikeBike(ToolBikes toolbikeBike) {
		this.toolbikeBike = toolbikeBike;
	}

	@Override
	public String toString() {
		return "ManageSignBikes [id=" + id + ", signtableid=" + signtableid
				+ ", bikeid=" + bikeid + ", station=" + station
				+ ", toolbikeBike=" + toolbikeBike + ", bikeName=" + bikeName
				+ "]";
	}
	
	
	
}