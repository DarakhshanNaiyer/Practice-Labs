package MAUT;

public class Varargs1 {
	
	static void fun(int ...a)
    {
        System.out.println("Number of arguments: " + a.length);
  
        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i+" ");
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun(100);
		fun(1,2,3,4);
		fun();

	}

}
