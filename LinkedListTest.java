package com.practice.deleteit.later;

/**
 * Singly Linked List example
 * */

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListTest {
	public static void main(String args[])
	{
		
	}

class LinkedList
	{
	 
		private Node node;
		
		public void add(Object data)
		{
			if(node==null){ 
			node= new Node(data);
			
			}
		}
		    
	}

class Node{
	private Object data;
	private Node next;
	
	Node(Object data)
	{
		this.next=null;
		this.data=data;
	}
	Node(Object data, Node nextNode)
	{
		this.next=nextNode;
		this.data=data;
	}
	
	public Object getData()
	{
		return data;
	}
	public void setData(Object data)
	{
		this.data=data;
	}
	
	public void setNext(Node next)
	{
		this.next=next;
	}
	public Node getNext()
	{
		return next;
	}
}
}
