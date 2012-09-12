package com.etc.geeks.entity.StorageManagement;

public class Storage {
	private String goodsId;//商品ID
	private int number;//数量
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Storage [goodsId=" + goodsId + ", number=" + number + "]";
	}
	public Storage(String goodsId, int number) {
		super();
		this.goodsId = goodsId;
		this.number = number;
	}
	public Storage() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
