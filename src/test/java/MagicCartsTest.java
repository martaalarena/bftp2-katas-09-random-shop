import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MagicCartsTest {
    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(3.5));
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(5.0));
    }

    
    @Test
    @DisplayName("Las cartas verdes cuestan 4.40 euros")
    void calculateGreenCardPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Green", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(4.4));
    }


    @Test
    @DisplayName("Las cartas negras cuestan 6.80 euros")
    void calculateBlackCardPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - black", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(6.8));
    }

    @Test
    @DisplayName("Las cartas marron cuestan 2 euros")
    void calculateBrownCardPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - brown", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(2.0));
    }

    @Test
    @DisplayName("Las cartas Black Lotus cuestan 2 euros")
    void calculateBlackLotusCardPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(40000.0));
    }

    // @Test
    // @DisplayName("Las cartas azules cuestan la mitad pasados 10 años")
    // void calculateOldBlueCardPrice() {
    //     ShoppingCart shoppingCart = new ShoppingCart();

    //     Product product = new Product(null, 11, false, "red", null, "Magic: The Gathering - blue", null);

    //     shoppingCart.addProduct(product);

    //     assertThat(shoppingCart.getTotalPrice(), equalTo(2.5));
    // }


}