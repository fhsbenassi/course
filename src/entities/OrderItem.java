package entities;

public class OrderItem{
	
	private int quantity;
	private double price;
	private Product product;
	

	//default constructor
	public OrderItem (int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = new Product();
		
	}
	
	//empty constructor
	public OrderItem () {;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	//returns the subtotal of item
	public double subTotal() {		
		return this.price*this.quantity;		
	}
	
	
	

}
