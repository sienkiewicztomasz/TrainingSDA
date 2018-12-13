package pl.sda.jSoup;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ChuckNorrisJokes {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++) {

            chuckJoke();
        }


    }

    private static void chuckJoke() throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("https://api.chucknorris.io/jokes/random");
        CloseableHttpResponse response = httpclient.execute(httpget);
        InputStream content = response.getEntity().getContent();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader(content));
        JsonObject rootobj = root.getAsJsonObject();
        String joke = rootobj.get("value").getAsString();

        System.out.println(joke);
    }

}
