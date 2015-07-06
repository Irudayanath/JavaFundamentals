
public class Array {
public static void main(String args[])
{
int a[]=new int[]{2,43,34,6,7,3};
int b[]=new int[]{34,4,9,8,7,2,3};

int largest=a[0];
int smallest=a[0];
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
System.out.println("LARGEST IN ARRAY \t"   +largest);
System.out.println("SMALLEST IN ARRAY\t"  +smallest);

int acommon;
int bcommon;
for(int i=0;i<b.length-1;i++)
{
	for(int j=0;j<a.length-1;j++)
	{
		if(b[i]==a[j])
		{
			acommon=a[i];
			System.out.print(" "+acommon);
		}
		else if(b[j]==a[i])
		{
			bcommon=b[j];
			System.out.print(+bcommon);

		}
		
	}
	
	
}

}


}
