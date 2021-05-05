package getternsetter;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Get object1 = new Get();
  Get.setUniversity("St.Aloysius");
 
  object1.setName("Daru");
  object1.setScore(100);
  
//  System.out.println("University:" +Get.getUniversity());
//  System.out.println("Name:" +object1.getName());
//  System.out.println("Score:" +object1.getScore());

  ////////////////////////////////////////////////////Below codes are for scanner
  
  Scanner DA = new Scanner(System.in);
  System.out.println("Enter University Name");
  Get.setUniversity(DA.nextLine());
 
  System.out.println("Enter Your Name");
  object1.setName(DA.nextLine());
  
  System.out.println("Enter Your Score");
  object1.setScore(DA.nextInt());
  
  
  System.out.println("University"+"\t"+"Name" +"\t"+ "Score");
  System.out.println(Get.getUniversity() +"\t"+ object1.getName() +"\t"+ object1.getScore());
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	}

}



