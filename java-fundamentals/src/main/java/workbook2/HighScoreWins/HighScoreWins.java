package workbook2.HighScoreWins;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        // Allow user to input team names and scores
        // Program will then display the winner
        System.out.println("Please enter the names and scores of both teams teams using (: and |)\n" + "For Example: Team1:Team2|20:45");
        String userScores = scanner.nextLine(); //index means position

        int indexOfBar = userScores.indexOf("|"); // responsible for splitting the scores and the teams
        // team names

        String teamnamesString = userScores.substring(0, indexOfBar); // this splits the teams names
        String[] teamnames = teamnamesString.split(Pattern.quote(":"));//indicating left and right team

        // scores of both teams
        String afterBar = userScores.substring(indexOfBar + 1);
        String[] scores = afterBar.split(Pattern.quote(":"));

        int leftScore = Integer.parseInt(scores[0]);
        int rightScore = Integer.parseInt(scores[1]);
        // calculation

        boolean leftWin = (leftScore > rightScore);
        if (leftWin){
            System.out.println(teamnames[0] + " Wins!");
        } else if (!leftWin) {
            System.out.println(teamnames [1] + " Wins!");
        }
    }
}
