package cn.edu.swpu.met.stuteam.pojo;

public class Orderend {
    private Integer id;

    private String orderid;

    private String enduserid;
    
    private Manage manageInfo;

    public Integer getId() {
        return id;
    }
    
    public Orderend() {
		super();
	}

	public Orderend(String orderid, String enduserid) {
		super();
		this.orderid = orderid;
		this.enduserid = enduserid;
	}



	public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getEnduserid() {
        return enduserid;
    }

    public void setEnduserid(String enduserid) {
        this.enduserid = enduserid == null ? null : enduserid.trim();
    }

	public Manage getManageInfo() {
		return manageInfo;
	}

	public void setManageInfo(Manage manageInfo) {
		this.manageInfo = manageInfo;
	}

	@Override
	public String toString() {
		return "Orderend [id=" + id + ", orderid=" + orderid + ", enduserid="
				+ enduserid + ", manageInfo=" + manageInfo + "]";
	}
	
}