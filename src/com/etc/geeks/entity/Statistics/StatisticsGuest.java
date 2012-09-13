package com.etc.geeks.entity.Statistics;

public class StatisticsGuest {

	/**
	 * 属性
	 */
	private String statisticsGuestId;       //统计从表ID
	private String statisticsHostId;        //统计主表ID
	private String goodsId;                 //商品ID
	
	private double lastNumber;      			//上期数量
	private double lastPrice;  				//上期单价
	private double lastAmount; 				//上期金额
	
	private double nowInStoreNumber;			//本期入库数量
	private double nowInStoreCost;			//本期入库单价
	private double nowInStoreAmount;		//本期入库金额
	
	private double nowSalesNumber;				//本期销售数量
	private double nowSalesPrice;				//本期销售单价
	private double nowSalesAmount;				//本期销售金额
	
	private double SalesCost;	
	
	private double nowStorageNumber;			//本期库存数量
	private double nowStoragePrice;			//本期库存价格
	private double nowStorageAmount;			//本期库存金额
	
	private double profit;						//毛利

	/**
	 * set & get function
	 */
	public String getStatisticsGuestId() {
		return statisticsGuestId;
	}

	public void setStatisticsGuestId(String statisticsGuestId) {
		this.statisticsGuestId = statisticsGuestId;
	}

	public String getStatisticsHostId() {
		return statisticsHostId;
	}

	public void setStatisticsHostId(String statisticsHostId) {
		this.statisticsHostId = statisticsHostId;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public double getLastNumber() {
		return lastNumber;
	}

	public void setLastNumber(double lastNumber) {
		this.lastNumber = lastNumber;
	}

	public double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public double getLastAmount() {
		return lastAmount;
	}

	public void setLastAmount(double lastAmount) {
		this.lastAmount = lastAmount;
	}

	public double getNowInStoreNumber() {
		return nowInStoreNumber;
	}

	public void setNowInStoreNumber(double nowInStoreNumber) {
		this.nowInStoreNumber = nowInStoreNumber;
	}

	public double getNowInStoreCost() {
		return nowInStoreCost;
	}

	public void setNowInStoreCost(double nowInStoreCost) {
		this.nowInStoreCost = nowInStoreCost;
	}

	public double getNowInStoreAmount() {
		return nowInStoreAmount;
	}

	public void setNowInStoreAmount(double nowInStoreAmount) {
		this.nowInStoreAmount = nowInStoreAmount;
	}

	public double getNowSalesNumber() {
		return nowSalesNumber;
	}

	public void setNowSalesNumber(double nowSalesNumber) {
		this.nowSalesNumber = nowSalesNumber;
	}

	public double getNowSalesPrice() {
		return nowSalesPrice;
	}

	public void setNowSalesPrice(double nowSalesPrice) {
		this.nowSalesPrice = nowSalesPrice;
	}

	public double getNowSalesAmount() {
		return nowSalesAmount;
	}

	public void setNowSalesAmount(double nowSalesAmount) {
		this.nowSalesAmount = nowSalesAmount;
	}

	public double getSalesCost() {
		return SalesCost;
	}

	public void setSalesCost(double salesCost) {
		SalesCost = salesCost;
	}

	public double getNowStorageNumber() {
		return nowStorageNumber;
	}

	public void setNowStorageNumber(double nowStorageNumber) {
		this.nowStorageNumber = nowStorageNumber;
	}

	public double getNowStoragePrice() {
		return nowStoragePrice;
	}

	public void setNowStoragePrice(double nowStoragePrice) {
		this.nowStoragePrice = nowStoragePrice;
	}

	public double getNowStorageAmount() {
		return nowStorageAmount;
	}

	public void setNowStorageAmount(double nowStorageAmount) {
		this.nowStorageAmount = nowStorageAmount;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	/**
	 * generator using properties
	 * @param statisticsGuestId
	 * @param statisticsHostId
	 * @param goodsId
	 * @param lastNumber
	 * @param lastPrice
	 * @param lastAmount
	 * @param nowInStoreNumber
	 * @param currentInStoreCost
	 * @param currentInStoreAmount
	 * @param nowSalesNumber
	 * @param nowSalesPrice
	 * @param nowSalesAmount
	 * @param salesCost
	 * @param nowStorageNumber
	 * @param nowStoragePrice
	 * @param nowStorageAmount
	 * @param profit
	 */
	public StatisticsGuest(String statisticsGuestId, String statisticsHostId,
		String goodsId, double lastNumber, double lastPrice, double lastAmount,
		double nowInStoreNumber, double currentInStoreCost,
		double currentInStoreAmount, double nowSalesNumber, double nowSalesPrice,
		double nowSalesAmount, double salesCost, double nowStorageNumber,
		double nowStoragePrice, double nowStorageAmount, double profit) {
		
		super();
		
		this.statisticsGuestId = statisticsGuestId;
		this.statisticsHostId = statisticsHostId;
		this.goodsId = goodsId;
		this.lastNumber = lastNumber;
		this.lastPrice = lastPrice;
		this.lastAmount = lastAmount;
		this.nowInStoreNumber = nowInStoreNumber;
		nowInStoreCost = currentInStoreCost;
		nowInStoreAmount = currentInStoreAmount;
		this.nowSalesNumber = nowSalesNumber;
		this.nowSalesPrice = nowSalesPrice;
		this.nowSalesAmount = nowSalesAmount;
		SalesCost = salesCost;
		this.nowStorageNumber = nowStorageNumber;
		this.nowStoragePrice = nowStoragePrice;
		this.nowStorageAmount = nowStorageAmount;
		this.profit = profit;
	}
	@Override
	public String toString() {
		return "StatisticsGuest [SalesCost=" + SalesCost + ", goodsId="
				+ goodsId + ", lastAmount=" + lastAmount + ", lastNumber="
				+ lastNumber + ", lastPrice=" + lastPrice
				+ ", nowInStoreAmount=" + nowInStoreAmount
				+ ", nowInStoreCost=" + nowInStoreCost + ", nowInStoreNumber="
				+ nowInStoreNumber + ", nowSalesAmount=" + nowSalesAmount
				+ ", nowSalesNumber=" + nowSalesNumber + ", nowSalesPrice="
				+ nowSalesPrice + ", nowStorageAmount=" + nowStorageAmount
				+ ", nowStorageNumber=" + nowStorageNumber
				+ ", nowStoragePrice=" + nowStoragePrice + ", profit=" + profit
				+ ", statisticsGuSstId=" + statisticsGuestId
				+ ", statisticsHostId=" + statisticsHostId + "]";
	}

	/**
	 * generator using super
	 */
	public StatisticsGuest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
