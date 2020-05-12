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
import java.util.Set;

import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;
import static com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
import static com.fasterxml.jackson.databind.DeserializationFeature.*;
import static com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
import static io.restassured.RestAssured.get;
// import static io.restassured.RestAssured.get;




public class Main {

    public static void main(String[] args) throws JSONException, JsonProcessingException {
        String stringURL = "https://www.flickr.com/services/feeds/photos_public.gne?format=json&nojsoncallback=1";
        Response response = get(stringURL);
        JSONObject jsonResponse = new JSONObject(response.asString());

        String s1 = response.asString();

        ObjectMapper objectMapper = new ObjectMapper();
        Flickr flickr = new ObjectMapper().readValues( (JSONString)jsonResponse , Flickr.class);
        //objectMapper.readValue(s1, flickr) ;
        System.out.println(flickr.toString());


    }
}
