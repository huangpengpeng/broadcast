package com.broadcast.cache.model;

import java.io.Serializable;

public class _排名Model implements Serializable {

	private static final long serialVersionUID = 381289597985756530L;
	
	public _排名Model(){}
	
	public _排名Model(Integer width,Integer height,Integer left,Integer top,Integer fontSize,String rgb){
		this.setWidth(width);
		this.setHeight(height);
		this.setLeft(left);
		this.setTop(top);
		this.setFontSize(fontSize);
		this.setRgb(rgb);
	}

	private Integer width;

	private Integer height;

	private Integer left;

	private Integer top;

	private Integer fontSize;
	
	private String rgb;

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getLeft() {
		return left;
	}

	public void setLeft(Integer left) {
		this.left = left;
	}

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	public Integer getFontSize() {
		return fontSize;
	}

	public void setFontSize(Integer fontSize) {
		this.fontSize = fontSize;
	}

	public String getRgb() {
		return rgb;
	}

	public void setRgb(String rgb) {
		this.rgb = rgb;
	}
}
