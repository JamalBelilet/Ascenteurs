package iness.esi;

/**
 * Created by Iness on 6/8/2018.
 */
public class Etage {
    public static int numero$ = 0;
    public int numero = 0;

    public BoutonsDAppel boutonsDAppel;

    public Etage() {
        this.boutonsDAppel = new BoutonsDAppel();
        this.numero = this.numero$++;
    }
}
