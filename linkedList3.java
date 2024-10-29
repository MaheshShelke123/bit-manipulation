// program to reverse the linkedlist using extra array 

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
	    
	    int[] arr ;
	    arr = new int[10];
	    int i = 0;
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
		Node tenthNode = new Node(10);        // this is the tail node 
		
		// linking the nodes together 
		firstNode.next = secondNode ;
		secondNode.next = thirdNode ;
		thirdNode.next = fourthNode ;
		fourthNode.next = fifthNode ;
		fifthNode.next = sixthNode ;
		sixthNode.next = seventhNode;
		seventhNode.next = eighthNode;
		eighthNode.next = niniethNode;
		niniethNode.next = tenthNode ;
		
        Node currentNode = firstNode ;
        while(currentNode != null){
        arr[i++] = currentNode.data;
        currentNode = currentNode.next;
        }
        currentNode = firstNode ;
        
        for(int j=9;j>= 0; j--){
           currentNode.data = arr[j];
           currentNode = currentNode.next ;
        }
        currentNode = firstNode ;
        for(int k=0;k<10;k++){
           System.out.println(currentNode.data);
           currentNode = currentNode.next ;
        }
        

	}
}
