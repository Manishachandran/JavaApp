package com.studentInfo;

import java.util.Scanner;



public class Student {
	
	//Student properties
	int studentId;
	String studentName;
	String studentAddress;
	long mobileNumber;
	int html;
	int css;
	int js;
	int es6;
	int reactjs;
	int java;
	
	//actions
	
	void setDetails(int a, String b,String c,long d)
	{
		studentId = a;
		studentName = b;
		studentAddress = c;
		mobileNumber = d;
	}
	void setMarks(int e,int f,int g,int h,int i,int j)
	{
		html = e;
		css = f;
		js = g;
		es6 = h;
		reactjs = i;
		java = j;
	}
	void studentInfo()
	{
		System.out.println("Student details are!!! ");
		System.out.println("Student id is:"+studentId);
		System.out.println("Student name is:"+studentName);
		System.out.println("Student Address is:"+studentAddress);
		System.out.println("Student mobile number is:"+mobileNumber);
		System.out.println("Html mark is:"+html);
		System.out.println("Css mark is:"+css);
		System.out.println("Js mark is: "+js);
		System.out.println("ES6 mark is: "+es6);
		System.out.println("Reactjs mark is: "+reactjs);
		System.out.println("Java mark is: "+java);
	}
	
	void marksCalculation()
	{
		int total = html+css+es6+js+reactjs+java;
		System.out.println("Total marks is : "+total);
		
		int avg = total/6;
		System.out.println("Average is : "+avg);
		
		if(avg>90)
		{
			System.out.println("A");
		}
		else if(avg>80&&avg<90)
		{
			System.out.println("B");
		}
		else if(avg>70&&avg<80)
		{
			System.out.println("C");
		}
		else if(avg>60&&avg<70)
		{
			System.out.println("D");
		}
		else if(avg>50&&avg<60)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

	public static void main(String[] args) 
	{
		//need to give chance to end user 
				Scanner sc = new Scanner(System.in);
				System.out.println("Welcome to Student portal!!!");
				System.out.println("Please enter student id: ");
				int a = sc.nextInt();
				System.out.println("Please enter studnet name: ");
				String b = sc.next();
				System.out.println("Please enter address: ");
				String c = sc.next();
				System.out.println("Please enter mobile number: ");
				long d = sc.nextLong();
				System.out.println("Please enter html mark: ");
				int e = sc.nextInt();
				System.out.println("Please enter css mark: ");
				int f = sc.nextInt();
				System.out.println("Please enter js mark: ");
				int g = sc.nextInt();
				System.out.println("Please enter ES6 mark: ");
				int h = sc.nextInt();
				System.out.println("Please enter react js mark: ");
				int i = sc.nextInt();
				System.out.println("Please enter java mark: ");
				int j = sc.nextInt();
				
				//create object for tv class
				Student stud = new Student();
				stud.setDetails(a, b, c, d);
				stud.setMarks(e,f,g,h,i,j);
				stud.studentInfo();
				stud.marksCalculation();
	}

}
