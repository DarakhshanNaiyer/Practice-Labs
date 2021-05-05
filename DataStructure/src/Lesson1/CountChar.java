package Lesson1;

public class CountChar {
	
		public int countChars(char c, String str) {
			int count=0;
			
			for(int i=0; i<str.length();i++) {
				if(str.charAt(i)==c)count++;
			}
		return count;
		
	}

	public static void main(String[] args) {
		
       CountChar CC = new CountChar ();
       
       System.out.println(CC.countChars('a', "Selly sells sea shells on the seashore"));
	}

}
