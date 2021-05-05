package Keywords;

public class ThisKeyword {
	
	void m() {
		System.out.println(this); // prints same reference ID
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj = new ThisKeyword ();
		System.out.println(obj); // print the reference ID
		
		obj.m ();

	}

}
