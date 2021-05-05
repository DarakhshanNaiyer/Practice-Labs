package Lesson3;

// A node of "CHAINS". 

public class HashNode <K,V> {
   
	K key;
	V value;
	
	// Reference to next node.
	
	HashNode <K,V> next; 
	
	//Constructor

	public HashNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		
		
	}
	
	}
