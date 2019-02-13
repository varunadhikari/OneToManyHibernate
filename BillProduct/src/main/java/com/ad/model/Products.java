/**
 * 
 */
package com.ad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author VarunAdhikari
 *
 */

@Entity(name="products")
public class Products {

	@Column(name="productId")
	@Id
	private int productId;
	
	@ManyToOne
	@JoinColumn(name="billNumber", nullable = false)
	private Bill bill;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="rate")
	private Double rate;
	
	@Column(name="amount")
	private Double amount;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
	
}
