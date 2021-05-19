package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

    static Properties prop;
    static FileInputStream input;
   // static String fileName = "config.properties";
    static String fileLocation = "src/test/TestData/config.properties";

    public String getProperty(String keyName) {


        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation );
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(keyName);
    }

}
