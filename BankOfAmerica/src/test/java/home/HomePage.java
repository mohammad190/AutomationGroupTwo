package home;

import base.CommonAPI;
import dropDownList.Banking;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    @Test
    public void Test_Checking() throws InterruptedException {
        Banking banking = PageFactory.initElements(driver, Banking.class);
        banking.Checking();
    }
}
