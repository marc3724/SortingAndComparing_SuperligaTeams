package com.Trigster.formidag;

import java.util.Comparator;

public class PointsComparator implements Comparator<Teams> {
    int compValue;

    public int compare(Teams t1, Teams t2) {

        if (t1.points == t2.points) {
            return 0;
        } else if (t1.points > t2.points) {
            return -1;
        } else {
            return 1;
        }
    }


}

//compValue = teamName.compareTo(t.teamName);