import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;

import java.time.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws JSONException, IOException {

        File resourcesDir = new File(Config.getProperty(Config.RESOURCES_DIR));
        if (resourcesDir.isDirectory()) System.out.println("Directory " + resourcesDir + " exists");
        else resourcesDir.mkdir();

        int num = 21;
        Scanner scanner = new Scanner(System.in);
        while ((num > 20) || (num < 1)) {
            System.out.println("How many items do you need? (up to 20 from 1)");
            num = scanner.nextInt();
        }
        System.out.println("Please, enter tags: (<Enter> with empty string - end of input)");
        String tag = "";
        String tag1 = "!";

        while (!tag1.equals("")) {
            Scanner scanner2 = new Scanner(System.in);
            tag1 = scanner2.nextLine();
            tag = tag + "," + tag1;
        }
        System.out.println();
        tag = (tag.substring(0, tag.length() - 1)); // remove last comma
        if (!tag.equals("")) tag = (tag.substring(1, tag.length())); // remove first comma
        if (!tag.equals("")) tag = "&tags=" + tag;

        String stringURL = Config.getProperty(Config.RESOURCES_URL);
        System.out.println(tag);
        System.out.println(stringURL);
        ObjectMapper objectMapper = new ObjectMapper();
        Flickr flickr = objectMapper.readValue(new URL(stringURL+tag), Flickr.class);
        String dir = Config.getProperty(Config.RESOURCES_DIR) + LocalDate.now().toString() + "\\";
        System.out.println(dir);

        File dirF = new File(dir);
        if (dirF.isDirectory()) System.out.println("Directory " + dirF + " exists");
        else dirF.mkdir();
        for (int i = 0; i < num; i++) {
            String path = flickr.items.get(i).toString();
            System.out.println(path);
            String name = path.substring(path.length() - 28, path.length());
            System.out.println(name);
            URL url2 = new URL(path);
            BufferedImage img = ImageIO.read(url2);
            File file = new File(dir + name);
            ImageIO.write(img, "jpg", file);
            System.out.println(flickr.items.get(i).getAuthor());

        }
    }
}