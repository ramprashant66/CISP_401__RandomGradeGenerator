package com.company.Controller;

import com.company.View.LetterGrades;
import java.util.ArrayList;

//This class calls appropriate methods in the VIEW package to return a letter grade.
public class FinalGrades
{
    public void gradeAssignment(int grade, ArrayList student, int index)
    {
        if (grade >= 0 && grade < 60)
        {
            //calls VIEW statement for F
            LetterGrades.fGrade(grade, student, index);
        }

        if (grade >= 60 && grade < 70)
        {
            //calls VIEW statement for D
            LetterGrades.dGrade(grade, student, index);
        }

        if (grade >= 70 && grade < 80)
        {
            //calls VIEW statement for C
            LetterGrades.cGrade(grade, student, index);
        }

        if (grade >= 80 && grade < 90)
        {
            //calls VIEW statement for B
            LetterGrades.bGrade(grade, student, index);
        }

        if (grade >= 90 && grade < 101)
        {
            //calls VIEW statement for A
            LetterGrades.aGrade(grade, student, index);
        }
    }//end gradeAssignment

}//end class FinalGrades
