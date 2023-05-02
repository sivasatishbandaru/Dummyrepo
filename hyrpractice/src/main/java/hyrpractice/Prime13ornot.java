package hyrpractice;

public class Prime13ornot {

	public static void main(String[] args) {
		int i,num=13;
		boolean flag=true;
		for(i =2;i<num;++i)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println(num+"is a prime number.");
		else
			System.out.println(num+"is not a prime number");
	}

}
