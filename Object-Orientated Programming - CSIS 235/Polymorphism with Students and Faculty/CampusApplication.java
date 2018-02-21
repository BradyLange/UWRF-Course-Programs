package campus;

public class TestCampus {

	public static void main(String[] args) {
		
		//Instantiated Students 
		Student stu1 = new Student("W3110657", "Lange", "Brady", "Computer Science", 2);
		Student stu2 = new Student("W3100000", "Peterson", "Adrian", "Dairy Science", 1);
		Student stu3 = new Student("W3200000", "Bryant", "Kobe", "Sports Management", 4);
		Student stu4 = new Student("W3300000", "Lillard", "Damien", "Data Science", 3);
		Student stu5 = new Student("W3400000", "Paul", "Chris", "Computer Science", 2);
		Student stu6 = new Student("W3500000", "Diggs", "Stefon", "Dairy Science", 4);

		//Faculty Instructor Instantiated
		Faculty fac1 = new Faculty("3029699", "Ruxin", "Dai", "CSIS", "Assistant Professor"); 
		
		//Section Instantiated
		Section sec1 = new Section("CS235-02", fac1, 5, "South Hall 218", "T & TH 12:30-1:45PM", "Fall Semester");

		//Enroll the students into the section
		sec1.enrollStudent(stu1);
		sec1.enrollStudent(stu2);
		sec1.enrollStudent(stu3);
		sec1.enrollStudent(stu4);
		sec1.enrollStudent(stu5);
		sec1.enrollStudent(stu6);
		
		//Printing out the roster for CS235 section
		sec1.printRoster();
		
		//Removing myself (stu1) from section CS235 using my ID
		sec1.removeStudent("W3110657");
		//Verifying the student was removed
		sec1.printRoster();
		//Verifying you can add another student after removing them
		sec1.enrollStudent(stu1);
		sec1.printRoster();
	} //end of main method

} //end of TestCampus class
