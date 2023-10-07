package Cas2;

public interface Component {
    double getPrice();

    public void accept(ComponentVisitor componentVisitor);
}
