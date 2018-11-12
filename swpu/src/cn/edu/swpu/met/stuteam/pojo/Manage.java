package cn.edu.swpu.met.stuteam.pojo;

import java.util.Date;




import org.springframework.stereotype.Component;
//ʹ��ע�����øö�����spring�е�����  �൱��<bean name="manage" class="cn.edu.swpu.stuteam.pojo.Manage"
//@Repository("manage")

//@Scope(scopeName="") ��ע�����ָ����������÷�Χ
@Component("manage")
public class Manage {
	
	//��������и�ֵ1.���Ȱ�Ҫ��ֵ�Ķ������spring������   
	//2.1ʹ��@AutoWired�����Զ�װ�䣨ԭ�����������ҷ��ϸ����͵Ķ���Ȼ�����ƥ�䣩
	//2.2 ���ж��ͬ���͵Ķ���ʱ��autoWired���޷�ѡ��     @Qualifier("���������")  ��Ҫ��autoWiredͬʱʹ��
	//2.3  @Resource(name="���������")   �Ƽ�ʹ������
	
	//ʹ��@Value����Tome��������ʵ�ָ�����ע��һ��ֵ��ע��Ҳ���Է���set������ �����ַ����������ǣ�ǰ��ͨ�������field���и�ֵ ���������ֻ��һ����Ҫ��ֵ������value������ʡ�Խ�value
	//����ͨ��set�������и�ֵ��ǰ�߻��ƻ�����ķ�װ�ԣ���Ϊ������ֱ�ӷ������ԣ��������Ǳ�˽�л��ģ����Բ��ܱ�ֱ�ӷ���
	
	
	
	//ע���ʼ������
	//@PostConstruct �ڵ��ù��캯����֮����õķ����������󴴽���ִ�еķ���
	//@PreDestroy ��������֮ǰִ�еķ��� �����������ٵķ���
    private String id;

    private String realname;

    private String password;

    private Integer sex;

    private String phone;

    private String qq;

    private String address;

    private String idcard;

    private Integer type;

    private String major;

    private Date createdate;

    private Date lastlogintime;

    private Date changetime;

    private String changeby;
    
    private Integer jionFinishOrder; //�޸Ĺ�����Ϊ���г�����������ӵ�����   1�������  2����û�г���

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public String getChangeby() {
        return changeby;
    }

    public void setChangeby(String changeby) {
        this.changeby = changeby == null ? null : changeby.trim();
    }

	@Override
	public String toString() {
		return "Manage [id=" + id + ", realname=" + realname + ", password="
				+ password + ", sex=" + sex + ", phone=" + phone + ", qq=" + qq
				+ ", address=" + address + ", idcard=" + idcard + ", type="
				+ type + ", major=" + major + ", createdate=" + createdate
				+ ", lastlogintime=" + lastlogintime + ", changetime="
				+ changetime + ", changeby=" + changeby + "]";
	}

	public Integer getJionFinishOrder() {
		return jionFinishOrder;
	}

	public void setJionFinishOrder(Integer jionFinishOrder) {
		this.jionFinishOrder = jionFinishOrder;
	}
    
}