import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;
import static com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
import static com.fasterxml.jackson.databind.DeserializationFeature.*;
import static com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
import static io.restassured.RestAssured.get;
import java.net.URL;
// import static io.restassured.RestAssured.get;




public class Main {

    public static void main(String[] args) throws JSONException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Flickr flickr = objectMapper.readValue(new URL("https://www.flickr.com/services/feeds/photos_public.gne?format=json&nojsoncallback=1"), Flickr.class);
        Items items = new Items();

        System.out.println(flickr.items.toString());


    }
}
