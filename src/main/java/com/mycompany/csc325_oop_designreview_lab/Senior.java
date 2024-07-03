package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    //Minimum credits variable to get output the set minimum value
    private final int minCredits = 85; // created field for minimum credits


    // Declaring the variable to store the input credit value
    private int credits;
    public Senior(String name, short age , int credits) {
        super(name, age); //Super class constructor

        this.credits = credits; // initializing the variable

        if ( credits < minCredits){ // making the needed comparison to be at least 85 credits.
            throw new IllegalArgumentException("Senior must have atLeast " +minCredits + " Credits." );
        }

    }

    public String toString(){ // To String method which print the data in memory rather than address of the memory
        String output = String.format(" Senior : { Name : %s, Age = %o, GPA = %d, Credits = %o", getName(),getAge(),getGPA(),credits);

        return output;
    }
}
