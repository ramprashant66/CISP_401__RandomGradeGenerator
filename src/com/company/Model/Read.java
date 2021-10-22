package com.company.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

//This class deals with reading the texts from the text files and storing them in an array list for processing.
public class Read
{
    public static void ReadFile(ArrayList student)
    {
        //The source of the text file into a string
        String filePath = "src/com/company/students.txt";

        //Converting the string into an object path
        Path studentsFile = Paths.get(filePath);

        //Checking to see if the file already exists
        if (Files.notExists(studentsFile))
        {
            try
            {
                //Creates the file if it does not exist
                Files.createFile(studentsFile);
            }
            catch(IOException error) //catches the error
            {
                error.printStackTrace();
            }
        }

        //The actual file to read from being made into an object file
        File fromRead = studentsFile.toFile();

        //This string object will hold each line read from the file.
        String reading;

        try
        {
            BufferedReader in = new BufferedReader(new FileReader(fromRead));
            try //attempt to read from the file
            {
                while((reading = in.readLine()) != null) //while there is data in the file
                {
                    student.add(reading); //storing the name of each line into the array list
                }

            } catch(IOException error) //catches the error
            {
                error.printStackTrace();
            }

        }   catch(IOException error) //catches the error
        {
            error.printStackTrace();
        }

    }//end ReadFile()

}//end class Read
