package until;

import java.io.FileInputSteam;
import java.io.FileInputStream;
import java.io.IOException;
import java.until.Properties;

public class PropretyLoader {
    private static final Stroing PROP_FILE="src/test/resources/data.properties";

    public static String loadProperty(String name) {
        String value = "";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(PROR_FILE));
        }catch (IOException e) {
            e.printStackTrace();
        }
        if (name != null) {
            value = prop.getProperty(name);
        }
        return value;
    }
}
