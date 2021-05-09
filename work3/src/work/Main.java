package work;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Tansu Çaðla", "Tekin", LocalDate.of(1997,01,30), "222222222222");
		customerManager.save(customer);

	}

}
