package iness.esi;

/**
 * Created by Iness on 6/8/2018.
 */

//Chaque bouton (les boutons d'appel dans les couloirs et les boutons de numéro d’étage dans les ascenseurs)

public class Button {
//  mis à « True » lorsqu'un utilisateur appuie sur le bouton
//  mis à « False » par les ascenseurs lorsque la demande correspondante est traitée.
    public boolean drapeau;
}

//  dans le couloire (de l’étage).
class BoutonsDAppel extends Button{
    public void haut(Utilisateur utilisateur) {
        System.out.println("U" + utilisateur.numero +" appuie sur Haut");
    }
    public void bas(Utilisateur utilisateur) {
        System.out.println("U" + utilisateur.numero +" appuie sur Bas");
    }
//    public void appelerUnAscenseur() {}
}

//  à l’intérieur de l’ascenseur
class BoutonsDeNuméroDEtage extends Button{
    public void choisirLEtageDeDestination(Utilisateur utilisateur, int numeroDeBouton, Ascenseur ascenseur) {
        System.out.println("U" + utilisateur.numero +" appuie sur A" + ascenseur.numero + "B" + numeroDeBouton);
    }
}