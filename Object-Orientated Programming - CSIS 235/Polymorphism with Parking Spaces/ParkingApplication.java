package parking_space;

public class TestParking {
	
	public static void main(String [] args) {
		
		//Instantiates Parking Lot info
		 ParkingLot one = new ParkingLot();
		 
		//Prints out Parking Lot info
		 one.getParkingLotInfo();
		 
		//Prints out number of parking spaces 
		int s = one.getNumOfSpaces();
		System.out.println("\n" + s + " parking spaces");
	} //end of main method

} //end of TestParking class
