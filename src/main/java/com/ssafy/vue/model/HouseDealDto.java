package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

public class HouseDealDto {
	@ApiModelProperty(value = "번호")
	private int no;
	@ApiModelProperty(value = "아파트일련번호")
	private int aptCode;
	@ApiModelProperty(value = "거래금액")
	private String dealAmount;
	@ApiModelProperty(value = "년")
	private int dealYear;
	@ApiModelProperty(value = "월")
	private int dealMonth;
	@ApiModelProperty(value = "일")
	private int dealDay;
	@ApiModelProperty(value = "전용면적")
	private String area;
	@ApiModelProperty(value = "층")
	private String floor;
	@ApiModelProperty(value = "해제여부")
	private String type;
	@ApiModelProperty(value = "전세금")
	private String rentMoney;
	@ApiModelProperty(value = "법정동")
	private String dongName;
	@ApiModelProperty(value = "아파트")
	private String aptName;
	@ApiModelProperty(value = "위도")
	private String lat;
	@ApiModelProperty(value = "경도")
	private String lng;
	@ApiModelProperty(value = "아파트이름자음")
	private String aptNamejaeum;
	@ApiModelProperty(value = "동이름자음")
	private String dongNamejaeum;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getAptCode() {
		return aptCode;
	}
	public void setAptCode(int aptCode) {
		this.aptCode = aptCode;
	}
	public String getDealAmount() {
		return dealAmount;
	}
	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}
	public int getDealYear() {
		return dealYear;
	}
	public void setDealYear(int dealYear) {
		this.dealYear = dealYear;
	}
	public int getDealMonth() {
		return dealMonth;
	}
	public void setDealMonth(int dealMonth) {
		this.dealMonth = dealMonth;
	}
	public int getDealDay() {
		return dealDay;
	}
	public void setDealDay(int dealDay) {
		this.dealDay = dealDay;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRentMoney() {
		return rentMoney;
	}
	public void setRentMoney(String rentMoney) {
		this.rentMoney = rentMoney;
	}
	public String getDongName() {
		return dongName;
	}
	public void setDongName(String dongName) {
		this.dongName = dongName;
	}
	public String getAptName() {
		return aptName;
	}
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getAptNamejaeum() {
		return aptNamejaeum;
	}
	public void setAptNamejaeum(String aptNamejaeum) {
		this.aptNamejaeum = aptNamejaeum;
	}
	public String getDongNamejaeum() {
		return dongNamejaeum;
	}
	public void setDongNamejaeum(String dongNamejaeum) {
		this.dongNamejaeum = dongNamejaeum;
	}
	
	
}
