package iness.esi;

/**
 * Created by Iness on 6/8/2018.
 */
public class Ascenseur {

    public static int numero$ = 0;
    public int numero = 0;

    public BoutonsDeNuméroDEtage boutonsDeNuméroDEtage;

    public int numeroDEtageActuel;

    public boolean portesSontOuvertes;

    //  Vers le haut 1 ou vers le bas 0
    public boolean directionDeMouvement;

    public Ascenseur() {
        this.boutonsDeNuméroDEtage = new BoutonsDeNuméroDEtage();
        this.numero = this.numero$++;
    }

    //    A# dans E# s’ouvre
//    A# dans E# se ferme
//    A# se déplace vers le haut jusqu'à E#
//    A# se déplace vers le bas jusqu'à E#
    public void ouvrirportes(Etage etage) {
        if(!this.portesSontOuvertes)
            System.out.println("A" + this.numero + " dans E" + etage.numero + " s’ouvre");
        this.portesSontOuvertes = true;
    }

    public void fermerPortes(Etage etage) {
        if(this.portesSontOuvertes)
            System.out.println("A" + this.numero + " dans E" + etage.numero + " se ferme");
        this.portesSontOuvertes = false;
    }

    // Un ascenseur peut se déplacer uniquement si ses portes sont fermées
    public void descendreDUnEtage(Etage etage) {
        if(this.portesSontOuvertes){
            System.out.println("erreur: vous voulez descendre sans fermer la porte");
            return;
        }
        System.out.println("A" + this.numero + " se déplace vers le bas jusqu'à E" + etage.numero);
    }

    public void monterDUnEtage(Etage etage) {
        if(this.portesSontOuvertes){
            System.out.println("erreur: vous voulez monter d'un etage sans fermer la porte");
            return;
        }
        System.out.println("A" + this.numero + " se déplace vers le haut jusqu'à E" + etage.numero);
    }
}
