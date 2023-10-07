package Cas3;

public class Nombre extends Expression {
    int valeur;

    Nombre(int v) {
        valeur = v;
    }

    @Override
    public int accepter(Visiteur visiteur) {
        return visiteur.visiter(this);
    }

    public int getValeur() {
        return valeur;
    }
}
