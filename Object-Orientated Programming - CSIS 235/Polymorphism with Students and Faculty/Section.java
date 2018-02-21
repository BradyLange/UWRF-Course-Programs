package campus;

public class Section {
	
	//Instance variables
	private Faculty instructor;
	private Student [] enrolled;
	private String id;
	private int numOfEnrolled;
	private int capacity;
	private String location;
	private String time;
	private String semester;
	
	//Default constructor
	public Section()
	{
		id = "";
		instructor = new Faculty();
		enrolled = new Student[5];
		numOfEnrolled = 0;
		capacity = 0;
		location = "";
		time = "";
		semester = "";
		
	}
	//Alternate constructor
	public Section(String id, Faculty instructor, int capacity, String location, String time, String semester)
	{
		this.id = id;
		this.instructor = new Faculty(instructor.getId(), instructor.getLastName(), instructor.getFirstName(), instructor.getDept(), instructor.getRank());
		this.numOfEnrolled = 0; //No students have enrolled with this constructor being used
		this.capacity = capacity;
		this.location = location;
		this.time = time;
		this.semester = semester;
		this.enrolled = new Student[capacity]; //numOfEnrolled is set to 0, no Student has enrolled yet with this constructor
	}

	
	//Getters
	public Faculty getFaculty()
	{
		return instructor;
	}
	
	public Student[] getCollectionOfStudents()
	{
		return enrolled;
	}
	
	public String getID()
	{
		return id;
	}
	
	public int getNumOfEnrolled()
	{
		return numOfEnrolled;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public String getTime()
	{
		return time;
	}
	
	public String getSemester()
	{
		return semester;
	}
	
	//Setters
	public void setFaculty(Faculty instructor)
	{
		this.instructor = instructor;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	
	//This method adds a new student into the enrolled list and increments the number of enrolled by one, it will print an error if the section is full
	public boolean enrollStudent(Student newStudent)
	{
		
		if(capacity <= numOfEnrolled)
		{
			System.out.println("Error: Too many students enrolled. Please contact your professor.");
			return false;
		}
		else
			enrolled[numOfEnrolled] = new Student(newStudent);
			numOfEnrolled++;
			return true;
	}
	
	//This method removes a student with the student id attribute from the enrolled list and decrements the number of enrolled list, if the student is not found it will print out an error
	public boolean removeStudent(String studentId)
	{
		boolean flag = false;																		
		
		if(numOfEnrolled > 0 && numOfEnrolled <= capacity)
		{
			for(int i = 0; i < numOfEnrolled; i++)
			{
				if(enrolled[i].getId().equalsIgnoreCase(studentId)) //calling the getId method so we can get the students ID not the sections
				{
					enrolled[i] = new Student();
					for(int j = i; j < numOfEnrolled; j++)
					{
						if(j < numOfEnrolled -1)
						{
							enrolled[j] = enrolled[j+1];
							flag = true;
						} //end of third if 
					
					} //end of second for loop
					//return true;
					
				} //end of second if statement
				else 
					if(i == enrolled.length && !enrolled[i].getId().equalsIgnoreCase(studentId))
					{
						System.out.println("Error: Could not find student. Student may not be enrolled. Please try again.");
						flag = false;
						break;
						//return false;
					}

			} //end of for loop
			
			if (flag == true);
			{
				enrolled[numOfEnrolled - 1] = new Student();
				numOfEnrolled--;
			}
			return flag; //Will return true or false depending on the for loops flag being used and triggered
		} //end of first if statement		
		else
		{
			System.out.println("Error: Invalid capacity amount, cannot remove student. Please try again.");
		return flag;
		}
	}
	
	
	//This method prints the sections information and enrolled students information using a formatted structure
	public void printRoster()
	{
		System.out.println(this.toString());
		System.out.printf("%-25s %-25s %-25s %-25s\n", "Student's ID", "Student's Name", "Student's Major", "Student's Level");
		
		for(int i = 0; i < enrolled.length; i++)
		{
			System.out.println(enrolled[i].toString());
		}
	
	}
	
	//toString method that overrides 
	public String toString()
	{
		return String.format("\nSection: %-18s Instructor: %-21s\nCapacity: %-18sEnrolled: %-23s Location: %-24s\nSemester: %-17s Meeting Time: %-10s", id, instructor, capacity, numOfEnrolled, location, semester, time);
	}

} //end of Section class
