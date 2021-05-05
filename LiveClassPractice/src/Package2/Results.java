package Package2;

public class Results extends Sports {
  
	private int totalMarks;
	
	public void calculateresult() {
		this.totalMarks=this.objectiveMarks+this.subjectiveMarks+this.score;
		System.out.println();
	}
}
