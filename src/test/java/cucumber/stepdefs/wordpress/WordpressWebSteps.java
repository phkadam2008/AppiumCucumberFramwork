package cucumber.stepdefs.wordpress;

import com.core.managers.DriverManager;
import com.mobile.appium.AppiumManager;
import cucumber.api.java8.En;
import cucumber.stepdefs.BaseStepDefinition;
import org.testng.Assert;

/**
 * Created by pritamkadam on 17/09/16.
 */
public class WordpressWebSteps extends BaseStepDefinition implements En {

        public WordpressWebSteps(){

            Given("^I am on Wordpress landing page$", () -> {

                getDriver().get("http://www.wordpress.com");

//                Assert.assertEquals("WordPress.com: Create a free website or blog", driver.getTitle());

            });

        }
}
