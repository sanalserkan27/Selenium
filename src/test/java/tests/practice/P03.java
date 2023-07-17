package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) throws InterruptedException {


        // Alıştırma3...

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://testpages.herokuapp.com/styled/index.html adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(2000);

        // Mikro Uygulamalar altında Hesaplayıcı'ya tıklayın
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();

        // İlk girişe herhangi bir sayı yazın
        WebElement ilkGiris = driver.findElement(By.xpath("//input[@id='number1']"));
        ilkGiris.sendKeys("28");
        Thread.sleep(2000);

        // İkinci girişe herhangi bir sayı yazın
        WebElement ikinciGiris= driver.findElement(By.xpath("//input[@id='number2']"));
        ikinciGiris.sendKeys("4");
        Thread.sleep(2000);

        // Hesapla'ya tıklayın
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        // Sonucu al
        String sonuc = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        Thread.sleep(2000);

        // Sonucu yazdır
        System.out.println("Konsolda cıkan sonuc: " + sonuc );

        driver.close();



    }
}
