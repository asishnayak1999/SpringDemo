package com.fis.app.model;

import java.util.Objects;

public class Sits {
	
	private String brandName;
	private String color;
	public Sits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sits(String brandName, String color) {
		super();
		this.brandName = brandName;
		this.color = color;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brandName, color);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sits other = (Sits) obj;
		return Objects.equals(brandName, other.brandName) && Objects.equals(color, other.color);
	}
	@Override
	public String toString() {
		return "\n Sits  [brandName=" + brandName + ", color=" + color + "]";
	}
	
}
