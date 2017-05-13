import java.math.BigDecimal;
import java.util.Collection;

class Vehicle {

    private ModelType model;
    private EngineType engine;
    private Collection<Component> components;

    public BigDecimal getPrice(){

        BigDecimal price = new BigDecimal(0.0);
        price.add(model.getPrice());
        price.add(engine.getPrice());
        for(Component component : components){
            price.add(component.getPrice());
        }
        return price;
    }

    public String getDescription(){
        String description = "Configured vehicle of " + model.name() + " with " + engine.getName() + " engine and ";
        for(Component component : components){
            description += component.getDescription() + ", ";
        }
        description += ".";
        return description;
    }
}

