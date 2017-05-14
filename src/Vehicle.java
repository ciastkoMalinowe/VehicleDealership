import java.math.BigDecimal;
import java.util.Collection.HashSet;

class Vehicle {

    private ModelType model;
    private EngineType engine;
    private HashSet<Component> components;

    Vehicle(ModelType model, EngineType engine){

        this.model = model;
        this.engine = engine;
        this.components = new HashSet<Component>;
    }

    void addComponent( Component component){
        if(!components.contains(component))
            components.add(component);
    }

    void int getComponentsNumber(){
        return components.size();
    }

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

