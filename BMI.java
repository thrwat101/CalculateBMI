/**
 * This program illustrates the use of the Java methods and the if-else-if structure. 
 * this program determines a person's BMI based on weight and height. The program
 * then gives the person their weight status.
 *
 * @author Thrwat Najjar
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args){
        double heightFeet = 0;
        double heightInches = 0;
        double weightPounds = 0;
        Scanner in = new Scanner(System.in);

        //Height input
        System.out.println("Enter your height in feet and inces (e.g. 5 11):");
        heightFeet = in.nextDouble();
        heightInches = in.nextDouble();

        //Convert height to meters
        double heightMeters = getMeters(heightFeet, heightInches);
        
        //Weight input
        System.out.println("Enter your weight in pounds (e.g. 175):");
        weightPounds = in.nextDouble();

        //Convert weight to Kg
        double weightKg = getKg(weightPounds);
        
        //Calculate BMI using our function
        double BMI = calculateBMI(heightMeters, weightKg);

        //Print output
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + getWeightStatus(BMI));
    }
    public static double calculateBMI(double height, double weight){
        
        double bmi = weight/(height*height);
        bmi = (double)((int)((bmi + .05) *10.0))/10.0;
    
        return bmi;
    }
    public static String getWeightStatus(double BMI){
        String weightStatus = "";

        if(BMI >= 29.9)
            weightStatus = "Obese";
        else if(BMI >= 25.0 && BMI < 29.9)
            weightStatus = "Overweight";
        else if(BMI >= 18.5 && BMI <= 24.9)
            weightStatus = "Normal or Healthy Weight";
        else if(BMI <18.5)
            weightStatus = "Underweight";
        
        return weightStatus;
    }

    public static double getMeters(double heightFeet, double heightInches){
        double heightMeters = (heightFeet * .3) + (heightInches * .025);
        heightMeters = (double)((int)((heightMeters + .05) *10.0))/10.0;

        return heightMeters;
    }

    public static double getKg(double weightPounds){
        double weightKg = (weightPounds * .4535);
        weightKg = (double)((int)((weightKg + .05) *10.0))/10.0;

        return weightKg;
    }

}
