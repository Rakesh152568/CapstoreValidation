package com.cg.capstore.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="order_details")
public class OrderBean {

	@Id
	//@Column(name="order_id")
	private String orderId;
	@Column(name="order_status")
	private String orderStatus;
	@Column(name="quantity")
	private Integer quantity;
	public Integer getMinBillingAmount() {
		return minBillingAmount;
	}
	public void setMinBillingAmount(Integer minBillingAmount) {
		this.minBillingAmount = minBillingAmount;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@ManyToMany//(targetEntity=Product.class)
	@JoinColumn(name="product_id")
	private List<ProductBean> product;
	//private Customer customer;
	@Column(name="payment_method")
	private String paymentMethod;
	@Column(name="date_of_order")
	private Date dateOfOrder; //sql.date
	@Column(name="delivery_date")
	private Date deliveryDate;  //sql.date
	//@Column(name="min_billing_amount")
	private Integer minBillingAmount;

	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public List<ProductBean> getProduct() {
		return product;
	}
	public void setProduct(List<ProductBean> product) {
		this.product = product;
	}
	/*public CustomerBean getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}*/
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Integer getMinAmount() {
		return minBillingAmount;
	}
	public void setMinAmount(Integer minAmount) {
		this.minBillingAmount = minAmount;
	}

}