package VehicleDealership;

import java.math.BigDecimal;
import java.util.HashSet;

public class Vehicle {

    private ModelType model;
    private EngineType engine;
    private HashSet<Component> components;

    Vehicle(ModelType model, EngineType engine){

        this.model = model;
        this.engine = engine;
        this.components = new HashSet<>();
    }

    void addComponent( Component component){
        if(!components.contains(component))
            components.add(component);
    }

    int getComponentsNumber(){
        return components.size();
    }

    public BigDecimal getPrice(){

        BigDecimal price = new BigDecimal(0.0);
        price = price.add(model.getPrice());
        price = price.add(engine.getPrice());
        for(Component component : components){
            price = price.add(component.getPrice());
        }
        return price;
    }

    public String getDescription(){
        StringBuilder description = new StringBuilder("Configured vehicle of " + model.name() + " with " + engine.getName() + " engine and ");
        for(Component component : components){
            description.append(component.getDescription()).append(", ");
        }
        description.append(".");
        return description.toString();
    }
}

