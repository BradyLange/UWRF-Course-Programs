package parking_space;

public class ParkingLot {
	
	//Instance variables
	ParkingSpace [] pSpace; //many types of parking space using polymorphism
	int parkLotNum; //parking lot number starts at
	
	//Default constructor
	public ParkingLot()
	{
		parkLotNum = 1000; //this parking lots number start at 1000
		pSpace = new ParkingSpace[5];
		//You wouldn't use this method instantiated them if you use the second option in the getParkingLotInfo method.
		pSpace[0] = new HandicappedParkingSpace(parkLotNum++);
		pSpace[1] = new HandicappedParkingSpace(parkLotNum++);
		pSpace[2] = new RegularParkingSpace(parkLotNum++);
		pSpace[3] = new RegularParkingSpace(parkLotNum++);
		pSpace[4] = new RegularParkingSpace(parkLotNum++);
	}
	
	public void getParkingLotInfo()
	{
		for(int i = 0; i < pSpace.length; i++)
		{
			System.out.print("Parking space " + pSpace[i].getSpaceNum());
			pSpace[i].showSpaceType();
			//parkLotNum++;
		}
		/*ANOTHER WAY TO DO IT
		for(int i = 0; i < pSpace.length; i++)
		{
			if(i >= 0 && i < 2)
			{
			pSpace[i] = new HandicappedParkingSpace(parkLotNum);
			System.out.print("Parking space " + pSpace[i].getSpaceNum());
			pSpace[i].showSpaceType();
			parkLotNum++; //since the parking lot numbers go up by one can we just use post increment
			}
			if(i > 1  && i < pSpace.length)
			{
			pSpace[i] = new RegularParkingSpace(parkLotNum);
			System.out.print("Parking space " + pSpace[i].getSpaceNum());
			pSpace[i].showSpaceType();
			parkLotNum++; //since the parking lot numbers go up by one can we just use post increment
			}
			if(i < 0 || i > pSpace.length)
				System.out.println("An error has occured in your default constructor.");
		} //end of for loop	
	  */
	} //end of getParkingLotInfo
	
	//Method that returns the number of parking spaces 
	public int getNumOfSpaces()
	{
		return pSpace.length; 
	} //end of returnSpaces

} //end of ParkingLot class
