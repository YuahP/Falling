package com.kudosku.falling;

public class WeatherInit {
    Double lat;
    Double ion;
    Double temperature;
    String weather;
    int cloudy;
    int snow;
    int rain;
    String city;

    public void setLat(Double lat){ this.lat = lat;}
    public void setLon(Double ion){ this.ion = ion;}
    public void setTemperature(Double t){ this.temperature = t;}
    public void setWeather(String weather){ this.weather = weather;}
    public void setCloudy(int cloudy){ this.cloudy = cloudy;}
    public void setSnow(int snow){ this.snow = snow;}
    public void setRain(int rain){ this.rain = rain;}
    public void setCity(String city){ this.city = city;}

    public Double getLat(){ return ion;}
    public Double getIon() { return ion;}
    public String getWeather(){ return weather;}
    public Double getTemperature() { return temperature;}
    public int getCloudy() { return cloudy; }
    public int getSnow() { return snow; }
    public int getRain() { return rain; }
    public String getCity() { return city; }
}
