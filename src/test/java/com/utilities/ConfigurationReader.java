package com.utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
public class ConfigurationReader {
    // ConfigurationReader class'ını projemizin heryerinden
    // nesne üretmeden, miras almadan kullanabileyi saglar.
    // static : program çalışır çalışmaz, bellekte yer tutmaya yarayan keyword
    static Properties properties;
    static {
        String path = "configuration.properties" ;
        try {  // bu işlemi DENE eğer hata alırsan, PROGRAMI DURDURMA
            FileInputStream file = new FileInputStream(path); // okumak istediğiniz dosyanın path(adres)'ini yazıyorsun
            properties = new Properties();
            // fileInputStream'dan ürettiğim file dosyası burada, bunu kullanabilirsin
            properties.load(file);
        } catch (Exception e) {
        }
    }
    public static String getProperty (String key){
        return properties.getProperty(key);
    }
}