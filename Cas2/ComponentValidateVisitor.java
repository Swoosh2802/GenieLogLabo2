package Cas2;

public class ComponentValidateVisitor implements ComponentVisitor {

    @Override
    public void visit(CPU cpu) {
        System.out.println("vérification d'un CPU.");
    }

    @Override
    public void visit(Memory mouse) {
        System.out.println("vérification de la mémoire.");
    }
}