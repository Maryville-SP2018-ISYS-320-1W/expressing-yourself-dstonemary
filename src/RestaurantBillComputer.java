/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    March-22-2018
*/

public class RestaurantBillComputer {

	
	public static void main(String[] args) {
		int bill = 20;
		float taxRate = 5;
		float tax = bill * (taxRate / 100);
		float tipPercentage = 15;
		float tip = bill * (tipPercentage / 100);
		float totalBill = bill + tax + tip;
		System.out.println("With a "+tipPercentage+"% tip your total would be $"+totalBill);
		
		tipPercentage = 18;
		tip = bill * (tipPercentage / 100);
		totalBill = bill + tax + tip;
		System.out.println("With a "+tipPercentage+"% tip your total would be $"+totalBill);
		
		tipPercentage = 20;
		tip = bill * (tipPercentage / 100);
		totalBill = bill + tax + tip;
		System.out.println("With a "+tipPercentage+"% tip your total would be $"+totalBill);
		
		
	}

}
