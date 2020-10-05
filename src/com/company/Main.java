package com.company;

public class Main {

    public static void main(String[] args) {
        int moyenne = 0;
        int scores[] = new int[7];
        scores[0] = 3;
        scores[1] = 15;
        scores[2] = 35;
        scores[3] = 9;
        scores[4] = 13;
        scores[5] = 4;
        scores[6] = 6;

        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
            moyenne = moyenne + scores[i];
        }
        System.out.println("La moyenne des notes du tableau est : " + moyenne / scores.length);
    }
}
