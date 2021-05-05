package Package2;

public class Sports extends Marks {
	
	protected int  score;
	
	public void acceptdetails() {
	    super.acceptdetails();
		System.out.println("Enter SportsScore:"+this.score);
		this.score=Scanner.nextInt();
		

	}
	
	public void displaydetails() {
	    super.displaydetails();
		System.out.println("Details:");
		
		System.out.println("Sports Score:"+this.score);
		this.score=Scanner.nextInt();


	}
 

}
