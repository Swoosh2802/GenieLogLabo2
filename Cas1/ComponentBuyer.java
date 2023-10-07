package Cas1;

import java.util.ArrayList;
import java.util.List;

public class ComponentBuyer {
    List<Component> components = new ArrayList<Component>();

    public double getTotalPrice() {
        double total = 0.0;
        for (Component c : components) {
            total += c.getPrice();
        }
        return total;
    }

    public void addComponent(Component c) {
        components.add(c);
    }
}
