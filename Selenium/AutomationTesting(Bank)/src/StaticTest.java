public class StaticTest
{
	public static void main(String args[])
	{
		int a[]={12,14,10,7,3,7,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					int k=j;
					for(int c=k+1;c<a.length;k++)
					{
						if(a[c]==k)
						{
							c=0;
						}

					}
					System.out.println(a[i]);

				}
			}
		}
	}
}
