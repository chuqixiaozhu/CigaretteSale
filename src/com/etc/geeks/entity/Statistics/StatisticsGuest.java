package com.etc.geeks.entity.Statistics;

public class StatisticsGuest {
	/**
	 * 属性
	 */
	private String statisticsGuestId;
	private String statisticsHostId;
	private String goodsId;
	
	private int lastNumber;      			//上期数量
	private int lastPrice;  				//上期单价
	private int lastAmount; 				//上期金额
	
	private int nowInStoreNumber;			//本期入库数量
	private int nowInStoreCost;			//本期入库单价
	private int nowInStoreAmount;		//本期入库金额
	
	private int nowSalesNumber;				//本期销售数量
	private int nowSalesPrice;				//本期销售单价
	private int nowSalesAmount;				//本期销售金额
	
	private int SalesCost;	
	
	private int nowStorageNumber;			//本期库存数量
	private int nowStoragePrice;			//本期库存价格
	private int nowStorageAmount;			//本期库存金额
	
	private int profit;						//毛利

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

	public int getLastNumber() {
		return lastNumber;
	}

	public void setLastNumber(int lastNumber) {
		this.lastNumber = lastNumber;
	}

	public int getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(int lastPrice) {
		this.lastPrice = lastPrice;
	}

	public int getLastAmount() {
		return lastAmount;
	}

	public void setLastAmount(int lastAmount) {
		this.lastAmount = lastAmount;
	}

	public int getNowInStoreNumber() {
		return nowInStoreNumber;
	}

	public void setNowInStoreNumber(int nowInStoreNumber) {
		this.nowInStoreNumber = nowInStoreNumber;
	}

	public int getNowInStoreCost() {
		return nowInStoreCost;
	}

	public void setNowInStoreCost(int nowInStoreCost) {
		this.nowInStoreCost = nowInStoreCost;
	}

	public int getNowInStoreAmount() {
		return nowInStoreAmount;
	}

	public void setNowInStoreAmount(int nowInStoreAmount) {
		this.nowInStoreAmount = nowInStoreAmount;
	}

	public int getNowSalesNumber() {
		return nowSalesNumber;
	}

	public void setNowSalesNumber(int nowSalesNumber) {
		this.nowSalesNumber = nowSalesNumber;
	}

	public int getNowSalesPrice() {
		return nowSalesPrice;
	}

	public void setNowSalesPrice(int nowSalesPrice) {
		this.nowSalesPrice = nowSalesPrice;
	}

	public int getNowSalesAmount() {
		return nowSalesAmount;
	}

	public void setNowSalesAmount(int nowSalesAmount) {
		this.nowSalesAmount = nowSalesAmount;
	}

	public int getSalesCost() {
		return SalesCost;
	}

	public void setSalesCost(int salesCost) {
		SalesCost = salesCost;
	}

	public int getNowStorageNumber() {
		return nowStorageNumber;
	}

	public void setNowStorageNumber(int nowStorageNumber) {
		this.nowStorageNumber = nowStorageNumber;
	}

	public int getNowStoragePrice() {
		return nowStoragePrice;
	}

	public void setNowStoragePrice(int nowStoragePrice) {
		this.nowStoragePrice = nowStoragePrice;
	}

	public int getNowStorageAmount() {
		return nowStorageAmount;
	}

	public void setNowStorageAmount(int nowStorageAmount) {
		this.nowStorageAmount = nowStorageAmount;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
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
		String goodsId, int lastNumber, int lastPrice, int lastAmount,
		int nowInStoreNumber, int currentInStoreCost,
		int currentInStoreAmount, int nowSalesNumber, int nowSalesPrice,
		int nowSalesAmount, int salesCost, int nowStorageNumber,
		int nowStoragePrice, int nowStorageAmount, int profit) {
		
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
	
	/**
	 * generator using super
	 */
	public StatisticsGuest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
