package pl.sda.cat;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;


public class CatsFromWebPage {

    public static void main(String[] args) throws Exception {

        for (int i = 1; i < 11; i++) {

            String imageUrl = catFoto();
            String fileExtension = imageUrl.substring((imageUrl.lastIndexOf(".")));
            String catImage = "cat" + i + fileExtension;
            saveImage(imageUrl, catImage);
            readFileInfo(catImage);

        }

    }


    private static void readFileInfo(String catImage) throws IOException {
        BufferedImage fileInfo = ImageIO.read(new File(catImage));
        int width = fileInfo.getWidth();
        int height = fileInfo.getHeight();
        File catFile = new File(catImage);
        long kilobytes = catFile.length() / 1024;
        System.out.println("Rozdzielczość pliku: " + width + "x" + height);
        System.out.println("Rozmiar pliku to: " + kilobytes + " kilobytes");
    }


    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
        URL url = new URL(imageUrl);
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destinationFile);

        byte[] b = new byte[2048];
        int length;

        while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }

    private static String catFoto() throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("https://aws.random.cat/meow");
        CloseableHttpResponse response = httpclient.execute(httpget);
        InputStream content = response.getEntity().getContent();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader(content));
        JsonObject rootobj = root.getAsJsonObject();
        String cat = rootobj.get("file").getAsString();
        System.out.println(cat);

        return cat;

    }


}
