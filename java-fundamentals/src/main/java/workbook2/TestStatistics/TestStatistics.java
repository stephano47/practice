package workbook2.TestStatistics;

import java.util.Arrays;

public class TestStatistics {
   public static void main(String []args){
       int[] scores = {53, 63, 57, 68, 75, 72, 88, 76, 67, 99}; // goal - display the average, high score, and lowest score
       // Average Calculation--
       int total = 0; // adds all the integers held in the array together
       for (int score : scores){ // what is the purpose :
           total += score;
       }

       // Highest Calculation--
       int max = scores[0]; // uses the 1st substring by default
       for (int score : scores){
            if (score > max){ // loop to cycle through all ints in array
                max = score;// if any int in the array is greater than the default substring that becomes max
            }
       }
       // Lowest Calculation--
       int min = scores[0]; // does what max loop does except it looks for the lowest
       for (int score : scores){
           if (score < min){
               min = score;
           }
       }

       double average = (double) total / scores.length; // it is then divided by the length
       System.out.println("Average: "+average);
       System.out.println("Highest Score: "+ max);
       System.out.println("Lowest Score: "+ min);

       //System.out.println(Arrays.toString(scores)); // prints out full size of array
   }// have to ask matt on a 1 on 1 to gain an understanding of arrays tomorrow
}
