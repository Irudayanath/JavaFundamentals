package Browser;

import java.util.Stack;

public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="I love Jesus";
      for(int i=0;i<s.length();i++)
      {
    	  while(!s.isEmpty())
    	  {
    		  Stack st=new Stack();
    		  char c=s.charAt(i);
    		  st.push(c);
        	  System.out.print(st);

    	  }
    	  while(s.isEmpty())
    	  {
    		  
    		  System.out.println();
    	  }
      }
     /**while(!st.isEmpty())
      {
    	  char ch=(Character) st.pop();
    	  System.out.print(ch);
      }**/
	}

}
