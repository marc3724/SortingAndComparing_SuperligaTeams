package com.Trigster.formidag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //TODO Klubbens navn
    //TODO antal vundne kampe i den aktuelle sæson
    //TODO antal spillede kampe i den aktuelle sæson
    //TODO antal point


    public static void main(String[] args) {

        Teams[]tabel1 = new Teams[5];
        tabel1[0] = new Teams("FC Copenhagen", 4,9,7);
        tabel1[1] = new Teams("Brøndby IF", 6,9,7);
        tabel1[2] = new Teams("Holmegaard",25,9,3);
        tabel1[3] = new Teams("Næstved",5,8,7);
        tabel1[4] = new Teams("DatZea",0,11,-3);

        // Linje 25 laver array'et om til en ArrayList
        ArrayList<Teams> tabel2 = new ArrayList<>(Arrays.asList(tabel1));

        TeamNameComparator tnc = new TeamNameComparator();
        VictoryComparator vc = new VictoryComparator();
        PointsComparator pc = new PointsComparator();
        GamesPlayedComparator gpc = new GamesPlayedComparator();

            System.out.printf("\n%100s\n" + "%102s\n" + "%101s\n" + "%100s\n" ,
                "1. Sort after Teams Names",
                "2. Sort after Teams Victory",
                "3. Sort after Teams Played" ,
                "4. Sort after Teams Point");

        System.out.println(
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. Sort Team names in alphabetical order\n"+
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Sort Teams after number of Victories\n"+
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3. Sort Teams after numbers of matches played\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4. Sort Teams after number of Point\n");


        Scanner scan = new Scanner(System.in);

            switch (scan.nextInt()) {
                case 1:
                    Collections.sort(tabel2, tnc);
                    for (int i = 0; i < tabel2.size(); i++) {
                        System.out.println(tabel2.get(i));
                    }
                    break;
                case 2:
                    Collections.sort(tabel2, vc);
                    for (int i = 0; i < tabel2.size(); i++) {
                        System.out.println(tabel2.get(i));
                    }
                    break;
                case 3:
                    Collections.sort(tabel2, gpc);
                    for (int i = 0; i < tabel2.size(); i++) {
                        System.out.println(tabel2.get(i));
                    }
                    break;
                case 4:
                    Collections.sort(tabel2, pc);
                    for (int i = 0; i < tabel2.size(); i++) {
                        System.out.println(tabel2.get(i));
                    }
                    break;
                default:
                    System.out.println("input not recognized, please use an input from the list above");
            }

/*
        Bubblesort b1 = new Bubblesort(tabel1);
        for (int i = 0; i < tabel1.length; i++) {
            System.out.println(tabel1[i] + " ");

        }*/
        /*
        PointsComparator b2 = new PointsComparator(tabel1);
        for (int i = 0; i < tabel1.length; i++) {
            System.out.println(tabel1[i] + " ");
        }
*/


    }
}
