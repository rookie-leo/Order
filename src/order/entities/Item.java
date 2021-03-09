package order.entities;

/*
 * Essa classe instancia um objeto Item
 * que contem nome e preco do mesmo
 * */
public class Item {

	private String name;
	private Double price;
	
	public Item() {
	}
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

//	Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
