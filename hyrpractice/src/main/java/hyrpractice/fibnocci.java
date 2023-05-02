package hyrpractice;

public class fibnocci {

	public static void main(String[] args) {
	int i,f=0,f1=1,f2=2;
	System.out.println(f+" ");
	System.out.println(f+" ");
	for(i=1;i<=6;i++)
	{
		f2=f+f1;
		System.out.println(f2+" ");
		f=f1;
		f1=f2;

	}

}
}