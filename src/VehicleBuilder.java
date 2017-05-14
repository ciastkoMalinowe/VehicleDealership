public class VehicleBuilder{

    private Vehicle vehicle;

    public VehicleBuilder( EngineType engin, ModelType model){
        vehicle = new Vehicle(ModelType model, EngineType engine);
    }

    public void addComponent(Component component){
        vehicle.addComponent(component);
    }

    public boolean canBeBuild(){
        if( vehicle.getComponentsNumber() >= 2)
            return true;
        return false;
    }

    public Vehicle getVehicle(){
        if(canBeBuild())
            return vehicle;
        return null;
    }
}