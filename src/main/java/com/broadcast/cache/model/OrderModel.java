package com.broadcast.cache.model;

import java.io.Serializable;
import java.util.Date;

public class OrderModel implements Serializable{

	private static final long serialVersionUID = -5931646728386494529L;
	
	public OrderModel(){}

	public OrderModel(String name,Long quantity,Date createTime){
		this.setName(name);
		this.setQuantity(quantity);
		this.setCreateTime(createTime);
	}
	
	private String name;
	
	private Long quantity;
	
	private Date createTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
