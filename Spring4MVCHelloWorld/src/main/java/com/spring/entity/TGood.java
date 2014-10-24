package com.spring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_goods database table.
 * 
 */
@Entity
@Table(name="t_goods")
@NamedQuery(name="TGood.findAll", query="SELECT t FROM TGood t")
public class TGood implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String goodsName;
	private String value;

	public TGood() {
	}


	@Id
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Column(name="goods_name")
	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}