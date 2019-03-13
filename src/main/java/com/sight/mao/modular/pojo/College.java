package com.sight.mao.modular.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class College implements Serializable {
    private Integer id;

    private String name;

    private String shortName;

    private String imageUrl;

    private String introduce;

    private String provinceCode;

    private String provinceName;

    private String cityCode;

    private String cityName;

    private String areaCode;

    private String areaName;

    private String addressDetail;

    private BigDecimal lot;

    private BigDecimal lat;

    private Byte openStatus;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public College(Integer id, String name, String shortName, String imageUrl, String introduce, String provinceCode, String provinceName, String cityCode, String cityName, String areaCode, String areaName, String addressDetail, BigDecimal lot, BigDecimal lat, Byte openStatus, Date createTime, Date modifyTime) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.imageUrl = imageUrl;
        this.introduce = introduce;
        this.provinceCode = provinceCode;
        this.provinceName = provinceName;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.areaCode = areaCode;
        this.areaName = areaName;
        this.addressDetail = addressDetail;
        this.lot = lot;
        this.lat = lat;
        this.openStatus = openStatus;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public College() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public BigDecimal getLot() {
        return lot;
    }

    public void setLot(BigDecimal lot) {
        this.lot = lot;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public Byte getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Byte openStatus) {
        this.openStatus = openStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}