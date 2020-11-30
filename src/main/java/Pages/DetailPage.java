package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class DetailPage {
    @FindBy(css = "#wp-tabs-container div[data-attrid*='poslednyaya_versiya'] .LrzXr.kno-fv")
    private WebElement LastVersion;

    @FindBy(css = "#wp-tabs-container div[data-attrid*='licenziya'] .LrzXr.kno-fv")
    private WebElement License;

    @FindBy(css = "#wp-tabs-container h2[data-attrid*='title'] .LrzXr.kno-fv")
    private WebElement name;

    public DetailPage(WebDriver driver) {
        initElements(driver, this);
    }

    public String getLastVersion () {
        return LastVersion.getText();
    }

    public String getname () {
        return name.getText();
    }

    public String getLicense() {
        return License.getText();
    }
}
