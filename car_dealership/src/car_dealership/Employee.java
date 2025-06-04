package car_dealership;

public class Employee {
	
	
	public void handleCustomer(Customer cust,Vehicle vehicle,boolean finance) {
		
		
		if(finance==true) {
			
			double loanAmount=vehicle.getPrice()-cust.getCashOnHand();
			
			runCreditHistory(cust,loanAmount);
		}
		else if(vehicle.getPrice()<=cust.getCashOnHand()) {
			processTransaction(cust,vehicle);
		}
		else {
			System.out.println("Customer need more money to purchase the vehicle: "+vehicle);
		}
   }
	public void runCreditHistory(Customer cust,double loanAmount) {
		System.out.println("Ran credit history for customer..");
		System.out.println("Customer has been aprroved to purchase the vehicle" +loanAmount);
		
	}
	
	public void processTransaction(Customer cust,Vehicle vehicle) {
		
		System.out.println("Customer has purchased the vehicle: "+vehicle+" for the price" +vehicle.getPrice());
		
	}
}
