package Lesson3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.junit.Test;

// INSERTION ELEMENT'S

public class BinaryTree {

	Node root;
	
//method1	
private Node addRecursive (Node current, int value) {
	
	if (current ==null) {
		return new Node(value); 
	}
	
	if (value < current.value) {
		
		current.left=addRecursive(current.left, value);
		
	}else if(value>current.value) {
		
		current.right=addRecursive(current.right, value);
		
	}else {
		
		//value already exist
		return current;
	}
	
	return current;
}

//method2
public void add (int value) {
	root = addRecursive(root,value);
}

//method3
private static BinaryTree createBinaryTree() {
	BinaryTree BT= new BinaryTree();
	
//	BT.add(6);
//	BT.add(4);
//	BT.add(8);
//	BT.add(3);
//	BT.add(5);
//	BT.add(7);
//	BT.add(9);
	
	Scanner sc = new Scanner(System.in);
	
	for ( int i=0; i<11; i++) {
		System.out.println("Enter the elements you wants to add:");
		BT.add(sc.nextInt());
	}
	
	return BT;

}

//********************************//

//Finding Elements AKA Binary Search 

// Method:1

private boolean containsNodeRecursive(Node current, int value) {
	
	if (current==null) {
		return false;
	}
	
	if (value== current.value) {
		return true;
	}
	
	return value < current.value                          // is an if condition .. if 
			? containsNodeRecursive(current.left, value)  // if small then find in left nodes
			: containsNodeRecursive(current.right,value); // if greater then find in right nodes.
			
}

//Method:2

public boolean containsNode(int value) {
	return containsNodeRecursive(root, value);
}

//Method:3

@Test
private void givenBinaryTree_WhenAddingElements_TheTreeContainsThoseElements() {
	
	BinaryTree bt= createBinaryTree();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Elements to be searched");
	assertTrue(bt.containsNode(sc.nextInt()));
	
	assertFalse(bt.containsNode(sc.nextInt()));

}

//**********************************************//

// Deleting an Element 

//Method-1


private int findSmallestValue(Node root) {
	
    return root.left == null ? root.value : findSmallestValue(root.left);       // finding smallestvalue in left of right child node
                                                                               // finding the smallest value which will be present in the down left 
}

//Method-2

private Node deleteRecursive(Node current, int value) {
	
	if (current == null) {                                          // 1st
		
		return null;
	}
	
	if (value == current.value) {                                 //2nd 
		
		if (current.right == null) {                             // when it node has only/one left child
	    	return current.left;
	    }
	    
	    if (current.left == null) {                             // when it node has only/one right child
	    	
	    	return current.right;
	    }
	    
	    if (current.left == null && current.right == null) {     // when it node has no child
	        return null;
	    }
	    
	    // Passing right sub tree in the findSmallestValue method to find the smallest value in right sub tree..............
	    
	    int smallestValue = findSmallestValue(current.right);        // when it node has Two (left and right node) child
	    current.value = smallestValue;
	    current.right = deleteRecursive(current.right, smallestValue);
	    return current;
	}
	
	if (value < current.value) {                                //3rd
		current.left = deleteRecursive (current.left, value);
		return current;
	}
	current.right = deleteRecursive(current.right, value);
	return current;
}

//Method-3

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
    
// Method-4

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        BinaryTree bt = createBinaryTree();
        
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the Elements you want to delete");

        assertTrue(bt.containsNode(sc.nextInt()));
        bt.delete(sc.nextInt());
        assertFalse(bt.containsNode(sc.nextInt()));
    }

 // Traversing the Tree
    // Depth First Search
    
    public void traverseInOrder(Node node) {
    	if (node !=null) {
    		traverseInOrder(node.left);
    		System.out.println(""+node.value);
    		traverseInOrder(node.right);
       	}
    }
    
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
//    And let's check the pre-order traversal in the console output:

//    Post-order traversal visits the left subtree, the right subtree, and the root node at the end:

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" " + node.value);
        }
    }
    
    //  Breadth First search Tree
    
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {              // if node is not empty then enter the while loop

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }
    
}
