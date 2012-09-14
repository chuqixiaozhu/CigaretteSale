package com.etc.geeks.action.GoodsInformation;

import java.util.List;

import com.etc.geeks.dao.GoodsInformation.GoodsDao;
import com.etc.geeks.daoimp.GoodsInformation.GoodsDaoImp;
import com.etc.geeks.entity.GoodsInformation.Goods;
import com.etc.geeks.util.PageBean;

public class GoodsAction {
	private List<Goods> goodsList;
	private PageBean pageBean;
	private int currentPage;
	
	
	/**
	 * @return the pageBean
	 */
	public PageBean getPageBean() {
		return pageBean;
	}

	/**
	 * @param pageBean the pageBean to set
	 */
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the goodsList
	 */
	public List<Goods> getGoodsList() {
		return goodsList;
	}

	/**
	 * @param goodsList the goodsList to set
	 */
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	
	public String output()	{
		GoodsDao goodsDao = new GoodsDaoImp();
//		if(pageBean == null){
//			pageBean = new PageBean(1);
//		}else{
//			pageBean.setCurrentPage(pageBean.getCurrentPage());
//		}
		if(pageBean == null) {
			pageBean = new PageBean(currentPage);
		}
		pageBean.setTotalSize(goodsDao.findAllGoods().size());
		
		goodsList = goodsDao.findByPage(pageBean);
		if(goodsList != null) {
			return "success";
		} else {
			return "false";
		}
	}

}
