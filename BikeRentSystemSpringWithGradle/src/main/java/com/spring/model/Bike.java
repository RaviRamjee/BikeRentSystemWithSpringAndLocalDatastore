package com.spring.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Bike {
	@Id
	private String bikeId;
    private String bikeName;
    private String bikeDescription;
    private String bikeCategory;
    private String bikeCompany;
    private String bikeModel;
    private String bikeRCNo;
    private String bikeRCName;
    private String bikeRCRegDate;
    private String bikeRCExpDate;
    private String bikeRCCHNO;
    private String bikeRCEnginNo;
    private String bikeYearMfg;
    private int bikeNoOfGear;
    //private String bike_img;
    private String bikeColor;
    private int selfstart;
    private int bikeEnginCC;
    //private int tariff_id;
    //private int topup_id;
    private int status;

    public Bike() {
    }

	public Bike(String bikeId, String bikeName, String bikeDescription, String bikeCategory, String bikeCompany,
			String bikeModel, String bikeRCNo, String bikeRCName, String bikeRCRegDate, String bikeRCExpDate,
			String bikeRCCHNO, String bikeRCEnginNo, String bikeYearMfg, int bikeNoOfGear, String bikeColor,
			int selfstart, int bikeEnginCC, int status) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.bikeDescription = bikeDescription;
		this.bikeCategory = bikeCategory;
		this.bikeCompany = bikeCompany;
		this.bikeModel = bikeModel;
		this.bikeRCNo = bikeRCNo;
		this.bikeRCName = bikeRCName;
		this.bikeRCRegDate = bikeRCRegDate;
		this.bikeRCExpDate = bikeRCExpDate;
		this.bikeRCCHNO = bikeRCCHNO;
		this.bikeRCEnginNo = bikeRCEnginNo;
		this.bikeYearMfg = bikeYearMfg;
		this.bikeNoOfGear = bikeNoOfGear;
		this.bikeColor = bikeColor;
		this.selfstart = selfstart;
		this.bikeEnginCC = bikeEnginCC;
		this.status = status;
	}

	public String getBikeId() {
		return bikeId;
	}

	public void setBikeId(String bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeDescription() {
		return bikeDescription;
	}

	public void setBikeDescription(String bikeDescription) {
		this.bikeDescription = bikeDescription;
	}

	public String getBikeCategory() {
		return bikeCategory;
	}

	public void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}

	public String getBikeCompany() {
		return bikeCompany;
	}

	public void setBikeCompany(String bikeCompany) {
		this.bikeCompany = bikeCompany;
	}

	public String getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}

	public String getBikeRCNo() {
		return bikeRCNo;
	}

	public void setBikeRCNo(String bikeRCNo) {
		this.bikeRCNo = bikeRCNo;
	}

	public String getBikeRCName() {
		return bikeRCName;
	}

	public void setBikeRCName(String bikeRCName) {
		this.bikeRCName = bikeRCName;
	}

	public String getBikeRCRegDate() {
		return bikeRCRegDate;
	}

	public void setBikeRCRegDate(String bikeRCRegDate) {
		this.bikeRCRegDate = bikeRCRegDate;
	}

	public String getBikeRCExpDate() {
		return bikeRCExpDate;
	}

	public void setBikeRCExpDate(String bikeRCExpDate) {
		this.bikeRCExpDate = bikeRCExpDate;
	}

	public String getBikeRCCHNO() {
		return bikeRCCHNO;
	}

	public void setBikeRCCHNO(String bikeRCCHNO) {
		this.bikeRCCHNO = bikeRCCHNO;
	}

	public String getBikeRCEnginNo() {
		return bikeRCEnginNo;
	}

	public void setBikeRCEnginNo(String bikeRCEnginNo) {
		this.bikeRCEnginNo = bikeRCEnginNo;
	}

	public String getBikeYearMfg() {
		return bikeYearMfg;
	}

	public void setBikeYearMfg(String bikeYearMfg) {
		this.bikeYearMfg = bikeYearMfg;
	}

	public int getBikeNoOfGear() {
		return bikeNoOfGear;
	}

	public void setBikeNoOfGear(int bikeNoOfGear) {
		this.bikeNoOfGear = bikeNoOfGear;
	}

	public String getBikeColor() {
		return bikeColor;
	}

	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}

	public int getSelfstart() {
		return selfstart;
	}

	public void setSelfstart(int selfstart) {
		this.selfstart = selfstart;
	}

	public int getBikeEnginCC() {
		return bikeEnginCC;
	}

	public void setBikeEnginCC(int bikeEnginCC) {
		this.bikeEnginCC = bikeEnginCC;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
    
    

  
   

}
