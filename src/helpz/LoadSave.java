package helpz;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class LoadSave {

    public static BufferedImage getSpriteAtlas() {
        BufferedImage img = null;

        // Pegar diretório absoluto
        // String resPath = System.getProperty("user.dir") + "/res/spriteatlas.png";
        // try {
        // img = ImageIO.read(new File(resPath));
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        InputStream is = LoadSave.class.getClassLoader().getResourceAsStream("spriteatlas.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // InputStream is = getClass().getResourceAsStream("/res/spriteatlas.png");
        // // System.out.println("Caminho absoluto do arquivo: " +
        // // getClass().getResource("/res/spriteatlas.png").getPath());
        // try {
        // img = ImageIO.read(is);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        return img;
    }

}
