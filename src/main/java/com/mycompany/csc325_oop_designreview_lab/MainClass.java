/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 	public static void main(String[] args) {

		// Fixed by adding variable type for age
		Student std = new Student("James", (short) 20);
		// Fixed by adding variable type for age and change the name to correct constructor class and structure ( Student => Freshmen)
		Freshman std1 = new Freshman("James", (short) 20, 12);
		// Fixed by adding variable type for age and change the name to correct constructor class and structure (Student => Senior)
		Senior std2 = new Senior("John", (short) 30, 90);

		//Initializing the Scanner to take an input for GPA
		Scanner srn = new Scanner(System.in);

		//for student
		System.out.print("Enter GPA for student " + std.getName() + ": ");
		std.setGPA(srn.nextDouble()); // stores the gpa by calling the set method
		System.out.println(std); // prints the toString for student


		// for freshman
		System.out.print("Enter GPA for freshman " + std1.getName() + ": ");
		std1.setGPA(srn.nextDouble()); // stores the gpa by calling the set method
		System.out.println(std1); // prints the toString for freshman


		//for senior
		System.out.print("Enter GPA for senior " + std2.getName() + ": ");
		std2.setGPA(srn.nextDouble()); // stores the gpa by calling the set method
		System.out.println (std2); // prints the toString for senior

	}



}



