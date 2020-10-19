/*Oct-13-2020 Given Number is Odd or Even*/


import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		System.out.println("Enter a Number");
		
		
		Scanner input= new Scanner(System.in);
		number=input.nextInt();
		
		if(number%2==0) 
		{
			System.out.println("The Given Number is Even");
		}
		else
		{
		
			System.out.println("The Given Number is Odd");
		}	

	}

}
