package Cas2;

public class Memory implements Component {

    @Override
    public double getPrice() {
        return 140.0;
    }

    @Override
    public void accept(ComponentVisitor componentVisitor) {
        componentVisitor.visit(this);
    }
}
