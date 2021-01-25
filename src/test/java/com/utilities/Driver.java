package com.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;
public class Driver {
    // Eğer bir class'tan NESNE ÜRETİLMESİNİ İSTEMİYORSANIZ
    // constructor'ı private yapabilirsiniz (Singleton Class)
    private Driver(){}
    static WebDriver driver; // WebDriver nesnemizi, static olarak oluşturduk, çünkü program başlar başlamaz
    // hafızada yer almasını istiyoruz.
    public  static WebDriver getDriver() {
        // Eğer driver nesnesi hafızada boşsa, oluşturulmamışsa yeniden oluşturmana gerek yok.
        // Eğer null ise, yeniden oluşturabilirsin.
        // Sadece ilk çağırıldığında bir tane nesne üret, sonraki çağırmalarda var olan nesnesi kullan.
        if (driver == null) {
            switch (ConfigurationReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case  "opera" :
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        return driver;
    }
    public static void closeDriver(){
        if(driver != null){
            driver.quit(); // driver'i kapat
            driver = null; // driver'i hafizadan temizle
        }
    }
}