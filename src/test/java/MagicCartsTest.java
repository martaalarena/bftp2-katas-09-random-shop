import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MagicCartsTest {
    @Test
    void calculatePriceForMagicCards_red() {
      
        MagicCarts magicCarts = new MagicCarts();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        magicCarts.addProduct(product);

        assertThat(magicCarts.getTotalPrice(), equalTo(3.5));
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        MagicCarts magicCarts = new MagicCarts();
        

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        magicCarts.addProduct(product);

        assertThat(magicCarts.getTotalPrice(), equalTo(5.0));
    }

    
    @Test
    @DisplayName("Las cartas verdes cuestan 4.40 euros")
    void calculateGreenCardPrice() {
        MagicCarts magicCarts = new MagicCarts();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Green", null);

        magicCarts.addProduct(product);

        assertThat(magicCarts.getTotalPrice(), equalTo(4.4));
    }


    @Test
    @DisplayName("Las cartas negras cuestan 6.80 euros")
    void calculateBlackCardPrice() {
        MagicCarts magicCarts = new MagicCarts();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - black", null);

        magicCarts.addProduct(product);

        assertThat(magicCarts.getTotalPrice(), equalTo(6.8));
    }

    @Test
    @DisplayName("Las cartas marron cuestan 2 euros")
    void calculateBrownCardPrice() {
        MagicCarts magicCarts = new MagicCarts();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - brown", null);

        magicCarts.addProduct(product);

        assertThat(magicCarts.getTotalPrice(), equalTo(2.0));
    }

    @Test
    @DisplayName("Las cartas Black Lotus cuestan 2 euros")
    void calculateBlackLotusCardPrice() {
        MagicCarts magicCarts = new MagicCarts();

        Product product = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", null);

        magicCarts.addProduct(product);

        assertThat(magicCarts.getTotalPrice(), equalTo(40000.0));
    }

    @Test
    @DisplayName("Las cartas azules cuestan la mitad pasados 10 años")
    void calculateOldBlueCardPrice() {
        MagicCarts magicCarts = new MagicCarts();

        Product product = new Product(null, 11, false, "blue", null, "Magic: The Gathering - blue", null);

        magicCarts.addProduct(product);

        assertThat(magicCarts.getTotalPrice(), equalTo(2.5));
    }

    @Test
    @DisplayName("Las cartas rojas cuestan la mitad pasados 10 años")
    void calculateOldRedCardPrice() {
        MagicCarts magicCarts = new MagicCarts();

        Product product = new Product(null, 11, false, "red", null, "Magic: The Gathering - red", null);

        magicCarts.addProduct(product);

        assertThat(magicCarts.getTotalPrice(), equalTo(1.75));
    }

    
    @Test
    @DisplayName("Las cartas verdes cuestan 1 pasados 10 años")
    void calculateOldGreenCardPrice() {
        MagicCarts magicCarts = new MagicCarts();

        Product product = new Product(null, 11, false, "green", null, "Magic: The Gathering - green", null);

        magicCarts.addProduct(product);

        assertThat(magicCarts.getTotalPrice(), equalTo(1.0));
    }
}