package com.spring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_user database table.
 * 
 */
@Entity
@Table(name="t_user")
@NamedQuery(name="TUser.findAll", query="SELECT t FROM TUser t")
public class TUser implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userId;
	private String password;
	private String type;

	public TUser() {
	}


	@Id
	@Column(name="user_id")
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}