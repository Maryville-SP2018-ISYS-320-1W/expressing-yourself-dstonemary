/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    March-22-2018
*/

public class ComputePay {
	public static void main(String[] args) {
		int hourWorked = 4 + 5 + 8 + 4;
		float hourSalary = 8.75f;
		System.out.println("My total hours worked: " + hourWorked);
		
		System.out.println("My hourly salary: "+"$"+hourSalary);
		
		System.out.println("My total pay:");
		System.out.println(hourWorked * hourSalary);
	}
}