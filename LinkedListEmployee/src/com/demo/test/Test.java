package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.beans.EmployeeLL;

public class Test{
	public static void main(String[] args) {
		EmployeeLL ob=new EmployeeLL();
		Employee ob1=new Employee(11,"atharva","M");
		ob.AddEmployee(ob1);
		Employee ob2=new Employee(12,"sakshi","F");
		ob.AddEmployee(ob2);
		Employee ob3=new Employee(13,"Janhavi","F");
		ob.AddEmployee(ob3);
		Employee ob4=new Employee(14,"Shivam","M");
		ob.AddEmployee(ob4);
		Employee ob5=new Employee(15,"Siddhant","M");
		ob.AddEmployee(ob5);
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1:Add Employee/n 2:DisplayAll/n 3:Remove Employee/n 4:Display Female Employees/n 5:Display Male Employees /n ^:Exit");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter YOur ID");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter YOur Name");
				String name=sc.nextLine();
				System.out.println("ENter Your Gender M or F");
				String gender=sc.nextLine();
				
				Employee ob6=new Employee(id,name,gender);
				ob.AddEmployee(ob6);
				break;
			
			case 2:
				ob.DisplayAll();
				break;
				
			case 3:
				ob.RemoveEmp();
				break;
				
			case 4:
				ob.DisplayFemales();
				break;
				
			case 5:
				ob.DisplayMales();
				break;
				
			case 6:
				System.out.println("Thanks For Visiting");
			}
			
			
		}while(ch!=7);
	}
}