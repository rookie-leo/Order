package order.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import order.entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
//	Getters and Setters
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
	
	public List<OrderItem> getItems(){
		return items;
	}
	
	// Este metodo adiciona um novo item a lista
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	// Este metodo remove um item da lista
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	//Esse metodo retorna o total da compra
	public Double total() {
		double total = 0;
		
		for (OrderItem item : items) {
			total += item.subTotal();
		}
		
		return total;
	}
}
