package com.Demo.entity;

import javax.persistence.Embeddable;

//��ַ��
@Embeddable //��ʾһ��Ƕ���࣬�����Ķ�������һ��ʵ�����г䵱���ԡ�
public class Address {
       private String postCode;//�ʱ�
       private String address;//��ַ
       private String phone;//��ϵ�绰
       
       public Address()
       {
    	   
       }

	public Address(String postCode, String address, String phone) {
		super();
		this.postCode = postCode;
		this.address = address;
		this.phone = phone;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
