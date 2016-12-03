package allTogether;

public class ClientInfo extends customer {
	private String clientName;
	private String phoneNumber;
	private int clientAge;
	
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getClientAge() {
		return clientAge;
	}
	public void setClientAge(int clientAge) {
		this.clientAge = clientAge;
	}
	
	
	
	public void cAddress() {
		
		System.out.println("The customer address is not available");
		
	}

	
	public void cAgrement() {
		System.out.println("Signed for the terms and condition on return policy" );

	}

	
}
