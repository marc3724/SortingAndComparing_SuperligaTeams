package com.Trigster.formidag;
import java.util.Comparator;

class ObjectComparator <E extends Comparator<E>> {
    public <E extends Comparable<E>> int compare (E e, E e1){
        return e.compareTo(e1);


    }

}
