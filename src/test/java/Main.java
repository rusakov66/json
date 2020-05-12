import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JSONException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Flickr flickr = objectMapper.readValue(new URL("https://www.flickr.com/services/feeds/photos_public.gne?format=json&nojsoncallback=1"), Flickr.class);
        //Items items = new Items();

        System.out.println(flickr.toString());
        System.out.println(flickr.items.toString());


    }
}
