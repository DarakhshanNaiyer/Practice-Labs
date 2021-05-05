package Methods;


public class ContructorLiveClass {
	int e,f;
	ContructorLiveClass (int e,int f){
		this.e=e;
		this.f=f;
	}

	public static void main(String[] args) {

		ContructorLiveClass object= new ContructorLiveClass(5,6);
		int result = object.sum(2,3);
		int result1 = object.sum (2,3,4);
		System.out.println("Sum of Numbers:");
		
	}

	
}
