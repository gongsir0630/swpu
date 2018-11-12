package cn.edu.swpu.met.stuteam.pojo.vo;
/**
 * @ClassName: ManageWatch
 * @Description: 这个类暂时只用在更新签到表中的值班人员包装
 * @author: 朱军
 * @date:2018年2月27日 下午9:10:50
 * @version :1.0
 * 
 */
public class ManageWatch {
	private String id;

    private String realName;
    
    private Integer station;//表示该人员的在班状态
    
    private Integer exist;//表示该人员是否值班
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getStation() {
		return station;
	}

	public void setStation(Integer station) {
		this.station = station;
	}

	public Integer getExist() {
		return exist;
	}

	public void setExist(Integer exist) {
		this.exist = exist;
	}
    
    
}
