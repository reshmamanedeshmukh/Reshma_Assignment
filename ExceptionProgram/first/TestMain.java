package com.yash.first;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter roll no of student ");
		int rollno=scanner.nextInt();
		
		System.out.println("Enter name of the student");
		String name=scanner.next();
		
		System.out.println("Enter address of student");
		String address=scanner.next();
		
		
		
		

		System.out.println("Enter marks in maths");

		int mathMarks = scanner.nextInt();

		if (mathMarks < 0) {
			throw new ResultException("Marks enter negative in number");
		}

		System.out.println("Enter marks in science");

		int scienceMarks = scanner.nextInt();

		if (scienceMarks < 0) {
			throw new ResultException("Marks enter negative in number");
		}

		System.out.println("Enter marks in english");

		int englishMarks = scanner.nextInt();

		if (englishMarks < 0) {
			throw new ResultException("Marks enter negative in number");
		}

		System.out.println("Enter marks in chemistry");

		int chemistryMarks = scanner.nextInt();

		if (chemistryMarks < 0) {
			throw new ResultException("Marks enter negative in number");
		}

		StudentResult sr = new StudentResult(mathMarks, scienceMarks, englishMarks, chemistryMarks);

		Student std = new Student(rollno, name, address, sr);

		System.out.println(std);

		if ((sr.getMathMarks() < 40) || (sr.getScienceMarks() < 40)
				|| (sr.getEnglishMarks() < 40 )|| (sr.getChemistryMarks() < 40))
				 {
			System.out.println("Student Failed in Exam");
				 }
			else
			{
				System.out.println("Student passed in Exam");	

		}
		int average = (mathMarks + scienceMarks + englishMarks + chemistryMarks) / 4;

		try {
			if (average < 40) {

				throw new ResultException("Average is less than 40 percent");
			}

		}

		catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("Average marks"+average);	
	}
}
