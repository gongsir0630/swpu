package cn.edu.swpu.met.stuteam.pojo.vo;
/**
 * @ClassName: ManageWatch
 * @Description: �������ʱֻ���ڸ���ǩ�����е�ֵ����Ա��װ
 * @author: ���
 * @date:2018��2��27�� ����9:10:50
 * @version :1.0
 * 
 */
public class ManageWatch {
	private String id;

    private String realName;
    
    private Integer station;//��ʾ����Ա���ڰ�״̬
    
    private Integer exist;//��ʾ����Ա�Ƿ�ֵ��
    
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
