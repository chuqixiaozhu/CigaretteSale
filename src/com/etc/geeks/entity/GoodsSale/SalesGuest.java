package com.etc.geeks.entity.GoodsSale;

import java.util.Date;

public class SalesGuest {
	String salesHostId=null;//销售信息主表ID
	String salesGuestId=null;//销售信息从表ID
	double amount=0.0;//销售金额
	String goodsId=null;//商品ID
	double number=0.0;//销售数量
	double price=0.0;//销售价格
	String priceType=null;//销售价格类型
	public SalesGuest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesGuest(String salesHostId, String salesGuestId, double amount,
			String goodsId, double number, double price, String priceType) {
		super();
		this.salesHostId = salesHostId;
		this.salesGuestId = salesGuestId;
		this.amount = amount;
		this.goodsId = goodsId;
		this.number = number;
		this.price = price;
		this.priceType = priceType;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
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
	
	
	
}
