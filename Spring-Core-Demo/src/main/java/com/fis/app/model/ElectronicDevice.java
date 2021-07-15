package com.fis.app.model;

public class ElectronicDevice {
	
	private int deviceId;
	private String deviceType;
	private String brandName;
	private int cost;
	private int power;
	private int starRatings;
	private String color;
	
	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicDevice(int deviceId, String deviceType, String brandName, int cost, int power, int starRatings,
			String color) {
		super();
		this.deviceId = deviceId;
		this.deviceType = deviceType;
		this.brandName = brandName;
		this.cost = cost;
		this.power = power;
		this.starRatings = starRatings;
		this.color = color;
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getStarRatings() {
		return starRatings;
	}
	public void setStarRatings(int starRatings) {
		this.starRatings = starRatings;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + cost;
		result = prime * result + deviceId;
		result = prime * result + ((deviceType == null) ? 0 : deviceType.hashCode());
		result = prime * result + power;
		result = prime * result + starRatings;
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
		ElectronicDevice other = (ElectronicDevice) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (cost != other.cost)
			return false;
		if (deviceId != other.deviceId)
			return false;
		if (deviceType == null) {
			if (other.deviceType != null)
				return false;
		} else if (!deviceType.equals(other.deviceType))
			return false;
		if (power != other.power)
			return false;
		if (starRatings != other.starRatings)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ElectronicDevice [deviceId=" + deviceId + ", deviceType=" + deviceType + ", brandName=" + brandName
				+ ", cost=" + cost + ", power=" + power + ", starRatings=" + starRatings + ", color=" + color + "]";
	}
	
	
	
	
}
