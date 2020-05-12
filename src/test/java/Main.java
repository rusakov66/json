import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws JSONException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Flickr flickr = objectMapper.readValue(new URL("https://www.flickr.com/services/feeds/photos_public.gne?format=json&nojsoncallback=1"), Flickr.class);

        for (int i=0; i<flickr.items.size();i++) {
            System.out.println(flickr.items.get(i).toString());
        }

    }
}
