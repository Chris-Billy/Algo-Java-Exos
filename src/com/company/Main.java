package com.company;

public class Main {

    static void tab(int[] nomTableau){
        int moyenne = 0;

        for (int i = 0; i < nomTableau.length; i++){
            System.out.println(nomTableau[i]);
            moyenne = moyenne + nomTableau[i];
        }
        System.out.println("La moyenne des notes du tableau est : " + moyenne / nomTableau.length);
    }

    static void max(int[] nomTableau){
        int max = 0;

        for (int i = 0; i < nomTableau.length; i++){
            if (nomTableau[i] > max){
                max = nomTableau[i];
            }
        }
        System.out.println("Le plus grand nombre de ce tableau est : " + max);
    }

    static boolean inferieur10(int[] nomTableau){

        for (int i = 0; i < nomTableau.length; i++){
            if (nomTableau[i] < 10){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int scores[] = new int[7];
        scores[0] = 3;
        scores[1] = 15;
        scores[2] = 35;
        scores[3] = 9;
        scores[4] = 13;
        scores[5] = 4;
        scores[6] = 6;

        tab(scores);
        max(scores);
        System.out.println(inferieur10(scores));
    }
}
