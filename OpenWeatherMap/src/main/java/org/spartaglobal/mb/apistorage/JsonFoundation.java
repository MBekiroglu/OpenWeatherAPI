package org.spartaglobal.mb.apistorage;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonFoundation {
    private Coord coord;
    @JsonProperty("weather")
    private ArrayList<Weather> weather = null;
    private String base;
    private StorageMain main;
    private int visibility;
    private Wind wind;
    private HashMap<String, Integer> clouds;
    private HashMap<String, Float> rain;
    private HashMap<String, Float> snow;
    private long dt;
    private Sys sys;
    private int timezone;
    private long id;
    private String name;
    private int cod;


    public JsonFoundation() {
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("weather")
    public ArrayList<Weather> getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public StorageMain getMain() {
        return main;
    }

    public void setMain(StorageMain main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public HashMap<String, Integer> getClouds() {
        return clouds;
    }

    public void setClouds(HashMap<String, Integer> clouds) {
        this.clouds = clouds;
    }

    public HashMap<String, Float> getRain() {
        return rain;
    }

    public void setRain(HashMap<String, Float> rain) {
        this.rain = rain;
    }

    public HashMap<String, Float> getSnow() {
        return snow;
    }

    public void setSnow(HashMap<String, Float> snow) {
        this.snow = snow;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
