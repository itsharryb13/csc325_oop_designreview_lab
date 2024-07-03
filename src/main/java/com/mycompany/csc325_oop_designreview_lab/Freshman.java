package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{

    private int credits; // declaring the variable for credits
    public Freshman(String name, short age , int credits) {
        super(name, age); //Super class constructor

        this.credits = credits; // initializing the variable


    }

    public String toString(){ // To String method which print the data in memory rather than address of the memory
        // format the string to limit the use of concat and quotation marks
        return String.format(" Freshman: { Name : %s, Age = %o, GPA = %f, Credits = %d }", getName(),getAge(),getGPA(),credits);
    }
}
