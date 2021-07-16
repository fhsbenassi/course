package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private Customer customer;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	
	//default constr
	public Order(Date moment, OrderStatus status, OrderItem item) {
		this.moment = moment;
		this.status = status;
		this.customer = new Customer();
	}
	
	
	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	
	

}
