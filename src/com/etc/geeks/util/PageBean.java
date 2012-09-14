package com.etc.geeks.util;

import java.util.List;

public class PageBean {
	public static int pageSize=5;
	private int totalSize;
	private int currentPage;
	private int totalPage;
	private List<Object> list;
	/**
	 * @return the pagesize
	 */
	public static int getPagesize() {
		return pageSize;
	}
	/**
	 * @param pagesize the pagesize to set
	 */
	public static void setPagesize(int pagesize) {
		pageSize = pagesize;
	}
	/**
	 * @return the totalSize
	 */
	public int getTotalSize() {
		return totalSize;
	}
	/**
	 * @param totalSize the totalSize to set
	 */
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
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
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	/**
	 * @return the list
	 */
	public List<Object> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	
}
