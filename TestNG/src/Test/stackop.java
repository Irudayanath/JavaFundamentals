package Test;

import java.util.Stack;

public class stackop {
	public static void main(String args[])
	{
		
	
String s="welcome";
Stack<Character> st=new Stack();
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	st.push(ch);
}
while(!st.empty())
{
	char c=st.pop();
	System.out.print(c);
}
}}
