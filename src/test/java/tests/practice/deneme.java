package tests.practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class deneme extends TestBaseQuit{

    @Test
    public void Test01(){


        driver.get("https://amazon.com");
        String amazonHandle=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.wisequarter.com");
        String wiseHandle=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.youtube.com");
        String youtubeHandle=driver.getWindowHandle();

        driver.switchTo().window(amazonHandle);
        String expectedUrl="amazon";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


        driver.switchTo().window(wiseHandle);
        String expectedTittle="wise";
        String actualTittle=driver.getTitle();
        Assert.assertTrue(actualTittle.contains(expectedTittle));

        driver.switchTo().window(youtubeHandle);
        String aexpectedUrl="youtube";
        String aactualUrl=driver.getCurrentUrl();
        Assert.assertTrue(aactualUrl.contains(aexpectedUrl));

    }
    }
