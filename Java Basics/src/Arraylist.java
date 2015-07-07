import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Arraylist {

	public static void main(String args[])
	{
		ArrayList l=new ArrayList();
		l.add(23);
		l.add(45);
		l.add(4533);
		l.add(1);
		System.out.println(l);
		System.out.println("Arraylist");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Object s=it.next();
			System.out.println(s);
			
		}
		Collections.sort(l);
		System.out.println(l);
	}
}
