package pl.horazon.village.tycoon.ui.img;

import pl.horazon.village.tycoon.config.GameProperties;

import javax.imageio.ImageIO;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Images {

    public static BufferedImage getCastleImage() {
        String castle = GameProperties.getImageConfig().getString("img.castle");
        return getImage(castle);
    }

    private static BufferedImage getImage(String name) {
        BufferedImage image = new BufferedImage(1, 1, ColorSpace.TYPE_RGB);

        try {
            ClassLoader classLoader = Images.class.getClassLoader();
            File file = new File(classLoader.getResource(name).getFile());
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }
}
