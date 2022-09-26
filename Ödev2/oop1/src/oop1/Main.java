package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String mesaj="Vade oranı";
		
		Product product1=new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image.jpg");
		
		Product product2=new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3=new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products= {product1,product2,product3};
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("12334");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorparateCustomer corporateCustomer=new CorparateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhoneNumber("0999999999");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("3333");
		Customer[] customer= {individualCustomer,corporateCustomer};
		}
	}
