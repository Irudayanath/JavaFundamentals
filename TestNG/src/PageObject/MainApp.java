package PageObject;
public class MainApp {
public static void main(String args[])
{
	MainApp app=new MainApp();
	ObjectRepository or=new ObjectRepository();
	or.getUsername().click();
	
}
}
