package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class BasePage {
        private WebDriver driver;

        public BasePage(WebDriver driver) {
            this.driver = driver;
        }

        public void open() {
            driver.get("https://ecommerce-playground.lambdatest.io/");
        }

        public ProductPage clickProduct() {
            WebElement product = driver.findElement(By.cssSelector(".product"));
            product.click();
            return new ProductPage(driver);
        }


    public SearchResultsPage searchForProduct(String productName) {
        WebElement searchInput = driver.findElement(By.cssSelector(".search-input"));
        searchInput.sendKeys(productName);
        searchInput.sendKeys( Keys.ENTER);
        return new SearchResultsPage(driver);
    }
}
