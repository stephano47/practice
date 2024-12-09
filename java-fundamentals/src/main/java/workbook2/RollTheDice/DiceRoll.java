package workbook2.RollTheDice;

import workbook1.mathApp.random;

public class DiceRoll {
    public static void main(String[]args) throws InterruptedException {
        // roll loop
        Roll roll = new Roll();
       int i = 1;
       int roll1 = roll.diceRoll(); // calls from the roll class using the math random
       int roll2 = roll.diceRoll();
       int sum = roll1 + roll2;
     do {
         System.out.println("----------------\n" + "Dice Roll #" + i);
         System.out.println("Dice 1: "+roll1);
         System.out.println("Dice 2: "+roll2);
         System.out.println("Sum: "+sum);
         System.out.println("----------------");
         i++;
     }while (i <= 100);
     Thread.sleep(100);
     System.out.println("");
       int sum2 = 0, sum4 =0, sum6 = 0, sum7 =0;

     if (sum == 2){
        sum2++;
     }else if (sum == 4){
         
     }
    }

}
