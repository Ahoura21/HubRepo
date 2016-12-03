package allTogether;

public class TestInfo {

	public static void main(String[] args) {
		
		ClientInfo clInfo = new ClientInfo();
			clInfo.setClientName("Alex");
			clInfo.setClientAge(25);
			clInfo.setPhoneNumber("703-222-2222");
		System.out.println("Customer: " + clInfo.getClientName() +" "+ "is "+ clInfo.getClientAge()+ " "+"years old");
		System.out.println("Customer's emergency phonenumber: "+ clInfo.getPhoneNumber());
		
		Credit credit = new ClientInfo();
		
			credit.backGround();
			credit.creditCustomer();
			
		customer cus = new ClientInfo();
			cus.cAddress();
			cus.cAgrement();
			
	
	}

}
