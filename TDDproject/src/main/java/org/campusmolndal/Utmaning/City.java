package org.campusmolndal.Utmaning;

import org.json.JSONObject;
/**
 * This class represents a city.
 * It contains the name of the city, the temperature and the weather description.
 */
public class City {
    private String name;
    private double temp;

    private String WeatherDescription;

    public City(String name, double temp, String WeatherDescription) {
        this.name = name;
        this.temp = temp;
        this.WeatherDescription = WeatherDescription;
    }

    /**
     * This method returns the name of the city.
     * @return the name of the city
     */
    public String getName() {
        if (name == null) {
            return null;
        }
        return name;
    }

    /**
     * This method sets the name of the city.
     * @param name the name of the city
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the temperature of the city.
     * @return the temperature of the city
     */
    public double getTemp() {

        return temp;
    }

    /**
     * This method sets the temperature of the city.
     * @param temp the temperature of the city
     */
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    /**
     * This method returns the weather description of the city.
     * @return the weather description of the city
     */
    public String getWeatherDescription() {
        return WeatherDescription;
    }

    /**
     * This method sets the weather description of the city.
     * @param WeatherDescription the weather description of the city
     */
    public void setWeatherDescription(String WeatherDescription) {
        this.WeatherDescription = WeatherDescription;
    }


    /**
     * This method returns a string representation of the city.
     * @return a City object containing the city name, temperature and weather description from the JSON string
     */
    static City fromJson(String string){
        JSONObject jsonObject = new JSONObject(string);

        String name = jsonObject.getString("name");
        double temp = jsonObject.getJSONObject("main").getDouble("temp");
        String WeatherDescription = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");

        return new City(name, temp, WeatherDescription);
    }

}
