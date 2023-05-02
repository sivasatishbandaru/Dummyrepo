package hyrpractice;

public class bank {
	
	String accname="satish";
	int accno=245678;
	double availablebal=100;
	public void details()
	{
		System.out.println("account holder:"+accname+"accno:"+accno);
	}

}
class deposit extends bank
{
	double amt=5444.3;
	public void depositamt()
	{
	 availablebal=availablebal+amt;
	 System.out.println("total bal after depositing amt:"+availablebal);
	}
}
class cust
{

	public static void main(String[] args) {
		deposit d1=new deposit();
		d1.details();
		d1.depositamt();
	}
}





