package workbook2.RollTheDice;

import workbook1.mathApp.random;

public class DiceRoll {
    public static void main(String[]args){
        Roll roll = new Roll();
       int roll1 = roll.diceRoll();
       int roll2 = roll.diceRoll();


        System.out.println(roll1);
        System.out.println(roll2);
    }

}
