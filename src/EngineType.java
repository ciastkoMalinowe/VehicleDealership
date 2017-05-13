import java.math.BigDecimal;

enum EngineType{
    petrol_1_0(new BigDecimal(150000.0), "1.0 petrol"),
    petrol_1_2(new BigDecimal(20000.0), "1.2 petrol"),
    petrol_1_4(new BigDecimal(250000.0), "1.4 petrol"),
    petrol_1_6(new BigDecimal(300000.0), "1.6 petrol"),
    diesel_1_6(new BigDecimal(450000.0), "1.6 diesel"),
    diesel_1_9(new BigDecimal(600000.0), "1.9 diesel");

    private BigDecimal price;
    private String name;

    private EngineType(BigDecimal price, String name){
        this.price = price;
        this.name = name;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

}
