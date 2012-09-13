package com.etc.geeks.entity.StorageManagement;

public class Storage {
	private String goodsId;//商品ID
	private double storageNumber;//数量
	public Storage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Storage(String goodsId, double storageNumber) {
		super();
		this.goodsId = goodsId;
		this.storageNumber = storageNumber;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public double getStorageNumber() {
		return storageNumber;
	}
	public void setStorageNumber(double storageNumber) {
		this.storageNumber = storageNumber;
	}
	@Override
	public String toString() {
		return "Storage [goodsId=" + goodsId + ", storageNumber="
				+ storageNumber + "]";
	}
	
	
}
