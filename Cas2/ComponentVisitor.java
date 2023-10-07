package Cas2;

public interface ComponentVisitor {
    public void visit(CPU cpu);

    public void visit(Memory memory);
}