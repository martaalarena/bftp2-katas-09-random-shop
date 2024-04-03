import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class GourmetProduct {
    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);


        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(100.0));
    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(50.0));
    }

    @Test
    void calculatePriceForWhiteWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 2, false, null, null, "la viuda de angelón", null);


        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(40.0));
    }
}
