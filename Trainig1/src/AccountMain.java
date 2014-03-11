
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acc= new Account("Abc", 1000);
acc.deposit(5000);
if (acc.withdraw(5000)==false)
	System.out.println("Unable to withdraw");
else 
	
	System.out.println("Amount withdrawn status:" +acc.details());

	
	

	}

}
