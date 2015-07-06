
public class ArrayComp {
	public static void main(String args[])
	{
		
	
 int a[]=new int[]{10,4,344,7,9,8};
 int b[]=new int[]{5,9,8,23,4,7,};		 
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
 System.out.println(+largest);
 System.out.println(+smallest);
 
 
 int sum=a[0];

 for(int i=0;i<a.length;i++)
 {
	 sum=sum+a[i];
	 
 }
 System.out.println(+sum);
  
 int common=0;
 int c=0;
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<b.length;j++)
	 {
		 if(a[i]==b[j])
		 {
System.out.print(a[i]);		 }
		 else if(b[j]==a[i])
		 {
			 c=b[j];
		 }
	 }
	 
 }
 System.out.print(+common);
 System.out.print(+c);
 }

	
}