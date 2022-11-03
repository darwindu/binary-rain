package org.game.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * tools for properties.
 * @author darwindu
 * @date 2019/5/28
 */
public final class PropertyUtils {

    private static final String PROP_NAME = "openSource.properties";
    private static Properties prop = new Properties();

    static {
        try {
            loadProperties(PROP_NAME);
        } catch (RuntimeException e) {
            //log.error("[PropertyUtils] Load properties file failed.", e);
            System.out.println("[PropertyUtils] Load properties file failed.");
            e.printStackTrace();
        }
    }

    /**
     * load properties from specific config file.
     *
     * @param filePath properties config file.
     */
    private static void loadProperties(String filePath) {

        try {
            InputStream in = PropertyUtils.class.getClassLoader().getResourceAsStream(filePath);
            prop.load(in);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * get property value by specific key.
     *
     * @param key property key
     */
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    /**
     * get property value by specific key.
     *
     * @param key property key
     */
    public static String getProperty(String key, String defaultValue) {
        return prop.getProperty(key, defaultValue);
    }
}
