import java.io.File;
import java.io.InputStream;
import java.util.Properties;

public class Config
{
    public static final String RESOURCES_DIR = "resourcesDir";
    public static final String RESOURCES_URL = "flickrUrl";

    private static Properties properties = new Properties();
    public synchronized static String getProperty(String name) {
        File rf = new File("1.txt");
        if (rf.isDirectory()) System.out.println("Directory " + rf + " exists");

        if(properties.isEmpty()) {
            try (InputStream is = Config.class.getClassLoader()
                    .getResourceAsStream("config.properties")) {
                properties.load(is);
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
        return properties.getProperty(name);
    }
}
