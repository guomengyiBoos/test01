package com.bw.movie.vo;

import com.bw.movie.domain.Movie;

public class MovieVo extends Movie{
	private String startDate;
	private String endDate;
	private Double StartPirce;
	private Double endPrice;
	private Integer startLongtime;
	private Integer endLingtime;
	
	
	private String orderField;
	private String orderMethod;
	
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Double getStartPirce() {
		return StartPirce;
	}
	public void setStartPirce(Double startPirce) {
		StartPirce = startPirce;
	}
	public Double getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(Double endPrice) {
		this.endPrice = endPrice;
	}
	public Integer getStartLongtime() {
		return startLongtime;
	}
	public void setStartLongtime(Integer startLongtime) {
		this.startLongtime = startLongtime;
	}
	public Integer getEndLingtime() {
		return endLingtime;
	}
	public void setEndLingtime(Integer endLingtime) {
		this.endLingtime = endLingtime;
	}
	public String getOrderField() {
		return orderField;
	}
	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	
	
	
}
