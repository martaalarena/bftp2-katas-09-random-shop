import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PetsTest {
    
    @Test
    @DisplayName("los animales terrestres cuestan 4.2 por pata")
    void calculateLandAnimalPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, null, null, "perro", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(16.8));
    }

    @Test
    @DisplayName("los peces azules cuestan 0.1")
    void calculateBlueFishPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(10.0), "BlueNemo", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(10.1));
    }

    @Test
    @DisplayName("los peces dorados cuestan 100")
    void calculateGoldFishPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "gold", BigDecimal.valueOf(10.0), "goldNemo", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(1000.0));
    }

    @Test
    @DisplayName("cualquier otro pez cuesta el precio base")
    void calculateRandomFishPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", BigDecimal.valueOf(10.0), "randomNemo", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(10.0));
    }
}
