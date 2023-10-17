package application.copy;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		Department dmp1 = new Department(1, "Book");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, dmp1);
		
		System.out.println(seller);
		
	}

}
