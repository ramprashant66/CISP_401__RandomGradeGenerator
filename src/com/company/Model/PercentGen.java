package com.company.Model;

import java.util.Random;

//This class generates a random percentage.
public class PercentGen
{
    public int grades()
    {
        Random random = new Random(); //new random object

        return (random.nextInt(100)+ 1); //percentage generated between 0 -100

    }//end grades()

}//end class Write
