package order.entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private List<Item> products = new ArrayList<Item>();
	
	public OrderItem() {
	}
	
	public OrderItem(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}

//	Getters and Setters
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public List<Item> getItems(){
		return products;
	}
	
	
	/*
	 * Este metodo  retorna a soma do preco de todos os itens da lista
	 * */
	public Double subTotal() {
		double subTotal = 0;
		
		for (Item product : products) {
			subTotal = product.getPrice() * this.quantity;
		}
		
		return subTotal;
	}
}
