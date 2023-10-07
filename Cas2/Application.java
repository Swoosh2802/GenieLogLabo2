package Cas2;

public class Application {
    public static void main(String[] args) {
        Component cpu = new CPU();
        cpu.accept(new ComponentValidateVisitor());

        Component memory = new Memory();
        memory.accept(new ComponentValidateVisitor());

        System.out.println(memory.getPrice());
    }
}
