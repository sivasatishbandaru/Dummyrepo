package hyrpractice;

public class product {

	public static void main(String[] args) {
int i,product=1;
for(i=1;i<=10;i++)
{
	if(i%2==0)
	{
		product=product*i;
	}
}
System.out.println("the final value of product is:"+product);
}
}