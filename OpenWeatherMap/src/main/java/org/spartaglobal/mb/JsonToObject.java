package org.spartaglobal.mb;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.spartaglobal.mb.apistorage.DataTransferObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;


public class JsonToObject {
    private ObjectMapper ob = new ObjectMapper();
    private Properties apiKey = new Properties();
    private String baseUrl = "http://api.openweathermap.org/data/2.5/weather?";


    public DataTransferObject byCityName(String city) {

        try (InputStream inputStream = new FileInputStream("src/main/java/Resources/key.properties")) {
            apiKey.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataTransferObject dataTransferObject = null;
        try {
            dataTransferObject = ob.readValue(new URL(baseUrl + "q=" + city + "&appid=" + apiKey.getProperty("apiKey")), DataTransferObject.class);
            //String value = baseUrl + "q=" + city + "&appid=" + apiKey.getProperty("Api Key");
            //System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataTransferObject;
    }

    public DataTransferObject byCityName(String city, String state) {
        try (InputStream inputStream = new FileInputStream("src/main/java/Resources/key.properties")) {
            apiKey.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataTransferObject dataTransferObject = null;
        try {
            dataTransferObject = ob.readValue(new URL(baseUrl + "q=" + city + "," + state + "&appid=" + apiKey.getProperty("apiKey")), DataTransferObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataTransferObject;
    }

    public DataTransferObject byCityName(String city, String state, int countryCode) {
        try (InputStream inputStream = new FileInputStream("src/main/java/Resources/key.properties")) {
            apiKey.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataTransferObject dataTransferObject = null;
        try {
            dataTransferObject = ob.readValue(new URL(baseUrl + "q=" + city + "," + state + "," + countryCode + "&appid=" + apiKey.getProperty("apiKey")), DataTransferObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataTransferObject;
    }

    public DataTransferObject byCityID(long id) {
        try (InputStream inputStream = new FileInputStream("src/main/java/Resources/key.properties")) {
            apiKey.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataTransferObject dataTransferObject = null;
        try {
            dataTransferObject = ob.readValue(new URL(baseUrl + "id=" + id + "&appid=" + apiKey.getProperty("apiKey")), DataTransferObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataTransferObject;
    }

    public DataTransferObject byGeographicalCoordinates(double latitude, double longitude) {
        try (InputStream inputStream = new FileInputStream("src/main/java/Resources/key.properties")) {
            apiKey.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataTransferObject dataTransferObject = null;
        try {
            dataTransferObject = ob.readValue(new URL(baseUrl + "lat=" + latitude + "&lon=" + longitude + "&appid=" + apiKey.getProperty("apiKey")), DataTransferObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataTransferObject;
    }

    public DataTransferObject byZIPCode(long zipCode, String countryCode) {
        try (InputStream inputStream = new FileInputStream("src/main/java/Resources/key.properties")) {
            apiKey.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataTransferObject dataTransferObject = null;
        try {
            dataTransferObject = ob.readValue(new URL(baseUrl + "zip=" + zipCode + "," + countryCode + "&appid=" + apiKey.getProperty("apiKey")), DataTransferObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataTransferObject;
    }
}
