package com.etc.geeks.entity.GoodsInformation;

public class GoodsSmallClass {

	private String goodsSmallClassId;//	商品小类ID
	private String goodsLargeClassId;//	商品大类ID
	private String goodsSmallClassName;//	商品小类名称
	public GoodsSmallClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsSmallClass(String goodsSmallClassId, String goodsLargeClassId,
			String goodsSmallClassName) {
		super();
		this.goodsSmallClassId = goodsSmallClassId;
		this.goodsLargeClassId = goodsLargeClassId;
		this.goodsSmallClassName = goodsSmallClassName;
	}
	public String getGoodsSmallClassId() {
		return goodsSmallClassId;
	}
	public void setGoodsSmallClassId(String goodsSmallClassId) {
		this.goodsSmallClassId = goodsSmallClassId;
	}
	public String getGoodsLargeClassId() {
		return goodsLargeClassId;
	}
	public void setGoodsLargeClassId(String goodsLargeClassId) {
		this.goodsLargeClassId = goodsLargeClassId;
	}
	public String getGoodsSmallClassName() {
		return goodsSmallClassName;
	}
	public void setGoodsSmallClassName(String goodsSmallClassName) {
		this.goodsSmallClassName = goodsSmallClassName;
	}
	@Override
	public String toString() {
		return "GoodsSmallClass [goodsLargeClassId=" + goodsLargeClassId
				+ ", goodsSmallClassId=" + goodsSmallClassId
				+ ", goodsSmallClassName=" + goodsSmallClassName + "]";
	}

}
