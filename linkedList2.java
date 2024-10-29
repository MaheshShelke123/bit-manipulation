// program to print the middle of the linkedlist 
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
		Node firstNode = new Node(1);         // this is the head node 
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);
		Node fourthNode = new Node(4);
		Node fifthNode = new Node(5);
		Node sixthNode = new Node(6);
		Node seventhNode = new Node(7);
		Node eighthNode = new Node(8);
		Node niniethNode = new Node(9);
	//	Node tenthNode = new Node(10);        // this is the tail node 
		
		// linking the nodes together 
		firstNode.next = secondNode ;
		secondNode.next = thirdNode ;
		thirdNode.next = fourthNode ;
		fourthNode.next = fifthNode ;
		fifthNode.next = sixthNode ;
		sixthNode.next = seventhNode;
		seventhNode.next = eighthNode;
		eighthNode.next = niniethNode;
	//	niniethNode.next = tenthNode ;
		
		//creating new node for pointing at the head node 
	   // Node currentNode = firstNode ;
	   // while(currentNode != null){
	   //     System.out.println(currentNode.data);
	   //     currentNode = currentNode.next ;
	   // }
	   
	   // now the problem statement is to print the middle node 
	   
	     Node fastPointer  = firstNode ;
	     Node slowPointer = firstNode ;
	     
    while(fastPointer != null && fastPointer.next != null){
	       System.out.println(fast.data);
	        fastPointer = fastPointer.next.next ;
	        slowPointer = slowPointer.next ;
	        
	    }
	    // printing null after the entire linkedlist is printed 
	    System.out.println("the data stored in the middle node is : "  + slowPointer.data);
	}
}
