package parking_space;

public class RegularParkingSpace extends ParkingSpace {
	
	//Default constructor
	public RegularParkingSpace() 
	{
		super();
	}
	
	//Alternate constructor
	public RegularParkingSpace(int spaceNum)
	{
		super(spaceNum);
	}
	
	//Overriding the parents class method
	@Override
	public void showSpaceType()
	{
		System.out.println(":Regular Parking Space");
	}

} //end of RegularParkingSpace
