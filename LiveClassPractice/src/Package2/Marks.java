package Package2;

import Package1.Students;

public class Marks extends Students {
	
 protected int objectiveMarks;
 protected int subjectiveMarks;
 
 public void acceptdetails() {
	    super.acceptdetails();
		System.out.println("Enter objectiveMarks:");
		this.objectiveMarks=Scanner.nextInt();
		System.out.println("Enter subjectiveMarks:");
		this.subjectiveMarks=Scanner.nextInt();

	}
	
	public void displaydetails() {
	    super.displaydetails();
		System.out.println("Details:");
		System.out.println("objectiveMarks:"+this.objectiveMarks);
		System.out.println("subjectiveMarks:"+this.subjectiveMarks);

	}
 
}
