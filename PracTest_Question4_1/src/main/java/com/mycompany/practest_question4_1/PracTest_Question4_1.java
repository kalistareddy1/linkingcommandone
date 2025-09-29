/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practest_question4_1;

/**
 *
 * @author kalis
 */
public class PracTest_Question4_1 {

    public static void main(String[] args) {
        String[] manufacturer = {"CANON", "SONY","NIKON"};
        
        String[] cameraType = {"MIRRORLESS", "DSLR"};
        
        double[][] price = {{10500, 8500},
                            {9500, 7200},
                            {12000, 8000}};
        
        System.out.println("-".repeat(72) + "\nCAMERA TECHNOLOGY REPORT\n" + "-".repeat(72));
        System.out.println("\t\t" + cameraType[0] + "\t\t" + cameraType[1]);
        
        for(int i = 0; i < manufacturer.length; i++){
            System.out.print(manufacturer[i] + "\t\t");
            for(int j = 0; j < price[i].length; j++){
                System.out.print("R " + price[i][j] + "0" + "\t\t");
            }
            System.out.println();
        }
        System.out.println("-".repeat(72) + "\nCAMERA TECHNOLOGY RESULTS\n" + "-".repeat(72)); 
        mostCostDifference(manufacturer, price);
        System.out.println();
        mostDifferenceCamera(manufacturer, price);
        System.out.println("-".repeat(72));
    }
    public static void mostCostDifference(String[] manufacturer, double[][] price){
        for(int i = 0; i < price.length; i++){
            double difference = Math.abs(price[i][0] - price[i][1]);
            System.out.print(manufacturer[i] + "\t" + "R " + difference + "0");
            if(difference >= 2500){
                System.out.print("\t" + "***");
            }
            System.out.println();
        }
    }
    public static void mostDifferenceCamera(String[] manufacturer, double[][] price){
        int manufacturerIndex = 0;
        double maxDifference = 0;
        
        for(int i = 0; i < price.length; i++){
            double difference = Math.abs(price[i][0] - price[i][1]);
            if(difference > maxDifference){
                manufacturerIndex = i;
            }
        }
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + manufacturer[manufacturerIndex]);
    }
}
