package course.poo;

import java.io.Serializable;

public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double price;
	private int quantity;
	
	
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity){
		this.quantity += quantity;
	}
	
	public void removeProducts(int remove) {
		this.quantity -= remove;
	}
	
	
	
	@Override
	public String toString() {
		return "Produto [name=" + name + ", price= $" + String.format("%.2f", price) + ", quantity=" + quantity + "]";
	}

	public Produto() {
		
	}

	
	public Produto(String name, Double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
