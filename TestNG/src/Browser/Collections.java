package Browser;

import java.util.HashMap;
import java.util.Set;

public class Collections {
public static void main(String args[])
{
	HashMap m=new HashMap();
	m.put(1, 100);
	m.put(3,200);

	m.get(3);
	Object s=m.get(3);
	System.out.println(s);
	Set s1=m.keySet();
	System.out.println(s1);
	Set s2=m.entrySet();
	System.out.println(s2);
	if(m.containsKey(3))
	{
		System.out.println("true");
	}
   

}
}
