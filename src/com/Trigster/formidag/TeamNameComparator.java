package com.Trigster.formidag;

import java.util.Comparator;

public class TeamNameComparator implements Comparator <Teams> {
    public int compare(Teams t1, Teams t2){
        int compValue = t1.teamName.compareTo(t2.teamName);
        return compValue;
    }

}
