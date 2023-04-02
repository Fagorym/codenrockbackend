package hackhaton.codenrock.server.utils;


import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

public class ImageWorker {
    public String getImageFromResource(String imageName) {
        try (InputStream stream = this.getClass().getClassLoader().getResourceAsStream("images" + imageName)) {
            if (stream != null) {
                return Base64.getEncoder().encodeToString(stream.readAllBytes());
            }
        } catch (IOException e) {
            return null;
        }
        return null;
    }
}
