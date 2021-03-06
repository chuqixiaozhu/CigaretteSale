package com.etc.geeks.entity.StorageManagement;

/**
 * 9.14 11:00 
 * @author Administrator
 *
 */
public class CarryOverGuest {
	private String carryOverHostId;//库存结转主表ID
	private String carryOverGuestId;//库存结转从表ID
	private String goodsId;//商品ID
	private String unit;//计量单位
	private double carryOverGuestNumber;//数量
	private double price;//单价
	private double amount;//金额
	public CarryOverGuest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarryOverGuest(String carryOverHostId, String carryOverGuestId,
			String goodsId, String unit, double carryOverGuestNumber,
			double price, double amount) {
		super();
		this.carryOverHostId = carryOverHostId;
		this.carryOverGuestId = carryOverGuestId;
		this.goodsId = goodsId;
		this.unit = unit;
		this.carryOverGuestNumber = carryOverGuestNumber;
		this.price = price;
		this.amount = amount;
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
	public double getCarryOverGuestNumber() {
		return carryOverGuestNumber;
	}
	public void setCarryOverGuestNumber(double carryOverGuestNumber) {
		this.carryOverGuestNumber = carryOverGuestNumber;
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
	@Override
	public String toString() {
		return "CarryOverGuest [amount=" + amount + ", carryOverGuestId="
				+ carryOverGuestId + ", carryOverGuestNumber="
				+ carryOverGuestNumber + ", carryOverHostId=" + carryOverHostId
				+ ", goodsId=" + goodsId + ", price=" + price + ", unit="
				+ unit + "]";
	}
	
	
	
}
