package Test;

public class TestClass {

	public static void main(String args[])
	{
		int a[]=new int []{15,7,6,4,3,1,3};
		int smallest=a[0];
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
            largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println(+smallest);
		System.out.println(+largest);
	}
	
}
