package parking_space;

public class HandicappedParkingSpace extends ParkingSpace {

	//Default constructor
	public HandicappedParkingSpace()
	{
		super();
	}
	
	//Alternate constructor
	public HandicappedParkingSpace(int space)
	{
		super(space);
	}
	
	//Overriding parents method
	@Override
	public void showSpaceType()
	{
		System.out.println(":Handicapped Parking Space");
	}
	

} //end of HandicappedParkingSpace class
