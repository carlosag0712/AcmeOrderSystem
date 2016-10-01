package com.acme.testing;
import com.acme.domain.Order;
import com.acme.util.MyDate;

public class TestOrders {
	public static void main(String[] args){
		MyDate date1 = new MyDate(1,20,2008);
		Order anvil = new Order(date1, 2000.00, "Carlos","anvil",10);
		MyDate date2 = new MyDate(1,20,2008);
		Order balloons = new Order(date2, 1000.00, "Amanda","balloons", 20);
		MyDate date3 = new MyDate(5,20,2008);
		Order anotherAnvil = new Order(date3, 200, "Carlos");
		
		System.out.println(anvil);
		System.out.println(balloons);
		System.out.println(anotherAnvil);
		
		System.out.println("The tax Rate is currently: "+ Order.taxRate);
		Order.computeTaxOn(3000.00);
		anvil.computeTax();
		balloons.computeTax();
		anotherAnvil.computeTax();
		
		Order.setTaxRate(0.06);
		System.out.println("The tax Rate is currently: "+ Order.taxRate);
		Order.computeTaxOn(3000.00);
		anvil.computeTax();
		balloons.computeTax();
		anotherAnvil.computeTax();
		
		System.out.println("The total bill for: "+anvil+" is "+anvil.computeTax());
		System.out.println("The total bill for: "+balloons+" is "+balloons.computeTax());
		System.out.println("The total bill for: "+anotherAnvil+" is "+anotherAnvil.computeTax());
		
	}

}
