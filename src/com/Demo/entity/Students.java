package com.Demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//ѧ��ʵ���ࡣ

//@Entity(name = "t_students")
@Entity//ӳ��ʵ����
@Table(name="t_students",schema="hibernate")//ָ��������ּ������ڵ����ݿ⡣
public class Students implements Serializable{
	   
	   
	   //@GeneratedValue(strategy=GenerationType.AUTO)//�ַ����������Ļ��͵���generator="s_id"����,
	   // ���һ�Ҫ�õ�@GenericGenerator(name="s_id",startegy="assigned")
	   @EmbeddedId
       private StudentsPrimaryKey pk;//ѧ��
	   //@Id//��������������s_id��s_name
	   //@Column(length=8)//�������ͳ���,���ַ�����Ϊ��������ô�䳤�Ⱦͳ��������������ƣ�����Ҫ�������ơ�
       private String s_name;//����
       private String s_gender;//�Ա�
       private Date birthday;//����
       private String major;//רҵ
       private Address add;//��ַ
       
       
      
       
       
       
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
