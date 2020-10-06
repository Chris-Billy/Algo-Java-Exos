package com.company;

public class Main {

    static void countDownLoop(int start){
        for (int i = start; i > 0; i--){
            System.out.print(i + "...");
        }
        System.out.println("FINISHED");
    }

    static void countDownRecursive(int start){
        if (start > 0){
            System.out.print(start + "...");
            countDownRecursive(start - 1);
        }
        else{
            System.out.println("FINISHED");
        }
    }

    /**
     * Trouver l'index du tableau qui contient le nombre recherché
     * @param nomTableau un tableau d'entier
     * @param nbAchercher un nombre entier
     * @return un nombre entier (index du tableau)
     */
    public static int rechercheBinaire(int[] nomTableau, int nbAchercher){
        int min = 0;    // index minimum du tableau
        int max = nomTableau.length - 1;    // index maximum du tableau
        int index = 0;  // index où se trouve le nbAchercher

        while (min <= max){
            int milieu = (min + max) / 2;   // On divise l'intervalle par 2

            if (nbAchercher < nomTableau[min] || nbAchercher > nomTableau[max]){
                index = -1;
                return index;
            }
            if (nomTableau[milieu] < nbAchercher){
                min = milieu + 1;
            }
            else if (nomTableau[milieu] > nbAchercher){
                max = milieu - 1;
            }
            else if (nomTableau[milieu] == nbAchercher){
                index = milieu;
                break;
            }
        }
        return index;
    }

    /**
     * Calcule la moyenne des notes d'un tableau.
     * @param nomTableau un tableau d'entier
     * @return un nombre flottant (la moyenne)
     */
    public static float tab(int[] nomTableau){
        float moyenne = 0;

        for (int i = 0; i < nomTableau.length; i++){
            System.out.println(nomTableau[i]);
            moyenne = moyenne + nomTableau[i];
        }
        return moyenne / nomTableau.length;
    }

    /**
     * Affiche le nombre le plus grand présent dans un tableau.
     * @param nomTableau un tableau d'entier
     * @return un nombre entier (le plus grand)
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
        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 3;
        scores[3] = 4;
        scores[4] = 5;
        scores[5] = 6;
        scores[6] = 7;

        System.out.println("La moyenne des notes du tableau est : " + tab(scores));
        System.out.println("Le plus grand nombre de ce tableau est : " + max(scores));
        System.out.println(inferieur10(scores));
        System.out.println("Le nombre cherché se trouve à l'index n°" + rechercheBinaire(scores, 7));
        countDownLoop(5);
        countDownRecursive(5);
    }
}
