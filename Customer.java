package Java_Computer;

 

public class Customer {
	public static void main(String[] args) {
		Computer c1 = new Computer();
//		
		c1.setcName("Macbook Pro");
		c1.setcYear(2019);
		c1.setcCost(2000);
//		
		System.out.print(c1.getcName() + " / ");
		System.out.print(c1.getcYear() + " / ");
		System.out.print("$"+ c1.getcCost() );
//		
//	

	}
}
