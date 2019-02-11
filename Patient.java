
public class Patient 
{
	private String name;
	private String address; 
	private double amountOwed;
	
	public Patient(String n, String a, double o)
	{
		name = n;
		address = a;
		amountOwed = o;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public void setAddress(String a)
	{
		address = a;
	}
	
	public void newCharge(double o)
	{
		amountOwed = amountOwed + o;
	}
	
	public void payment(double o)
	{
		amountOwed = amountOwed - o;
	}
}

