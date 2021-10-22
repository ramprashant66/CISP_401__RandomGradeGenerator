package com.company.View;

import java.util.ArrayList;

//This class prints out the student's name, their percentages and the corresponding letter grades.
public class LetterGrades
{
    //For grade "A"
    public static void aGrade(int grade, ArrayList student, int index)
    {
        System.out.println("With the percentage of " + grade + ", [" + student.get(index) + "] has received a grade of A");
    }//end aGrades()

    //For grade "B"
    public static void bGrade(int grade, ArrayList student, int index)
    {
        System.out.println("With the percentage of " + grade + ", [" + student.get(index) + "] has received a grade of B");
    }//end bGrades()

    //For grade "C"
    public static void cGrade(int grade, ArrayList student, int index)
    {
        System.out.println("With the percentage of " + grade + ", [" + student.get(index) + "] has received a grade of C");
    }//end cGrades()

    //For grade "D"
    public static void dGrade(int grade, ArrayList student, int index)
    {
        System.out.println("With the percentage of " + grade + ", [" + student.get(index) + "] has received a grade of D");
    }//end dGrades()

    //For grade "F"
    public static void fGrade(int grade, ArrayList student, int index)
    {
        System.out.println("With the percentage of " + grade + ", [" + student.get(index) + "] has received a grade of F");
    }//end fGrades()

}//end class LetterGrades
