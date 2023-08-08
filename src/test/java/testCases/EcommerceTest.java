package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.BasePage;
import pages.ProductPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EcommerceTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("web+driver.chrome .driver", "\"C:\\Users\\Lori\\Desktop\\chromedriver.exe\"");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.quit ();
    }


    @Test
    public void testAddToCart() {
        BasePage homePage = new BasePage (driver);
        homePage.open();

        ProductPage productPage = homePage.clickProduct();
        productPage.addToCart();

        CartPage cartPage = new CartPage(driver);
        String cartContents = cartPage.getCartContents();

        assertTrue(cartContents.contains("Product Name"), "Product added to cart successfully!");
    }
}
