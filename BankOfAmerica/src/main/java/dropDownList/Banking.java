package dropDownList;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class Banking extends CommonAPI {

    public static Actions action = new Actions(driver);

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[1]/a")
    WebElement List_Banking_Button;

    @FindBy(how = How.NAME, using = "checking_")
    WebElement List_Banking_Checking;

    @FindBy(how = How.ID, using = "zipCodeModalInputField")
    WebElement Banking_Checking_ZipCode;

    @FindBy(how = How.ID, using = "go-button-zip-modal")
    WebElement Banking_Checking_Go;

    @FindBy(how = How.NAME, using = "savings")
    WebElement List_Banking_Savings;

    @FindBy(how = How.NAME, using = "cds")
    WebElement List_Banking_CDs;

    @FindBy(how = How.NAME, using = "business_checking")
    WebElement List_Banking_Business_Checking;

    @FindBy(how = How.NAME, using = "l2_banking_student_banking")
    WebElement List_Banking_Student_Banking;

    @FindBy(how = How.NAME, using = "online_banking")
    WebElement List_Banking_Online_Banking;

    @FindBy(how = How.NAME, using = "mobile_banking")
    WebElement List_Banking_Mobile_Banking;

    @FindBy(how = How.NAME, using = "12_banking_more_products")
    WebElement List_Banking_More_Products;

    @FindBy(how = How.NAME, using = "preferred_rewards_")
    WebElement List_Banking_Preferred_Rewards;

    @FindBy(how = How.NAME, using = "explore_popular_features")
    WebElement List_Banking_Explore_Popular_Features;

    public void Checking() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = List_Banking_Button;
        action.moveToElement(element).perform();
        Thread.sleep(2000);
        List_Banking_Checking.click();
        Banking_Checking_ZipCode.sendKeys("11373");
        Banking_Checking_Go.click();
        Thread.sleep(2000);
    }

    public void Savings() {}

    public void CDs() {}

    public void Business_Checking() {}

    public void Student_Banking() {}

    public void Online_Banking() {}

    public void Mobile_Banking() {}

    public void More_Products() {}

    public void Preferred_Rewards() {}

    public void Explore_Popular_Features() {}
}
