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

    //// Checking ////
    @FindBy(how = How.NAME, using = "checking_")
    WebElement List_Banking_Checking;

    @FindBy(how = How.ID, using = "zipCodeModalInputField")
    WebElement Banking_Checking_ZipCode;

    @FindBy(how = How.ID, using = "go-button-zip-modal")
    WebElement Banking_Checking_Go;

    //// Savings ////
    @FindBy(how = How.NAME, using = "savings")
    WebElement List_Banking_Savings;

    //// CDs ////
    @FindBy(how = How.NAME, using = "cds")
    WebElement List_Banking_CDs;

    //// Business Checking ////
    @FindBy(how = How.NAME, using = "business_checking")
    WebElement List_Banking_Business_Checking;

    //// Student Banking ////
    @FindBy(how = How.NAME, using = "l2_banking_student_banking")
    WebElement List_Banking_Student_Banking;

    //// Online Banking ////
    @FindBy(how = How.NAME, using = "online_banking")
    WebElement List_Banking_Online_Banking;

    //// Mobile Banking ////
    @FindBy(how = How.NAME, using = "mobile_banking")
    WebElement List_Banking_Mobile_Banking;

    //// More Products ////
    @FindBy(how = How.NAME, using = "12_banking_more_products")
    WebElement List_Banking_More_Products;

    //// Preferred Rewards ////
    @FindBy(how = How.NAME, using = "preferred_rewards_")
    WebElement List_Banking_Preferred_Rewards;

    //// Explore Popular Features ////
    @FindBy(how = How.NAME, using = "explore_popular_features")
    WebElement List_Banking_Explore_Popular_Features;

    public void Banking_Button() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = List_Banking_Button;
        action.moveToElement(element).perform();
        Thread.sleep(2000);
    }

    public void Checking() throws InterruptedException {
        Banking_Button();
        List_Banking_Checking.click();
        Banking_Checking_ZipCode.sendKeys("11373");
        Banking_Checking_Go.click();
        Thread.sleep(2000);
    }

    public void Savings() throws InterruptedException {
        Banking_Button();
        List_Banking_Savings.click();
        Thread.sleep(2000);
    }

    public void CDs() throws InterruptedException {
        Banking_Button();
        List_Banking_CDs.click();
        Thread.sleep(2000);
    }

    public void Business_Checking() throws InterruptedException {
        Banking_Button();
        List_Banking_Business_Checking.click();
        Thread.sleep(2000);
    }

    public void Student_Banking() throws InterruptedException {
        Banking_Button();
        List_Banking_Student_Banking.click();
        Thread.sleep(2000);
    }

    public void Online_Banking() throws InterruptedException {
        Banking_Button();
        List_Banking_Online_Banking.click();
        Thread.sleep(2000);
    }

    public void Mobile_Banking() throws InterruptedException {
        Banking_Button();
        List_Banking_Mobile_Banking.click();
        Thread.sleep(2000);
    }

    public void More_Products() throws InterruptedException {
        Banking_Button();
        List_Banking_More_Products.click();
        Thread.sleep(2000);
    }

    public void Preferred_Rewards() throws InterruptedException {
        Banking_Button();
        List_Banking_Preferred_Rewards.click();
        Thread.sleep(2000);
    }

    public void Explore_Popular_Features() throws InterruptedException {
        Banking_Button();
        List_Banking_Explore_Popular_Features.click();
        Thread.sleep(2000);
    }
}
