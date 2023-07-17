package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {
    public static void main(String[] args) throws InterruptedException {

            // ALIŞTIRMA : 4

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //  Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");


        //  Under the ORIGINAL CONTENTS click on Alerts
        driver.findElement(By.id("alerts")).click();

        //  print the URL
        System.out.println(driver.getCurrentUrl());

        //  navigate back
        driver.navigate().back();

        //  print the URL
        System.out.println(driver.getCurrentUrl());

        //  Click on Basic Ajax
        driver.findElement(By.xpath("//*[@id='basicajax']")).click();

        //  print the URL
        System.out.println(driver.getCurrentUrl());

        //  enter value 20 and ENTER
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);

        //  and then verify Submitted Values is displayed open page
        String expectedResult="Submitted Values";
        String actualResult=driver.findElement(By.xpath("//*[text()='Submitted Values']")).getText();
        if (expectedResult.equals(actualResult)){
            System.out.println("Test Başarılı");
        }else {
            System.out.println("Test Başarısız");
        }

        //  close driver
        driver.close();

/*


        // Alıştırma - 4

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://testpages.herokuapp.com/styled/index.html web sitesine gidin
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(2000);


        // ORİJİNAL İÇERİKLER altında Uyarılar'a tıklayın
        driver.findElement(By.xpath("//a[@id='alerts']")).click();
        Thread.sleep(2000);

        // URL'yi yazdır
        System.out.print("Alerts Sayfanın url'i : ");
        System.out.println(driver.getCurrentUrl());

        // geri git
        driver.navigate().back();
        Thread.sleep(2000);

        // URL'yi yazdır
        System.out.print("Giriş Sayfanın URL'i : ");
        System.out.println(driver.getCurrentUrl());

        // Temel Ajax'a tıklayın
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();

        // URL'yi yazdır
        System.out.print("Ajax sayfanın URL'i : ");
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        // 20 değerini girin ve ENTER
        WebElement bosluk = driver.findElement(By.id("lteq30"));
        bosluk.click();
        bosluk.sendKeys("20");
        bosluk.submit();
        Thread.sleep(2000);

        // ve ardından Gönderilen Değerlerin görüntülendiğini doğrulayın açık sayfa
        String goruntulenenSayfa = driver.findElement(By.linkText("https://testpages.herokuapp.com/form_processor.php?ajax=1")).getText();
        if (goruntulenenSayfa.equals("Submitted Values")){
            System.out.println("SAYFA GÖRÜNTÜLENİYOR PASSED");
        }else System.out.println("SAYFA GÖRÜNTÜLENEMİYOR TEST FAİLD");

        // sürücüyü kapat
        Thread.sleep(2000);
        driver.close();

        */





    }
}
