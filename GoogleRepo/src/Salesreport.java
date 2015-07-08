
public class Salesreport {
	public static void show()
	{
		int annual=50600;
		int quaterly=25000;
		int lastquater=annual-quaterly;
		System.out.println(lastquater);
	}
	
	public static void main(String args[])
	{
	Salesreport r=new Salesreport();
	r.show();
	}

}
