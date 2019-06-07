package in.ac.sharda.pizzaapplication.domain;

import java.util.Set;
import java.util.TreeSet;



public class Cart {
	
	private Set<Product> products = new TreeSet<>();
	
	
	public Set<Product> additems() {
		for(int i = 1; i<20; i++) {
			products.add(new Product(i, i*10, "Nme "+i, "Desc "+i));
		}
	return products;
	
	}
	
	public Cart(Set<Product> products) {
		this.products = products;
	}

	public void removeProduct() {
		for(int i = 1; i<20; i++) {
			products.remove(new Product(i, i*10, "Nme "+i, "Desc "+i));
		}
		System.out.println("All Products are removed");
	}
	}