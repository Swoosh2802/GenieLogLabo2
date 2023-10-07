package Cas3;

public class Application {

    public static void main(String[] args) {
        Expression expression = new Plus(new Nombre(5), new Fois(new Nombre(10), new Nombre(3)));
        Visiteur evaluateur = new Evaluateur();
        int resultat = expression.accepter(evaluateur);
        System.out.println("Résultat : " + resultat);
    }

}
