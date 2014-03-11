
public class Account {
private String name;
private double bal;

public Account(){

	bal = 0.0;
	name = "undefined";
}		 
	

public Account(String name,double bal)
{
		this.name= name;
		this.bal = bal;
}
		
		//define method for deposit
public void deposit(double amount)
{
			bal += amount;
}
			//define method "withdraw
public boolean withdraw(double amount)
{
		double temp= bal-amount;
		
		if (temp <500)
			return false;
		else
			bal=temp;
		return true;
		
		
	}
			
public String details()
{
	return "name ="+ name + "bal="+bal;
			
		}
		
	
}
  

