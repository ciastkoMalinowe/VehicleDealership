package VehicleDealership;

import java.math.BigDecimal;

public enum ModelType{
    modelA(new BigDecimal(100000.0)),
    modelB(new BigDecimal(2000000.0));

    private BigDecimal price;

    private ModelType(BigDecimal price){
        this.price = price;
    }

    BigDecimal getPrice(){
        return price;
    }
}
