package com.company;

public class Main {
    /**
     * Calcule la moyenne des notes d'un tableau.
     * @param nomTableau un tableau d'entier
     */
    public static float tab(int[] nomTableau){
        float moyenne = 0;

        for (int i = 0; i < nomTableau.length; i++){
            System.out.println(nomTableau[i]);
            moyenne = moyenne + nomTableau[i];
        }
        return moyenne;
    }

    /**
     * Affiche le nombre le plus grand présent dans un tableau.
     * @param nomTableau un tableau d'entier
     */
    public static int max(int[] nomTableau){
        int max = 0;

        for (int i = 0; i < nomTableau.length; i++){
            if (nomTableau[i] > max){
                max = nomTableau[i];
            }
        }
        return max;
    }

    /**
     * Retourne vrai s'il y a un nombre en dessous de 10 dans un tableau.
     * @param nomTableau un tableau d'entier
     * @return Vrai si un nombre est < 10, sinon Faux
     */
    public static boolean inferieur10(int[] nomTableau){

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

        System.out.println("La moyenne des notes du tableau est : " + tab(scores) / scores.length);
        System.out.println("Le plus grand nombre de ce tableau est : " + max(scores));
        System.out.println(inferieur10(scores));
    }
}
