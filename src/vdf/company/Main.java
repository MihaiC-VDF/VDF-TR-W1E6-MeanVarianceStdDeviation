package vdf.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

       double userData[] = new double[3];


//       Getting input from the
        Scanner inputScanner = new Scanner(System.in);

        for (int i=0;i<3; i++) {
            userData[i]= inputScanner.nextDouble();
            inputScanner.nextLine();
        }

        for (int i=0; i<3; i++) {
            System.out.println("Your value#" + (i+1) + " is " +userData[i]);
        }

        double mean= meanCalculation(userData);
        System.out.println(mean);

        double variance= varianceCalculation(userData, mean);
        System.out.println("Main print " + variance);

    }

    public static double meanCalculation(double inputedData[]) {
    double sum=0;
    for (int i=0; i<inputedData.length; i++) {
        sum += inputedData[i];
    }
    return sum/inputedData.length;
    }

    public static double varianceCalculation(double inputData[], double mean) {
       double varianceSum = 0;

       for (int i=0; i< inputData.length; i++) {
           varianceSum += ((mean-inputData[i])*(mean-inputData[i]));
       }

        return varianceSum/ (inputData.length-1);

    }

}
