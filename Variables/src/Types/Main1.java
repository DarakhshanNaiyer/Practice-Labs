package Types;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Var.m);
    // System.out.println(Var.n ); Error, could not execute
     Var obj = new Var ();
     System.out.println(obj.data);
     
 //system.out.println(obj.n); Local variable can only be called with " obj.mthod"
     
     obj.method();
     System.out.println();
     
     //Below codes are for student class
 	Students.University= "St.Aloysisus";
 	//System.out.println(Students.University);
 	
 	Students Student1 = new Students();
	Students Student2 = new Students();
	
	Student1.Name= "Darakhshan";
	Student2.Name= "Layba";
	
	
	Student1.Score= 76;
	Student2.Score= 90;
	
	Student1.studentdetails();
	Student2.studentdetails();
	
	
	
	}

}
