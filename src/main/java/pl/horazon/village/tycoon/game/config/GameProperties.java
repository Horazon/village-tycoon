package pl.horazon.village.tycoon.game.config;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;

public final class GameProperties {

    private static Configurations configs;
    private static Configuration imageConfig;

    private GameProperties() {
        // nothing to do here, SonarLint req
    }

    static {
        try {
            configs = new Configurations();
            imageConfig = configs.properties(new File("img.properties"));
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static Configuration getImageConfig() {
        return imageConfig;
    }
}
