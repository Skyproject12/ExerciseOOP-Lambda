package com.company;

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<Integer> arrl= new ArrayList<>();
        arrl.add(1);
        arrl.add(2);
        arrl.add(3);
        arrl.add(4);
        arrl.add(5);
        // forEach biasa
        for (int n : arrl) {
            System.out.println(n);
        }
        // menggunakan lambda
        arrl.forEach(n-> System.out.println(n));
        arrl.forEach(n->{if(n%2==0){
            System.out.println(n);
        }});
    }
}
