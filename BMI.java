/**
 * This program illustrates the use of the if-else-if structure 
 * and determines a person's BMI based on weight and height. The program
 * then gives the person their weight status.
 *
 * @author Thrwat Najjar
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        double heightFeet = 0;
        double heightInches = 0;
        double weightPounds = 0;
        String fullName = "";
        Scanner in = new Scanner(System.in);

        //Gather input
        System.out.println("Enter your name (first last):");
        fullName = in.nextLine();
        
        System.out.println("Enter your weight in pounds (e.g. 175):");
        weightPounds = in.nextDouble();
        
        System.out.println("Enter your height in feet and inces (e.g. 5 11):");
        heightFeet = in.nextDouble();
        heightInches = in.nextDouble();
        
        System.out.println();
        
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        
        //Calculate BMI, Height in Meters, and Weight in KG
        double heightMeters = (heightFeet * .3) + (heightInches * .025);
        heightMeters = (double)((int)((heightMeters + .05) *10.0))/10.0;
        double weightKg = (weightPounds * .4535);
        weightKg = (double)((int)((weightKg + .05) *10.0))/10.0;
        double BMI = weightKg/(heightMeters * heightMeters);
        BMI = (double)((int)((BMI + .05) *10.0))/10.0;
        String weightStatus = "";

        //Determine weight status based on BMI
        if(BMI >= 29.9)
            weightStatus = "Obese";
        else if(BMI >= 25.0 && BMI <= 29.9)
            weightStatus = "Overweight";
        else if(BMI >= 18.5 && BMI <= 24.9)
            weightStatus = "Normal or Healthy Weight";
        else if(BMI <= 18.5)
            weightStatus = "Underweight";

        //Print output
        System.out.println("Name: " + fullName);
        System.out.println("Height (m): " + heightMeters);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + weightStatus);
    }
}