import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MagicCarts {
     private final List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getTotalPrice() {
        return products.stream()
                .map(this::calculatePriceCarts)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    public BigDecimal calculatePriceCarts(Product product) {
        if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            if (product.getColor() != null && (product.getAge() != null && product.getAge() > 10)) {
                return switch (product.getColor()) {
                    case "blue" -> BigDecimal.valueOf(2.5);
                    case "red" -> BigDecimal.valueOf(1.75);
                    default -> BigDecimal.valueOf(1.0);
                };
            } return switch (product.getColor()) {
                    case "blue" -> BigDecimal.valueOf(5.0);
                    case "red" -> BigDecimal.valueOf(3.5);
                    case "green" -> BigDecimal.valueOf(4.40);
                    case "black" -> BigDecimal.valueOf(6.80);
                    default -> BigDecimal.valueOf(2.0);
                };
            

        }
        return product.getSellPrice();
    }

}
