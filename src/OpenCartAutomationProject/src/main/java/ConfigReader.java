import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
    private Properties prop;
    @BeforeSuite
    /**
     * This Method is used to load the properties from config.properties file
     *
     * @return prop
     */
    public Properties init_prop() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Ashish.Eerapuram\\IdeaProjects\\OpenCartAutomationProject\\src\\main\\resources\\config.properties");
            try {
                prop.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //DriverFactory driverfactory = new DriverFactory();
        //driverfactory.init_driver(prop.getProperty("browser"));
        return prop;
    }

    public String getReportConfigPath(){
        String reportConfigPath = prop.getProperty("reportconfigpath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

}