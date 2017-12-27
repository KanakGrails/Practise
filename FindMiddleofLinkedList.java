package com.practice.deleteit.later;

public class FindMiddleofLinkedList {

	FindMiddleofLinkedList()
	{
		Node startingNode = new Node(10);
		Node Node1 = new Node(20);
		Node Node2 = new Node(30);
		Node Node3 = new Node(40);
		Node Node4 = new Node(50);
		Node Node5 = new Node(60);
		Node Node6 = new Node(70);
		Node Node7 = new Node(80);
		
		startingNode.setNext(Node1);
		Node1.setNext(Node2);
		Node2.setNext(Node3);
		Node3.setNext(Node4);
		Node4.setNext(Node5);
		Node5.setNext(Node6);
		Node6.setNext(Node7);
		
		Node temp = this.getMiddleElement(startingNode);
		System.out.println(temp.getData());
		
	}
	
	private Node getMiddleElement(Node startingNode)
	{
		Node slowpointer=startingNode;
		Node FastPointer=startingNode;
		
		while(slowpointer.getNext()!=null && FastPointer.getNext().getNext()!=null)
		{
			slowpointer=slowpointer.getNext();
			FastPointer=FastPointer.getNext().getNext();
		}
		return slowpointer;
	}
	
	public static void main(String args[])
	{
		new FindMiddleofLinkedList();
	}
	
	
}
class Node
{
int data;
Node next;

Node(){}
Node(int data)
{
 this.data=data;	
}

public int getData() {
	return data;
} 
public void setData(int data) {
	this.data = data;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}

}
