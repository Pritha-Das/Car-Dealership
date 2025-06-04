package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1=new Customer();
		cust1.setName("Jack");
		cust1.setAddress("13b,St,WB..");
		cust1.setCashOnHand(600000);
		
		Vehicle vehicle=new Vehicle("KIA","KIA 65",500000);
		
		
		
		Employee emp=new Employee();
		
		cust1.purchaseCar(vehicle,emp,true);
		
		
		Vehicle car=new Vehicle("KIA","KIA 65",500000);
		
		boolean value=car.equals(vehicle);
		System.out.println(value);
		
		cust1.toString();

	}

}
