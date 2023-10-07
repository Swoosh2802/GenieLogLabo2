package Cas2;

public class CPU implements Component {

    @Override
    public double getPrice() {
        return 300.0;
    }

    @Override
    public void accept(ComponentVisitor componentVisitor) {
        componentVisitor.visit(this);
    }
}
