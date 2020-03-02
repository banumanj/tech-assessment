package utilities.Api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApiConfig {
    private Properties properties;

    public ApiConfig() {
        properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("pet.properties");

        try{
            this.properties.load(inputStream);
        }catch (IOException e )
        {
            e.printStackTrace();
        }
    }
    public String getPropertyValue(String key){
        return  properties.getProperty(key);
    }
}
