package allTogether;

public abstract class customer implements Credit{
	public void creditCustomer(){
		System.out.println("the credit is above average");
	}
	public void backGround(){
		System.out.println("The customer background is Clean");
	}
	
	 public abstract void cAddress ();
	 public abstract void cAgrement();
	 
}
