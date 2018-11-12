package cn.edu.swpu.met.stuteam.pojo;

import java.util.Date;




import org.springframework.stereotype.Component;
//使用注解配置该对象在spring中的名字  相当于<bean name="manage" class="cn.edu.swpu.stuteam.pojo.Manage"
//@Repository("manage")

//@Scope(scopeName="") 该注解可以指定对象的作用范围
@Component("manage")
public class Manage {
	
	//给对象进行赋值1.首先把要赋值的对象放在spring容器中   
	//2.1使用@AutoWired进行自动装配（原理：在容器中找符合该类型的对象，然后进行匹配）
	//2.2 当有多个同类型的对象时，autoWired将无法选择     @Qualifier("对象的名称")  需要和autoWired同时使用
	//2.3  @Resource(name="对象的名字")   推荐使用这种
	
	//使用@Value（“Tome”）可以实现给属性注入一个值，注解也可以放在set方法上 ，两种方法的区别是：前者通过反射的field进行赋值 ，如果属性只有一个需要赋值，且是value，可以省略建value
	//后者通过set方法进行赋值，前者会破坏对象的封装性，因为它可以直接访问属性，而属性是被私有化的，所以不能被直接访问
	
	
	
	//注解初始化方法
	//@PostConstruct 在调用构造函数数之后调用的方法，即对象创建后执行的方法
	//@PreDestroy 对象销毁之前执行的方法 ，即对象销毁的方法
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
    
    private Integer jionFinishOrder; //修改工单中为了列出出单人所添加的属性   1代表出单  2代表没有出单

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