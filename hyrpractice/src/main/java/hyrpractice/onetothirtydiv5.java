package hyrpractice;

public class onetothirtydiv5 {

	public static void main(String[] args) {
		int i,count=0,num=5;
		for(i=1;i<=30;i++)
		{
			if(i%num==0)
			{
				count =count+1;
			}
		}
		System.out.println("final count is:"+count);

	}

}
