package in.ac.sharda.pizzaapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.Product;

@RestController

public class CartController {
	
	private int count;

	@GetMapping("/cart")
	public List<Product> products(){
		List<Product> products = new ArrayList<>();
		for(int i = 100; i<=120; i++) {
			products.add(new Product(i, i*10, "Nme "+i, "Desc "+i));
		}
		return products;
	}
	
	public void product(){
		List<Product> products = new ArrayList<>();
		for(int i = 1; i<20; i++) {
			products.remove(new Product(i, i*10, "Nme "+i, "Desc "+i));
		}
		System.out.println("All item removed");
	}
	
	public void productss(){
		List<Product> products = new ArrayList<>();
		count = products.size();
		System.out.println(count);
	}
}