import java.math.BigDecimal;

public class Product {

    public Integer numberOfLegs;
    public Integer age;
    public boolean isStinky;
    public String color;
    public BigDecimal basePrice;
    public String name;
    public BigDecimal sellPrice;

    public Product(Integer numberOfLegs, Integer age, boolean isStinky, String color, BigDecimal basePrice, String name, BigDecimal sellPrice) {
        this.numberOfLegs = numberOfLegs;
        this.age = age;
        this.isStinky = isStinky;
        this.color = color;
        this.basePrice = basePrice;
        this.name = name;
        this.sellPrice = sellPrice;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isStinky() {
        return isStinky;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }
}
