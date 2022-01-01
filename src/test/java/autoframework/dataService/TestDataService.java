package autoframework.dataService;

import java.io.FileInputStream;
import java.util.Properties;

public class TestDataService {
    //read xpath from file properties
    //as storage of project
    public static Properties properties;

    public static void setProperties(String relativeFilePath) {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + relativeFilePath);
            properties.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("tesst: " +properties.getProperty("emailLogin"));
    }

}
