
public class BankAccounrt_Details {
	
	//Declaring Account Balance as 'Static'
	static int accountBalance=10000;
	
	String bankName;
	
	
	//Code was Written as a part of Assignment on October -15-2020.
	void withdraw() 
	{
		int balance;
		balance = accountBalance - 2000;
		accountBalance = balance;
		System.out.println("Account Balance After Withdrwaing from "+bankName+" bank and your Account balance is "+balance);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		BankAccounrt_Details Bank1 = new BankAccounrt_Details();
		Bank1.bankName = "HDFC";
		BankAccounrt_Details Bank2 = new BankAccounrt_Details();
		Bank2.bankName ="SBI";
		BankAccounrt_Details Bank3 = new BankAccounrt_Details();
		Bank3.bankName = "AXIS";
		
		
		Bank1.withdraw();
		Bank2.withdraw();
		Bank3.withdraw();
		

	}

}
