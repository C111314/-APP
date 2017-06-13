package cn.appinfodb.pojo;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

public class Info implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 431097569840327123L;
	private BigInteger id;
	private String softwareName;//软件名称
	private String APKName;//APK名称（唯一）
	private String supportROM;//支持ROM
	private String interfaceLanguage;//界面语言
	private String softwareSize;//软件大小（单位：M）
	private Date updateDate;//更新日期
	private BigInteger devId;//开发者id（来源于：dev_user表的开发者id）
	private String appInfo;//应用简介
	private BigInteger status;//状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）
	private Date onSaleDate;//上架时间
	private Date offSaleDate;//下架时间
	private BigInteger flatformId;//所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）
	private BigInteger categoryLevel3;//所属三级分类（来源于：data_dictionary）
	private BigInteger downloads;//下载量（单位：次）
	private BigInteger createdBy;//创建者（来源于dev_user开发者信息表的用户id）
	private Date creationDate;//创建时间
	private BigInteger modifyBy;//更新者（来源于dev_user开发者信息表的用户id）
	private Date modifyDate;//最新更新时间
	private BigInteger categoryLevel1;//所属一级分类（来源于：data_dictionary）
	private BigInteger categoryLevel2;//所属二级分类（来源于：data_dictionary
	private String logoPicPath;//LOGO图片url路径
	private String logoLocPath;//LOGO图片的服务器存储路径
	private BigInteger versionId;//最新的版本id
	private DataDictionary dataDictionary;
	private Category category;
	
	private String versionNo;
	private String valueName;
	private String flatformName;
	private String statusName;
	private String categoryName;
	private String categoryLevel1Name;
	private String categoryLevel2Name;
	private String categoryLevel3Name;

	
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getValueName() {
		return valueName;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	public String getFlatformName() {
		return flatformName;
	}
	public void setFlatformName(String flatformName) {
		this.flatformName = flatformName;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryLevel1Name() {
		return categoryLevel1Name;
	}
	public void setCategoryLevel1Name(String categoryLevel1Name) {
		this.categoryLevel1Name = categoryLevel1Name;
	}
	public String getCategoryLevel2Name() {
		return categoryLevel2Name;
	}
	public void setCategoryLevel2Name(String categoryLevel2Name) {
		this.categoryLevel2Name = categoryLevel2Name;
	}
	public String getCategoryLevel3Name() {
		return categoryLevel3Name;
	}
	public void setCategoryLevel3Name(String categoryLevel3Name) {
		this.categoryLevel3Name = categoryLevel3Name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public DataDictionary getDataDictionary() {
		return dataDictionary;
	}
	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}
	public Info(){}
	public Info(BigInteger id, String softwareName, String aPKName,
			String supportROM, String interfaceLanguage, String softwareSize,
			Date updateDate, BigInteger devId, String appInfo,
			BigInteger status, Date onSaleDate, Date offSaleDate,
			BigInteger flatformId, BigInteger categoryLevel3,
			BigInteger downloads, BigInteger createdBy, Date creationDate,
			BigInteger modifyBy, Date modifyDate, BigInteger categoryLevel1,
			BigInteger categoryLevel2, String logoPicPath, String logoLocPath,
			BigInteger versionId) {
		super();
		this.id = id;
		this.softwareName = softwareName;
		APKName = aPKName;
		this.supportROM = supportROM;
		this.interfaceLanguage = interfaceLanguage;
		this.softwareSize = softwareSize;
		this.updateDate = updateDate;
		this.devId = devId;
		this.appInfo = appInfo;
		this.status = status;
		this.onSaleDate = onSaleDate;
		this.offSaleDate = offSaleDate;
		this.flatformId = flatformId;
		this.categoryLevel3 = categoryLevel3;
		this.downloads = downloads;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.categoryLevel1 = categoryLevel1;
		this.categoryLevel2 = categoryLevel2;
		this.logoPicPath = logoPicPath;
		this.logoLocPath = logoLocPath;
		this.versionId = versionId;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public String getSupportROM() {
		return supportROM;
	}
	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public String getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(String softwareSize) {
		this.softwareSize = softwareSize;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public BigInteger getDevId() {
		return devId;
	}
	public void setDevId(BigInteger devId) {
		this.devId = devId;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public BigInteger getStatus() {
		return status;
	}
	public void setStatus(BigInteger status) {
		this.status = status;
	}
	public Date getOnSaleDate() {
		return onSaleDate;
	}
	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	public Date getOffSaleDate() {
		return offSaleDate;
	}
	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	public BigInteger getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(BigInteger flatformId) {
		this.flatformId = flatformId;
	}
	public BigInteger getCategoryLevel3() {
		return categoryLevel3;
	}
	public void setCategoryLevel3(BigInteger categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	public BigInteger getDownloads() {
		return downloads;
	}
	public void setDownloads(BigInteger downloads) {
		this.downloads = downloads;
	}
	public BigInteger getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(BigInteger createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public BigInteger getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(BigInteger modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public BigInteger getCategoryLevel1() {
		return categoryLevel1;
	}
	public void setCategoryLevel1(BigInteger categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}
	public BigInteger getCategoryLevel2() {
		return categoryLevel2;
	}
	public void setCategoryLevel2(BigInteger categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public BigInteger getVersionId() {
		return versionId;
	}
	public void setVersionId(BigInteger versionId) {
		this.versionId = versionId;
	}
	
}
