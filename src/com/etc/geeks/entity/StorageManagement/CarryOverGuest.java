package com.etc.geeks.entity.StorageManagement;


public class CarryOverGuest {
	private String carryOverHostId;//库存结转主表ID
	private String carryOverGuestId;//库存结转从表ID
	private String goodsId;//商品ID
	private String unit;//计量单位
	private int number;//数量
	private double price;//单价
	private double amount;//金额
	
	public CarryOverGuest() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public CarryOverGuest(String carryOverHostId, String carryOverGuestId,
			String goodsId, String unit, int number, double price, double amount) {
		super();
		this.carryOverHostId = carryOverHostId;
		this.carryOverGuestId = carryOverGuestId;
		this.goodsId = goodsId;
		this.unit = unit;
		this.number = number;
		this.price = price;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "CarryOverGuest [amount=" + amount + ", carryOverGuestId="
				+ carryOverGuestId + ", carryOverHostId=" + carryOverHostId
				+ ", goodsId=" + goodsId + ", number=" + number + ", price="
				+ price + ", unit=" + unit + "]";
	}

	
	
}
