package com.demo.beans;

public class EmployeeLL {
	Node front;
	Node rear;
	class Node{
		
		Employee data;
		Node next;
		public Node(Employee ob1) {
			data=ob1;
			next=null;
		}
		
	}
	public EmployeeLL() {
		front=null;
		rear=null;
	}
	public void AddEmployee(Employee ob) {
		if(rear==null) {
			rear=new Node(ob);
			front=rear;
		}
		else {
			Node newnode=new Node(ob);
			rear.next=newnode;
			rear=newnode;
		}
	}
	public void DisplayAll() {
		if(front==null) {
			System.out.println("List is EMpty");
		}
		else {
			Node temp =front;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
				
			}
		}
	}
	public void RemoveEmp() {
		Node temp=front;
		if(front==null) {
			System.out.println("List is Empty");
		}
		else {
			front=temp.next;
			temp.next=null;
			temp=null;
		}
	}
	public void DisplayFemales() {
		if(front==null) {
			System.out.println("List is Empty");
		}
		else {
			Node temp=front;
			while(temp!=null) {
				if(temp.data.getGender().equals("F")) {
					System.out.println(temp.data);
					
				}
				temp=temp.next;
			}
		}
	}
	public void DisplayMales() {
		if(front==null) {
			System.out.println("List is Empty");
		}
		else {
			Node temp=front;
			while(temp!=null) {
				if(temp.data.getGender().equals("M")) {
					System.out.println(temp.data);
					
				}
				temp=temp.next;
			}
		}
	}
}
