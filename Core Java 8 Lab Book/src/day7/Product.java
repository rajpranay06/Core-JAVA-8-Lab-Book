package day7;

public class Product {
	
	String name;
	int id;
	double price;
	
	Product(String name, int id, double price){
		this.name = name;
		this.id = id;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}

}
