package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductDisplayed(String productName) {
        List<WebElement> productResults = driver.findElements( By.cssSelector(".product-result"));
        for (WebElement productResult : productResults) {
            if (productResult.getText().contains(productName)) {
                return true;
            }
        }
        return false;
    }
}
