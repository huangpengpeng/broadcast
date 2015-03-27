package com.broadcast.cache.model;

import java.io.Serializable;

import org.eclipse.swt.graphics.RGB;

public class _屏幕Model implements Serializable {
	
	private static final long serialVersionUID = 7745774137336065411L;

	public _屏幕Model(){}

	public _屏幕Model(Integer width,Integer height,RGB rgb){
		this.setWidth(width);
		this.setHeidht(height);
		this.setRgb(rgb);
	}
	
	private Integer width;
	
	private Integer heidht;
	
	private RGB rgb;

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeidht() {
		return heidht;
	}

	public void setHeidht(Integer heidht) {
		this.heidht = heidht;
	}

	public RGB getRgb() {
		return rgb;
	}

	public void setRgb(RGB rgb) {
		this.rgb = rgb;
	}
}
