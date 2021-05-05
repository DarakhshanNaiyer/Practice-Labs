package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Array [][]= new int [2][3];//Declare
		
		Array[0][0]=10;//initialize
		Array[0][1]=20;
		Array[0][2]=30;
		Array[1][0]=40;
		Array[1][1]=50;
		Array[1][2]=60;
		
//		System.out.println(Array[0][0]);//printing one way
//		System.out.println(Array[0][1]);
//		System.out.println(Array[0][2]);
//		System.out.println(Array[1][0]);
//		System.out.println(Array[1][1]);
//		System.out.println(Array[1][2]);
		

		for (int i=0; i<Array.length; i=i+1) { // for loop for row
			System.out.println(Array[i].length);//Need to cross check
			for (int j=0; j<Array[i].length; j=j+1)// for loop for column
			{
				System.out.println(Array[i][j]);
			}
		}
		
		
		
	}

}


