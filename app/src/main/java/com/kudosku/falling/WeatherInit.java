package com.kudosku.falling;

public class WeatherInit {
    String lat;
    String ion;
    Float temperature;
    String weather;
    String cloudy;
    String city;

    public void setLat(String lat){ this.lat = lat;}
    public void setIon(String ion){ this.ion = ion;}
    public void setTemperature(Float t){ this.temperature = t;}
    public void setWeather(String weather){ this.weather = weather;}
    public void setCloudy(String cloudy){ this.cloudy = cloudy;}
    public void setCity(String city){ this.city = city;}

    public String getLat(){ return lat;}
    public String getIon() { return ion;}
    public String getWeather(){ return weather;}
    public Float getTemprature() { return temperature;}
    public String getCloudy() { return cloudy; }
    public String getCity() { return city; }
}