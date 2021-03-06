package day7;

import java.util.*;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Product> products = new TreeSet<>(new Test());
		products.add(new Product("Realme",101,27500.00));
		products.add(new Product("OnePlus",102,47500.00));
		products.add(new Product("IOS",103,115000.00));
		products.add(new Product("Google Pixel",104,26000.00));
		products.add(new Product("Vivo",105,15500.00));
		products.add(new Product("Realme",106,17500.00));
		products.add(new Product("Realme",107,37500.00));
		
		System.out.println(products);
		System.out.println();
		
		Set<Vehicles> vehicles = new HashSet<>();
		Vehicles v1 = new Vehicles(101,"Rollsroyce");
		Vehicles v2 = new Vehicles(102,"Rollsroyce");
		Vehicles v3 = new Vehicles(103,"Tesla");
		Vehicles v4 = new Vehicles(105,"Ferarri");
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		vehicles.add(v4);
		Vehicles v5 = v1;
		vehicles.add(v5);
		
		System.out.println("v1: " + v1.hashCode()); 
		System.out.println("v2: " + v2.hashCode()); 
		System.out.println("v3: " + v3.hashCode()); 
		System.out.println("v4: " + v4.hashCode()); 
		System.out.println("v5: " + v5.hashCode()); 
		
		System.out.println(vehicles);
		
		
	}
	
	



}

class Test implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		Product prd1 = (Product) arg0;
		Product prd2 = (Product) arg1;
		
		int res= prd1.name.compareTo(prd2.name);
		if(res == 0){
			if(prd1.id == prd2.id)
				return 0;
			else if(prd1.id > prd2.id)
				return 1;
			return -1;
		}
		return res;
	}
	
}