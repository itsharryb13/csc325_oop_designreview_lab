package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private final int minCredits = 85; // created field for minimum credits

    private int credits;
    public Senior(String name, short age , int credits) {
        super(name, age);

        if ( credits < minCredits){
            throw new IllegalArgumentException("Senior must have atLeast " +minCredits + " Credits." );
        }else{
            this.credits = credits;
        }
    }

    public String toString(){
        String output = String.format(" Senior : { Name : %s, Age = %o, GPA = %d, Credits = %o", getName(),getAge(),getGPA(),credits);

        return output;
    }
}
