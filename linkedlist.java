// this is the simple code to create a linked list add nodes to the linkedlist and then printing all elements in the linkedlist 
import java.util.*;

public class Main
{
    // creating a class as a structure for the node 
    static class Node {
        int data ;
        Node next ;
        
        Node (int data)
        {
            this.data = data ;
            this.next = null ;
        }
    }
	public static void main(String[] args) {
		// creating individual nodes 
		Node firstNode = new Node(3);         // this is the head node 
		Node secondNode = new Node(5);
		Node thirdNode = new Node(12);
		Node fourthNode = new Node(2);        // this is the tail node 
		
		// linking the nodes together 
		firstNode.next = secondNode ;
		secondNode.next = thirdNode ;
		thirdNode.next = fourthNode ;
		
		//creating new node for pointing at the head node 
	    Node currentNode = firstNode ;
	    while(currentNode != null){
	        System.out.println(currentNode.data);
	        currentNode = currentNode.next ;
	    }
	    
	    // printing null after the entire linkedlist is printed 
	    System.out.println("null");
	}
}
