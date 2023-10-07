package Cas3;

public class Plus extends Expression {
    Expression droite;
    Expression gauche;

    Plus(Expression g, Expression d) {
        gauche = g;
        droite = d;
    }

    @Override
    public int accepter(Visiteur visiteur) {
        return visiteur.visiter(this);
    }

    public Expression getDroite() {
        return droite;
    }

    public Expression getGauche() {
        return gauche;
    }
}
