package com.Demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

//嵌入式主键必须实现Serializable接口。
public class StudentsPrimaryKey implements Serializable{
	         
	         /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			 
	         @Column(length=8)
	         private String s_id;//学号
	         

	         @Column(length=18)
	         private String id;//身份证号
	         
	         
			
			public StudentsPrimaryKey(String s_id, String id) {
				super();
				this.s_id = s_id;
				this.id = id;
			}
			public String getS_id() {
				return s_id;
			}
			public void setS_id(String s_id) {
				this.s_id = s_id;
			}
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
 
			
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((id == null) ? 0 : id.hashCode());
				result = prime * result + ((s_id == null) ? 0 : s_id.hashCode());
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				StudentsPrimaryKey other = (StudentsPrimaryKey) obj;
				if (id == null) {
					if (other.id != null)
						return false;
				} else if (!id.equals(other.id))
					return false;
				if (s_id == null) {
					if (other.s_id != null)
						return false;
				} else if (!s_id.equals(other.s_id))
					return false;
				return true;
			}
}
