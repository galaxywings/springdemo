package com.spring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_map database table.
 * 
 */
@Entity
@Table(name="t_map")
@NamedQuery(name="TMap.findAll", query="SELECT t FROM TMap t")
public class TMap implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String cartId;
	private String goodsId;

	public TMap() {
	}


	@Id
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Column(name="cart_id")
	public String getCartId() {
		return this.cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}


	@Column(name="goods_id")
	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

}