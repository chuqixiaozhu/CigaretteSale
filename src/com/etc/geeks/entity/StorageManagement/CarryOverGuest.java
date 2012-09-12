package com.etc.geeks.entity.StorageManagement;


public class CarryOverGuest {
	private String carryOverHostId;
	private String carryOverGuestId;
	private String goodsId;
	
	private String unit;
	
	private int number;
	private int price;
	private int amount;
	public String getCarryOverHostId() {
		return carryOverHostId;
	}
	public void setCarryOverHostId(String carryOverHostId) {
		this.carryOverHostId = carryOverHostId;
	}
	public String getCarryOverGuestId() {
		return carryOverGuestId;
	}
	public void setCarryOverGuestId(String carryOverGuestId) {
		this.carryOverGuestId = carryOverGuestId;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "CarryOverGuest [amount=" + amount + ", carryOverGuestId="
				+ carryOverGuestId + ", carryOverHostId=" + carryOverHostId
				+ ", goodsId=" + goodsId + ", number=" + number + ", price="
				+ price + ", unit=" + unit + "]";
	}
	public CarryOverGuest(String carryOverHostId, String carryOverGuestId,
			String goodsId, String unit, int number, int price, int amount) {
		super();
		this.carryOverHostId = carryOverHostId;
		this.carryOverGuestId = carryOverGuestId;
		this.goodsId = goodsId;
		this.unit = unit;
		this.number = number;
		this.price = price;
		this.amount = amount;
	}
	
	
}
