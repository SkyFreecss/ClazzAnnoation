package com.Demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//学生实体类。

//@Entity(name = "t_students")
@Entity//映射实体类
@Table(name="t_students",schema="hibernate")//指定表的名字及表所在的数据库。
public class Students implements Serializable{
	   
	   
	   //@GeneratedValue(strategy=GenerationType.AUTO)//字符串做主键的话就得用generator="s_id"属性,
	   // 而且还要用到@GenericGenerator(name="s_id",startegy="assigned")
	   @EmbeddedId
       private StudentsPrimaryKey pk;//学号
	   //@Id//创建联合主键，s_id和s_name
	   //@Column(length=8)//限制类型长度,若字符串作为主键，那么其长度就超过了主键的限制，所以要进行限制。
       private String s_name;//姓名
       private String s_gender;//性别
       private Date birthday;//生日
       private String major;//专业
       private Address add;//地址
       
       
      
       
       
       
    public Students(StudentsPrimaryKey pk, String s_name, String s_gender, Date birthday, String major, Address add) {
		super();
		this.pk = pk;
		this.s_name = s_name;
		this.s_gender = s_gender;
		this.birthday = birthday;
		this.major = major;
		this.add = add;
	}
    
	@Override
	public String toString() {
		return "Students [pk=" + pk + ", s_name=" + s_name + ", s_gender=" + s_gender + ", birthday=" + birthday
				+ ", major=" + major + ", add=" + add + "]";
	}
  
	public StudentsPrimaryKey getPk() {
		return pk;
	}
	public void setPk(StudentsPrimaryKey pk) {
		this.pk = pk;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_gender() {
		return s_gender;
	}
	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
    
	@Embedded
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
}
