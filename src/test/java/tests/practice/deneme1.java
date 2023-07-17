package tests.practice;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class deneme1  extends TestBaseQuit{


    @Test
    public void Test01(){

        //1. “https://demoqa.com/webtables” sayfasina gidin
        //2. Headers da bulunan basliklari yazdirin
        //3. 3.sutunun basligini yazdirin
        //4. Tablodaki tum datalari yazdirin
        //5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        //6. Tablodaki satir sayisini yazdirin
        //7. Tablodaki sutun sayisini yazdirin
        //8. Tablodaki 3.kolonu yazdirin
        //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun
        //    sayisini girdigimde bana datayi yazdirsin


       // 1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
       // 2. "Hover over Me First" kutusunun ustune gelin
        WebElement hoverMeFirst=driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverMeFirst).perform();
       // 3. "Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[text()='Link 1'])[1]")).click();

       // 4. Popup mesajini yazdirin
       String yazi= driver.switchTo().alert().getText();
        System.out.println(yazi);
        // 5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
       // 6. "Click and hold" kutusuna basili tutun
        WebElement clickAndHold=driver.findElement(By.xpath("//p[text()='Click and Hold!']"));
        actions.contextClick(clickAndHold);
       // 7. "Click and hold" kutusunda cikan yaziyi yazdirin
        WebElement cikanYazi=driver.findElement(By.id("click-box"));
        String cikanyazi1= cikanYazi.getText();
        System.out.println(cikanyazi1);
       // 8. "Double click me" butonunu cift tiklayin
        WebElement doublel=driver.findElement(By.xpath("//h2[text()='Double Click Me!']"));
        actions.doubleClick(doublel);





    }


}















