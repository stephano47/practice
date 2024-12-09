package workbook2.RollTheDice;
public class DiceRoll {
    public static void main(String[]args) throws InterruptedException {
        // roll loop
        Roll roll = new Roll();
        int sum2 = 0, sum4 =0, sum6 = 0, sum7 =0;
       for (int i = 1; i < 101; i++) {
         int roll1 = roll.diceRoll(); // calls from the roll class using the math random
         int roll2 = roll.diceRoll(); // for anything that needs to be randomized it must be in loop to cause -
         int sum = roll1 + roll2;     // - values to change

         System.out.println("----------------\n" + "Dice Roll #" + i);
         System.out.println("Dice 1: "+roll1);
         System.out.println("Dice 2: "+roll2);
         System.out.println("Sum: "+sum);
         System.out.println("----------------");
           if (sum == 2){
               sum2++;
           }else if (sum == 4){
               sum4++;
           }else if (sum == 6){
               sum6++;
           }else if(sum ==7){
               sum7++;
           }

     }
       Thread.sleep(100);


        System.out.println("Rolls that summed to 2: " + sum2);
        System.out.println("Rolls that summed to 4: " + sum4);
        System.out.println("Rolls that summed to 6: " +sum6);
        System.out.println("Rolls that summed to 7: "+sum7); //after running each dice roll is the same from 1 to 100

    }

}
