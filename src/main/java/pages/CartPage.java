package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartContents() {
        return driver.findElement(By.cssSelector(".cart")).getText();
    }
}
