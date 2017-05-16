import VehicleDealership.*;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Somas3k on 15.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        ComponentManager componentManager = new ComponentManager();
        componentManager.addComponent("Podgrzewana kierownica",new BigDecimal(300));
        componentManager.addComponent("Podgrzewane fotele", new BigDecimal(800));
        componentManager.addComponent("15\" felgi aluminiowe", new BigDecimal(1000));
        componentManager.addComponent("16\" felgi aluminiowe", new BigDecimal(1500));
        componentManager.addComponent("17\" felgi aluminiowe", new BigDecimal(2000));
        componentManager.addComponent("Swiatla ledowe", new BigDecimal(10000));

        Scanner reader = new Scanner(System.in);

        System.out.println("Witaj w konfiguratorze samochodow naszego salonu");
        System.out.println("Wybierz model: ");
        System.out.println("1. ModelA");
        System.out.println("2. ModelB");
        System.out.print("Podaj numer modelu:");
        int modelType = reader.nextInt();
        System.out.println();
        System.out.println("Wybierz silnik:");
        System.out.print("1. Benzyna 1.0\n2. Benzyna 1.2\n3. Benzyna 1.4\n4. Benzyna 1.6\n5. Diesel 1.6\n6. Diesel 1.9\n");
        System.out.print("Podaj numer wersji silnikowej: ");
        int engineType = reader.nextInt();
        System.out.println(engineType);
        ModelType model;
        if(modelType == 1){
            model = ModelType.modelA;
        }
        else model = ModelType.modelB;
        EngineType engine = null;
        switch (engineType){
            case 1: engine = EngineType.petrol_1_0; break;
            case 2: engine = EngineType.petrol_1_2; break;
            case 3: engine = EngineType.petrol_1_4; break;
            case 4: engine = EngineType.petrol_1_6; break;
            case 5: engine = EngineType.diesel_1_6; break;
            case 6: engine = EngineType.diesel_1_9; break;
        }


        VehicleBuilder vehicleBuilder = new VehicleBuilder(engine, model);
        boolean isEnd = false;
        int opt;
        int id;
        Vehicle vehicle = null;
        while(!isEnd){
            System.out.println("1. Dodaj komponent");
            System.out.println("2. Zakoncz konfiguracje");
            System.out.print("Wprowadz opcje: ");
            opt = reader.nextInt();
            System.out.println();
            if(opt == 1 ){
                componentManager.printComponents();
                System.out.print("Podaj numer komponentu:");
                id = reader.nextInt();
                System.out.println();
                vehicleBuilder.addComponent(componentManager.getComponent(id));
            }
            else{
                vehicle = vehicleBuilder.getVehicle();

                if( vehicle != null){
                    isEnd = true;
                }
                else{
                    System.out.println("Za mala ilosc komponentow, wymagane 2");
                }
            }
        }

        System.out.println("Twoj skonfigurowany pojazd: ");
        System.out.println(vehicle.getDescription());
        System.out.println("Cena " + vehicle.getPrice());






    }
}
