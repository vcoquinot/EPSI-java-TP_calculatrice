package fr.purplegiraffe;

import fr.purplegiraffe.NE_PAS_TOUCHER.ConsoleReader;

public class Application {
    public void fonctionPrincipale() {

        int longueur = ConsoleReader.readInt("Quelle taile de carré souhaitez-vous ?");
        int largeur = longueur;

        if(longueur == 0)
        {
            System.out.println("Votre saisie doit être supérieure à 0");
        }else{
            for (int numCol = 0; numCol < longueur-1; numCol++) {
                System.out.print("* ");
            }
               for (int numLigne = 0; numLigne < longueur-1; numLigne++) {
                System.out.println("*");
                }

                    for (int numCol = 0; numCol < longueur; numCol++) {
                System.out.print("* ");
                    }
        }

    }
}