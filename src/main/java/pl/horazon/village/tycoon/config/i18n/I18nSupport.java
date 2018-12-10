package pl.horazon.village.tycoon.config.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nSupport {

    private static final ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("Messages", Locale.getDefault());
    }

    public static String getTxtForKey(String key) {
        return bundle.getString(key);
    }
}
