//Question 2
import java.util.Scanner;
 class Node{
    int data;
	Node next;
    public Node(int d){
	    this.data = d;
		this.next= null;
	}	
 }
 class LinkedListReverse{
    Node head;
    
    public void insertAtFront(int new_data){
	    Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
	}	
	public void insertAfter(Node prevNode ,int new_data){
	    if(prevNode == null){
		    System.out.println("Insertion not possible");
			return;
		}
		Node newNode = new Node(new_data);
		newNode.next =prevNode.next;
		prevNode.next = newNode;
	}
	public void append(int new_data){
	    Node newNode = new Node(new_data);
		if(head == null){
		     head = newNode;
			 return;
		} 
		newNode.next = null;
		Node trav = head;
		while(trav.next != null){
		     trav=trav.next;
		}
		
		trav.next = newNode;
		return;
		
	}
	public Node reverseList(Node node){
	   
        Node prev = null;
		Node currNode = node ;
		Node next = null;
		while(currNode != null){
			next = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = next;
		}
		node = prev ;
		return node;
		
	}
	public void printList(){
	    Node n = head ;
	        while(n != null){
	            System.out.print(n.data + "->");
		        n = n.next;
	        }
	    System.out.println("null");
	}
	
 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   LinkedListReverse lr = new LinkedListReverse();
   int data;
    while(true){
        System.out.println("1.Enter element a front");
        System.out.println("2.Enter element in between");
        System.out.println("3.Enter element at end");
        System.out.println("4.reverse element");
        System.out.println("5.display list");
        System.out.println("Enter your choice");
		int choice = scan.nextInt();
		
		switch(choice){
		     case 1:  System.out.println("Enter element");
			          data = scan.nextInt();
		              lr.insertAtFront(data);
					  break;
			case 2:   System.out.println("Enter element");
                      data = scan.nextInt();			
		              lr.insertAfter(lr.head ,data);
					  break;
		    case 3 :   System.out.println("Enter element");
			          data = scan.nextInt();
					  lr.append(data);
					  break;
			case 4 :   
                       lr.reverseList(lr.head.next.next.next);
					   
					   break;
			case 5 :  System.out.println("Display list");
                      lr.printList();
                       break;					  
 			default:  System.out.println("invalid");		   
					   
		}
		
    }
 
 }
 }