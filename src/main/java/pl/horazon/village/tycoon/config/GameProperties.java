package pl.horazon.village.tycoon.config;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;

public final class GameProperties {

    private static Configurations configs;
    private static Configuration imageConfig;
    private static Configuration gameConfig;

    private GameProperties() {
        // nothing to do here, SonarLint req
    }

    static {
        try {
            configs = new Configurations();
            imageConfig = configs.properties(new File("img.properties"));
            gameConfig = configs.properties(new File("game.properties"));
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static Configuration getImageConfig() {
        return imageConfig;
    }

    public static Configuration getGameConfig() {
        return gameConfig;
    }
}
