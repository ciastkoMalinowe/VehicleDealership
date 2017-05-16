package VehicleDealership;

import java.math.BigDecimal;

public class Component {

    private final BigDecimal price;
    private final String description;
    private final Integer id;

    public Component(BigDecimal price, String description, Integer id){
        this.price = price;
        this.description = description;
        this.id = id;
    }

    public Component(Component old) {
        this(old.getPrice(), old.getDescription(), old.getId());
    }

    public BigDecimal getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public Integer getId(){
        return id;
    }

    @Override
    public boolean equals(Object other){

        if (other == null || getClass() != other.getClass())
            return false;
        Component o = (Component) other;
        return  this.price.equals( o.getPrice())
                && this.description.equals(o.getDescription())
                && this.id.equals(o.getId());
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }
}
