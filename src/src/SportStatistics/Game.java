/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mein
 */
public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    
    public Game (String homeName, String visitingName, 
            int homePoints, int visitingPoints) {
        this.homeTeam = homeName;
        this.visitingTeam = visitingName;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getVisitingTeam() {
        return visitingTeam;
    }
    
    public int getHomePoints() {
        return homePoints;
    }
    
    public int getVisitingPoints() {
        return visitingPoints;
    }
}
