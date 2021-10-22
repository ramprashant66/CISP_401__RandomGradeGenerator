package com.company.Controller;

import com.company.Model.Read;
import com.company.Model.PercentGen;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //Creating an array list which will hold the student's names read from the text file.
        ArrayList student = new ArrayList();

        PercentGen member = new PercentGen();  //object from the class which generates a random percentage
        FinalGrades grade = new FinalGrades();  //object from the class which assigns the letter grades

        Read.ReadFile(student); //reads the text and puts each name into the array list
        int studentPercent; //will hold the student's randomly generated percentage

        //loop iterates for the size of the array list
        for (int index = 0; index < student.size(); index++)
        {
            studentPercent = member.grades();  //generates the random percent
            grade.gradeAssignment(studentPercent, student, index); //assigns the appropriate letter grade
        }

    }//end main
}//end class Main
