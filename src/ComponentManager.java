import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;


public class ComponentManager {

    private static List<Component> components = new LinkedList<>();

    public static int addComponent(String description, BigDecimal price) {
        components.add(new Component(price, description, components.size()));
        return components.size() - 1;
    }

    public Component getComponent(int id) {
        return new Component(components.get(id));
    }
}