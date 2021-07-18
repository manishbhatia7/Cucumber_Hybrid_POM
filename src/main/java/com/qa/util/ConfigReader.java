package com.qa.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader {
    private Properties prop;
    public Properties init_prop()
    {
        prop=new Properties();
        try
        {
            FileInputStream fis=new FileInputStream("C:\\Users\\manis\\IdeaProjects\\Cucumber\\src\\test\\resources\\config\\config.properties");
            prop.load(fis);

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();

        }

        catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
