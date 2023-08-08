package testCases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.SearchResultsPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchResultsPageTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("web+driver.chrome .driver", "\"C:\\Users\\Lori\\Desktop\\chromedriver.exe\"");
        driver = new ChromeDriver ();
    }

    @AfterEach
    public void tearDown() {
        driver.quit ();
    }


    @Test
    public void testProductSearch() {
        BasePage homePage = new BasePage (driver);
        homePage.open();

        String productName = "Laptop"; // Replace with the desired product name
        SearchResultsPage searchResultsPage = homePage.searchForProduct(productName);

        assertTrue( ((pages.SearchResultsPage) searchResultsPage).isProductDisplayed(productName), "Product is displayed in search results.");
    }
}
