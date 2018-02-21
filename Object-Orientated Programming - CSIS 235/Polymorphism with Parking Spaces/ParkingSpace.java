package parking_space;

abstract public class ParkingSpace {
	
	private int spaceNum;  
	private boolean isEmpty;
	
	public ParkingSpace()
	{
		this.spaceNum = 0;
	}
	
	public ParkingSpace(int spaceNum)
	{
		this.spaceNum = spaceNum;
	}

	public int getSpaceNum() {
		return spaceNum;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	//It is to show the type of the parking space.
	//Subclasses will override it.
	abstract public void showSpaceType();

}
