/**
 * 
 */
package com.ad.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author VarunAdhikari
 *
 */

@Entity(name="Bill")
public class Bill {

	@OneToMany(mappedBy="bill")
	private List<Products> products;
	
	@Column(name="billNumber")
	@Id
	private Integer billNumber;
	
	@Column(name="sgst")
	private Double sgst;
	
	@Column(name="cgst")
	private Double cgst;
	
	@Column(name="totalPrice")
	private Double totalPrice;
	
	public Integer getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(Integer billNumber) {
		this.billNumber = billNumber;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public Double getSgst() {
		return sgst;
	}
	public void setSgst(Double sgst) {
		this.sgst = sgst;
	}
	public Double getCgst() {
		return cgst;
	}
	public void setCgst(Double cgst) {
		this.cgst = cgst;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
