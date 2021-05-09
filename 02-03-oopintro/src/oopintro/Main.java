package oopintro;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10, 13500);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getName() + " indirimden sonraki fiyatı: " + product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ev/Bahçe");	
		
		// By means of encapsulation and getter methods we can
		// apply business logic once in getter methods and use 
		// this value through the getter method many times
		// throughout the application. Here, in the example
		// all category names are concatenated with the 
		// exclamation mark.
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}
}