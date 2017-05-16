package VehicleDealership;

public class VehicleBuilder{

    private Vehicle vehicle;

    public VehicleBuilder( EngineType engine, ModelType model){
        vehicle = new Vehicle(model, engine);
    }

    public void addComponent(Component component){
        vehicle.addComponent(component);
    }

    public boolean canBeBuild(){
        return vehicle.getComponentsNumber() >= 2;
    }

    public Vehicle getVehicle(){
        if(canBeBuild())
            return vehicle;
        return null;
    }
}