package com.spring.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the t_cart database table.
 * 
 */
@Entity
@Table(name="t_cart")
@NamedQuery(name="TCart.findAll", query="SELECT t FROM TCart t")
public class TCart implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String userId;

	public TCart() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Column(name="user_id")
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}