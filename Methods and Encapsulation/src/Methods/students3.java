package Methods;

public class students3 {

	int rollno;
	String Name;
	static String College = "St.Convent";
	
 static void change () {
	 College = "St.Aloysius";
 }
 students3 (int r,String n){
	 rollno=r;
	 Name=n;
 }
 void display () {System.out.println(rollno+ "  "+Name+" " +College);}
 
 public static void main (String args[]) {
	 students3.change();
	 students3 S1= new students3 (111, "Paul");
	 students3 S2= new students3 (222, "Mark");
	 students3 S3= new students3 (333, "Boby");
	 
	 S1.display();
	 students3.College="St.Joseph";
	 S2.display();
	 S3.display();
	 

   }
 }


