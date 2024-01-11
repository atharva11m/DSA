package com.demo.test;

import com.demo.beans.MyStack;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack ob=new MyStack(4);
		ob.push(10);
		ob.push(9);
		ob.push(8);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		while(!ob.isEmpty()) 
			System.out.println(ob.pop());
	}

}
