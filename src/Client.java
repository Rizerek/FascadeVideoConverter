import java.io.File;
import fascade.VideoConversionFascade;

public class Client {
    public static void main(String[] args) {
        VideoConversionFascade converter = new VideoConversionFascade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
