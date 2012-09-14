package com.etc.geeks.entity.GoodsSale;


public class SalesGuest {
	String salesHostId=null;//销售信息主表ID
	String salesGuestId=null;//销售信息从表ID
	String unit=null;//计量单位
	String goodsId=null;//商品ID 
	double salesGuestNumber=0.0;//销售数量
	double price=0.0;//销售价格
	String priceType=null;//销售价格类型
	double amount=0.0;//销售金额
	public SalesGuest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesGuest(String salesHostId, String salesGuestId, String unit,
			String goodsId, double salesGuestNumber, double price,
			String priceType, double amount) {
		super();
		this.salesHostId = salesHostId;
		this.salesGuestId = salesGuestId;
		this.unit = unit;
		this.goodsId = goodsId;
		this.salesGuestNumber = salesGuestNumber;
		this.price = price;
		this.priceType = priceType;
		this.amount = amount;
	}
	public String getSalesHostId() {
		return salesHostId;
	}
	public void setSalesHostId(String salesHostId) {
		this.salesHostId = salesHostId;
	}
	public String getSalesGuestId() {
		return salesGuestId;
	}
	public void setSalesGuestId(String salesGuestId) {
		this.salesGuestId = salesGuestId;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public double getsalesGuestNumber() {
		return salesGuestNumber;
	}
	public void setsalesGuestNumber(double salesGuestNumber) {
		this.salesGuestNumber = salesGuestNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "SalesGuest [amount=" + amount + ", goodsId=" + goodsId
				+ ", price=" + price + ", priceType=" + priceType
				+ ", salesGuestId=" + salesGuestId + ", salesGuestNumber="
				+ salesGuestNumber + ", salesHostId=" + salesHostId + ", unit="
				+ unit + "]";
	}
	
	
	
	
}
