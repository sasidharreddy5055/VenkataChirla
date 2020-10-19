import java.util.Scanner;

public class CoffeeSizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double small=4.25;
		double medium=5.25;
		double large=6.25;
		
		
	
		System.out.println("Enter The UserChoice Coffee Size");
		
		Scanner input= new Scanner(System.in);
		String userChoice=input.nextLine();
		
		
		if(userChoice =="S")
		{
		System.out.println("Your coffee is ready and the bill is"+ small);
		}
		else if  (userChoice == "M") 
		{
		System.out.println("Your coffee is ready and the bill is"+ medium);
		}
	}

}
