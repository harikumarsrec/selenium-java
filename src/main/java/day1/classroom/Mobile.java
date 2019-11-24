package day1.classroom;

public class Mobile {
	
	public void makeCall(int i)
	{
		System.out.println("The number of the call is "+i);
	}
	
	public void sendSMS(String message)
	{
		System.out.println("The message is Hello" + message);
	}
	
	public boolean shutdown(String msg)
	{
		System.out.println("Shutdown the mobile" + msg);
		return true;
	}

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		
		
		
		m1.makeCall(9);
		m1.sendSMS("Hello");
		boolean shutdown = m1.shutdown("True");
	
	}

}
