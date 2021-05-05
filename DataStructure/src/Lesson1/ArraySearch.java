package Lesson1;

public class ArraySearch {
	
	public int search(String JoDhundnaHai, String [] JahanDhundwanaHai)	{
	
	for (int i=0; i<JahanDhundwanaHai.length; i++) {
		
	
		if (JahanDhundwanaHai[i].equals(JoDhundnaHai)) {
			return i;
		}
	}
	return -1;
	}

	public static void main(String[] args) {
		
		ArraySearch arraysearch = new ArraySearch();
		
		String [] JahanDhundwanaHai1 = new String[] {"Interstellar","District 9","Blade Runner","Alien","Primer"};
		
		System.out.println(arraysearch.search("Alien", JahanDhundwanaHai1 ));
         
	}

}
