package Lesson3;

import java.util.ArrayList;

// Program to demonstrate implementation of our own "HashTable with chaining for collision detection".

public class Map <K,V> {
	
	// bucketArray will store array of CHAINS.
  
	private ArrayList<HashNode<K,V>> bucketArray;
	
	private int numBuckets; // Current capacity of ArrayList
	
	private int size;     
	
    public Map() {
	
	   bucketArray = new ArrayList<>();
	   
	   numBuckets=10;       //Capacity f bucketArray
	   
	   size=0;              // number of element added in ArrayList
	   
	   for (int i=0; i<numBuckets; i++) { //Create Empty chain
		   bucketArray.add(null);
	   }   
	 }
    
 // Method 1 : Checking Size
    
    public int size() {  // not mandatory method but can help
    	return size;
    }	
	
// Method 2 : Checking ig the size of ArrayList is Empty (Not necessary though)
    
    public boolean isEmpty() { // not mandatory method but can help
    	
    	return size()==0;
    }
 
 // Method 3: Getting index of each hashnode entry
    
    private int getHash(K key) {        // This implements has function to find Index for a key
    	
    	int hashCode= key.hashCode();
    	
    	int index = hashCode%numBuckets;
    	
    	index= index<0 ? index * -1 : index;   // e.hashCode() could be negative, so multiplying
                                               // multiplying a negative value with negative value will make it positive
    	
		return index;
				  	
    }

// Method 4: Deleting an Element from HashNode
    
    public V remove(K key) {                  // Method to remove given key
      
    	int hashIndex= getHash(key);           //Apply hash function to find index for given key
    	
    	HashNode <K,V> entry = bucketArray.get(hashIndex);  
    	
    	HashNode <K,V> prev = null;         
    	    	
    	while(entry!=null) {                    // While loop search for a key in its chain 

    		if(entry.key.equals(key)) {        // if key found
    			break;
    		}
    		
           prev=entry;                         // else key moving in chain 
           
           entry=entry.next;
    	}
    	
    	if(entry==null) {                      // if key was not there
 	    return null;
    	}
    	
    	size--;                              // reduce size
    	if(prev!=null) {                     // remove key
    		prev.next=entry.next;             //prev.next is=entry
    		
    		
    	} else {
    		bucketArray.set(hashIndex, entry.next);  // here entry.next is null , hence it will return 
    	}
    	
    	return entry.value;
    	
    	}
    
// Method 5:  Searching Particular key with its index reference
         
    public V get(K key){                     // return the value of for a key
    	
    	int hashIndex= getHash(key);            // get the index of HashTable from getHash method where we need to add key
    	HashNode <K,V> entry=bucketArray.get(hashIndex);
    	
    	while (entry!=null) {
    		if (entry.key.equals(key)) {
    			return entry.value;
    			    		}
    		entry=entry.next;
        }
    	return null;
        }
    
 // Method 6: Adding value to HashNode
    
    public void add(K key, V value) {           // add a key value pair to hash
    	
    	int hashIndex= getHash(key);
    	HashNode <K,V> entry=bucketArray.get(hashIndex);
    	
    	while (entry!=null) {
    		if (entry.key.equals(key)) {        // the whole loop is to checking key if already present or not and not to add
    			entry.value=value;
             return;
             }
    		entry=entry.next;
        }
    	 size++;                               // insert key in chain // increased size from 0 to more
    	 entry=bucketArray.get(hashIndex);
    	 HashNode <K,V> newNode= new HashNode<K,V>(key,value);
    	 newNode.next= entry;                   //newNode.next=entry.next;
    	 bucketArray.set(hashIndex, newNode);  // entry.next=newNode;
    	  
    	 if((1.0 * size)/numBuckets>= 0.7) {          // if load factor goes beyond threshold then double hashtable size
    		 ArrayList<HashNode<K,V>> temp=bucketArray;
    		 bucketArray = new ArrayList<>();
    		 numBuckets = 2 * numBuckets;
    		 size=0;
    		 
    		 for(int i=0; i<numBuckets; i++) {          
    			 bucketArray.add(null);
    		 }
    		 
    		 for(HashNode <K,V> headNode:temp) {      // headNode are the temporary variables which holds the value of (continue)
    			                                                           //(continue) each entry of temp array
    			 while (headNode!=null) {              
    				 add(headNode.key,headNode.value);
    				 headNode=headNode.next;
    				     				
    			 }
    		 }
    	 }
        }
         	
    }
 
