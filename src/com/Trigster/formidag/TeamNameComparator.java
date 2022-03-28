package com.Trigster.formidag;

import java.util.Comparator;

public class TeamNameComparator extends objektComparator{
    public int compare(Comparable t1,Comparable t2){
        Teams s=(Teams)t1;
        Teams s1=(Teams) t2;
        return s.teamName.compareTo(s1.teamName);
    }

}
