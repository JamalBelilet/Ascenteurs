package iness.esi;

//  Vous devez utiliser les moniteurs pour synchroniser l’exécution des threads.
public class Main {
    class ConfigurationInitial  {
        static final int NOMBRE_D_ETAGES = 14;
        static final int NOMBRE_D_ASCENSEURS = 4;
        static final int NOMBRE_TOTAL_DES_UTILISATEURS = 31;
        static final int NOMBRE_MAXIMUM_D_UTILISATEUR_PAR_ASCENSEUR = 15;
    }


//  Sur la base des paramètres donnés (ConfigurationInitial)
//  Un stockage approprié doit être attribué
//  Et les threads des ascenseurs et des utilisateurs doivent être démarrés.
    public static void main(String[] args) {
//      On suppose que les conditions initiales sont les suivantes:
//        tous les ascenseurs commencent au premier étage
//        ils sont vides
//        les portes sont fermées
//        aucun bouton n’est appuyé
//        aucun utilisateur ne se trouve dans le système

        Utilisateur u0 = new Utilisateur();
        Utilisateur u1 = new Utilisateur();
        Etage etage = new Etage();
        etage.boutonsDAppel.haut(u0);
        etage.boutonsDAppel.haut(u1);
    }
}


//  Un fichier d'entrée contient des triplets de nombres représentant un trajet en ascenseur pour une personne comme suit:
//    <Numéro de l’utilisateur, Etage de départ, Etage de destination>