package iness.esi;

/**
 * Created by Iness on 6/8/2018.
 */
public class Utilisateur {
    public static int numero$ = 0;
    public int numero = 0;
    public int numeroDEtageActuel = 0;

    public Utilisateur() {
        this.numero = this.numero$++;
    }

    //  Les utilisateurs peuvent appuyer sur les boutons d'appel d' ascenseur
    //    dans un étage donné,
    //      seulement quand ils sont dans cet étage à l'extérieur des ascenseurs.

    //  Les utilisateurs peuvent appuyer sur les boutons de sélection d’étage d'unascenseur,
    //    seulement lorsqu'ils sont dans cet ascenseur.


    // Les utilisateurs ne peuvent entrer ou sortir d'un ascenseur que si les portes sont ouvertes
    public void entrerDansUnAscenseur(Ascenseur ascenseur, int numeroDeLEtage) {
        if(!ascenseur.portesSontOuvertes) {
            System.out.println("error: vous voulez entrer dans l'ascenseur sans ouvrir la porte");
            return;
        }
        System.out.println("U" + this.numero +" entre dans A" + ascenseur.numero + " dans l’étage E" + numeroDeLEtage);
    }
    public void sortirDUnAscenseur(Ascenseur ascenseur, int numeroDeLEtage) {
        if(!ascenseur.portesSontOuvertes) {
            System.out.println("error: vous voulez sortir de l'ascenseur sans ouvrir la porte");
            return;
        }
        System.out.println("U" + this.numero +" sort de" + ascenseur.numero + " à l’étage E" + numeroDeLEtage);
    }
}

//
//
//
//        U# entre dans A# dans l’étage E#
//        U# sort de A# à l’étage E#
