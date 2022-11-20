 /* 
program that asks user for csv file name input (team, team, points, points)
 program also asks for a single team input for statistics
 creates Game-objects based on that and stores it in ArrayList
 calculates and prints wins, losses and total games of input team
*/

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Game> games = new ArrayList<>();
        
        int gamesDone = 0;
        int wins = 0;
        int losses = 0;
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println ("Team:");
        String team = scan.nextLine();
        
        try (Scanner scanFile = new Scanner (Paths.get (file))) {
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                
                // creates Game-objects based on csv format and adds to ArrayList
                String[] rowParts = row.split (",");
                String homeTeam = rowParts[0];
                String visitingTeam = rowParts[1];
                int homeTeamPoints = Integer.valueOf (rowParts[2]);
                int visitingTeamPoints = Integer.valueOf (rowParts[3]);
                
                games.add (new Game (homeTeam, visitingTeam, 
                        homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        for (Game game : games) {
            if (game.getHomeTeam().equals (team) && 
                    game.getHomePoints() > game.getVisitingPoints()
                    || game.getVisitingTeam().equals (team) && game.getVisitingPoints()
                    > game.getHomePoints()) {
                wins = wins + 1;
            }
            
            if (game.getHomeTeam().equals (team) && game.getHomePoints() < 
                    game.getVisitingPoints() || game.getVisitingTeam().equals (team)
                    && game.getVisitingPoints() < game.getHomePoints()) {
                losses = losses + 1;
            }
        }
        gamesDone = wins + losses;
        System.out.println("Games: " + gamesDone);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
