package Cas1;

public class Application {
    public static void main(String[] args) {
        ComponentBuyer componentBuyer = new ComponentBuyer();
        AdditionnalCard additionnalCard = new AdditionnalCard();
        additionnalCard.addComponent(new CPU());
        additionnalCard.addComponent(new Memory());
        componentBuyer.addComponent(new CPU());
        componentBuyer.addComponent(additionnalCard);
        System.out.println(componentBuyer.getTotalPrice());
    }
}
