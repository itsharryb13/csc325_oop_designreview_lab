/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Human
public class Student extends Human {

    // ToDo 3: Add a field for GPA and create a setter and a getter
    double GPA;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    //initializing student by call constructor and adding the super class
    public Student( String name, short age){
        super(name,age);
    }

    // inherited from human class and overriding
    @Override
    public String getAddress() {
        return null;
    }


    // inherited from human class and overriding
    @Override
    public void setAddress(String address) {

    }


	// ToDo 2: Fix the resulting errors


	
	// ToDo 4: Add comments to your code
}
