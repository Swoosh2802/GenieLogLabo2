package Cas3;

public class Evaluateur implements Visiteur {
    @Override
    public int visiter(Nombre nombre) {
        return nombre.getValeur();
    }

    @Override
    public int visiter(Plus plus) {
        return plus.getGauche().accepter(this) + plus.getDroite().accepter(this);
    }

    @Override
    public int visiter(Moins moins) {
        return moins.getGauche().accepter(this) - moins.getDroite().accepter(this);
    }

    @Override
    public int visiter(Fois fois) {
        return fois.getGauche().accepter(this) * fois.getDroite().accepter(this);
    }
}
