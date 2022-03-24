package com.Trigster.formidag;
import java.util.Comparator;
//TODO superligaKlub = Teams
//TODO Klubbens navn                                Done
//TODO antal vundne kampe i den aktuelle sæson      Done
//TODO antal spillede kampe i den aktuelle sæson    Done
// TODO antal mængde af points                      Done

//public class Teams <E extends Comparable<Teams>> {
public class Teams implements Comparable <Teams> {
    String teamName;
    int victory;
    int played;
    int points;
    int compValue;

    public Teams(String teamName, int victory, int played, int points) {
        this.teamName = teamName;
        this.victory = victory;
        this.played = played;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Team" +
                "Name= " + teamName +
                ", victory=" + victory +
                ", played=" + played +
                ", points= " + points +
                '}';
    }

    public int compareTo(Teams t) {
        compValue = teamName.compareTo(t.teamName);
        return compValue;
/*
        if (teamName.compareTo(t.teamName) == 0){
            return 0;
        }
        else if (teamName.compareTo(t.teamName) > 0){
            return 1;
        }
        else {
            return -1;
        }
    }
    */
/*
    public int compareTo(Teams t) {
        //compValue = teamName.compareTo(t.teamName);
        //return compValue;

        if (victory == t.victory){
            return 0;
        }
        else if (victory > t.victory){
            return -1;
        }
        else {
            return 1;
        }
    }

    public int compareTo(Teams t) {
        //compValue = teamName.compareTo(t.teamName);
        //return compValue;

        if (points == t.points){
            return 0;
        }
        else if (points > t.points){
            return -1;
        }
        else {
            return 1;
        }

 */
    }
}




