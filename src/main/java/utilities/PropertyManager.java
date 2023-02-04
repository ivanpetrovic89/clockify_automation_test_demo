package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static PropertyManager instance;
    private String startUrl, validEmail, validPassword, testTime;

    public static PropertyManager getInstance(){
        if(instance == null){
            instance = new PropertyManager();
            instance.loadData();
        }
        return instance;
    }

    private void loadData() {
        Properties properties = new Properties();
        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);
        } catch (IOException e) {
            e.printStackTrace();
        }
        startUrl = properties.getProperty("startUrl");
        validEmail = properties.getProperty("validEmail");
        validPassword = properties.getProperty("validPassword");
        testTime = properties.getProperty("testTime");
    }

    public String getStartUrl() {
        return startUrl;
    }

    public String getValidEmail() {
        return validEmail;
    }

    public String getValidPassword() {
        return validPassword;
    }

    public String getTestTime() {
        return testTime;
    }
}
