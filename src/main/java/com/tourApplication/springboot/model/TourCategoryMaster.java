package com.tourApplication.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class TourCategoryMaster {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long categoryMasterId;
	
	private String categoryId;
	private String subCategoryId;
	private String categoryName;
	private String categoryImagePath;
	private short flag;
	
	
	@OneToMany(targetEntity = ItineryMaster.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "category_master_id", referencedColumnName = "categoryMasterId")
	private List<ItineryMaster> itinery;
	
	@OneToMany(targetEntity = DateMaster.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "category_master_id", referencedColumnName = "categoryMasterId")
	private List<DateMaster> dates;
	
	@OneToMany(targetEntity = CostMaster.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "category_master_id", referencedColumnName = "categoryMasterId")
	private List<CostMaster> costs;
	
	
	@OneToMany(targetEntity = BookingHeaderTable.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "category_master_id", referencedColumnName = "categoryMasterId")
	private List<BookingHeaderTable> bookheader;
	
	
	public long getCategoryMasterId() {
		return categoryMasterId;
	}
	public void setCategoryMasterId(long categoryMasterId) {
		this.categoryMasterId = categoryMasterId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryImagePath() {
		return categoryImagePath;
	}
	public void setCategoryImagePath(String categoryImagePath) {
		this.categoryImagePath = categoryImagePath;
	}
	public short getFlag() {
		return flag;
	}
	public void setFlag(short flag) {
		this.flag = flag;
	}
	
	
	public List<ItineryMaster> getItinery() {
		return itinery;
	}
	public void setItinery(List<ItineryMaster> itinery) {
		this.itinery = itinery;
	}
	public List<DateMaster> getDates() {
		return dates;
	}
	public void setDates(List<DateMaster> dates) {
		this.dates = dates;
	}
	public List<CostMaster> getCosts() {
		return costs;
	}
	public void setCosts(List<CostMaster> costs) {
		this.costs = costs;
	}
	public List<BookingHeaderTable> getBookheader() {
		return bookheader;
	}
	public void setBookheader(List<BookingHeaderTable> bookheader) {
		this.bookheader = bookheader;
	}
	
	
	
}
