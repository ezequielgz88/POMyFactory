package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    //Enlance "Create new account"
    @FindBy(how = How.CSS, using = "nav>div>ul>li:nth-child(1)>a")
    WebElement linkApplyFreelancer;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLinkApplyFreelancer() {
        linkApplyFreelancer.click();
    }

}
