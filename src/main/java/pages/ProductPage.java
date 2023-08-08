package pages;



    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class ProductPage {
        private WebDriver driver;

        public ProductPage(WebDriver driver) {
            this.driver = driver;
        }

        public void addToCart() {
            WebElement addToCartButton = driver.findElement(By.cssSelector(".add-to-cart"));
            addToCartButton.click();
        }
    }

