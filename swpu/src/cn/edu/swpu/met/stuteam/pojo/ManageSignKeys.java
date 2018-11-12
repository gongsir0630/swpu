package cn.edu.swpu.met.stuteam.pojo;

import org.springframework.stereotype.Component;

@Component("manageSignKeys")
public class ManageSignKeys {
    private Integer id;

    private String signtableid;

    private String keyid;

    private Integer station;
    
    private ToolKeys toolKey;
    
    private String keyName;

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

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }

    public Integer getStation() {
        return station;
    }

    public void setStation(Integer station) {
        this.station = station;
    }

	public ToolKeys getToolKey() {
		return toolKey;
	}

	public void setToolKey(ToolKeys toolKey) {
		this.toolKey = toolKey;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	@Override
	public String toString() {
		return "ManageSignKeys [id=" + id + ", signtableid=" + signtableid
				+ ", keyid=" + keyid + ", station=" + station + ", toolKey="
				+ toolKey + ", keyName=" + keyName + "]";
	}
	
	
}