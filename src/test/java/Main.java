import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws JSONException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Flickr flickr = objectMapper.readValue(new URL("https://www.flickr.com/services/feeds/photos_public.gne?format=json&nojsoncallback=1"), Flickr.class);
        for (int i = 0; i < flickr.items.size(); i++) {
            String path = flickr.items.get(i).toString();
            System.out.println(path);
            String name = path.replace("https://live.staticflickr.com/65535/", "");
            System.out.println(name);
            URL url2 = new URL(path);
            BufferedImage img = ImageIO.read(url2);
            File file = new File("C:\\Users\\irusakov\\IdeaProjects\\json\\src\\resources\\" + name);
            ImageIO.write(img, "jpg", file);

        }

    }
}
