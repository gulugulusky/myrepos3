package com.zuikc.entity;

public class Page {
	private int rows;
	private int pages;
	private int currentPage;
	private int startNo;
	private int  pageSize;
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getStartNo() {
		return startNo;
	}
	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
