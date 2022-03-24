package com.Trigster.formidag;

import java.util.Comparator;

public class VictoryComparator implements Comparator <Teams>{

    public int compare(Teams t1, Teams t2){

        if (t1.victory == t2.victory){
            return 0;
        }
        else if (t1.victory > t2.victory){
            return -1;
        }
        else {
            return 1;
        }
    }

}
