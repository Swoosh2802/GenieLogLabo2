package Cas1;

import java.util.ArrayList;
import java.util.List;

public class AdditionnalCard implements Component {
    List<Component> components = new ArrayList<Component>();

    @Override
    public double getPrice() {
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
