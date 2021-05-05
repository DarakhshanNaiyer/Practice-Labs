package Lesson3;

import java.util.LinkedList;
import java.util.Optional;

class HashProvider<K>{

	public int hashkey(K key, int length) {
		
        int hashCode= key.hashCode();
    	
    	int index = hashCode%length;
    	
    	index= index<0 ? index * -1 : index;   // e.hashCode() could be negative, so multiplying
                                               // multiplying a negative value with negative value will make it positive
    	
		return index;
	}
	
}

public class ChainedHashTable <K,V> implements HashTable <K,V> {
	
	private final HashProvider <K> hashProvider;
	
	private LinkedList <HashNode <K,V>>[] array;
	
	public ChainedHashTable (int capacity, HashProvider<K>hashProvider) {
		
		array= new LinkedList [10];
		
		for (int i=0; i<capacity; i++)
			array[i]= new LinkedList<>();
		
		this.hashProvider = hashProvider;
	}
    public void add(K key, V value) {
	   
    	int hashValue = hashProvider.hashkey(key,array.length);
    	array [hashValue].addFirst(new HashNode <>(key,value));
    	
    public Optional <V> getkey(K key){
    		
    	int hashvalue=hashProvider.haskey(key,array.length)
    	
    	.filter(keyvalue->keyvalue.getkey().equals(key))
    	.firstFirst()
    	.(HashNode::getvalue);
    }
    }
    public void remove (K key) {
    	int hashvalue= hashProvider.hashkey(key,array.length);
    	array[hashvalue]
    	.removeIf(p->p.getkey().equals(key));
    }
    
    public static void main(String args[]) {
    	
    	ChainedHashTable <Integer,String> chainedhashtable= new ChainedHashTable<>(10, new HashProvider<>());
    	
    	chainedhashtable.add(12, "Arahm");
    	chainedhashtable.add(13, "Layba");
    	chainedhashtable.add(14, "Shumayla");
    	chainedhashtable.add(15, "Arhu");
    	chainedhashtable.add(16, "Babu");
    	chainedhashtable.add(17, "Shona");

    	System.out.println(chainedhashtable);
    
    }
	
}
