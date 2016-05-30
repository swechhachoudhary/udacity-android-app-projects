package com.example.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by swechha on 5/26/16.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here
        JSONArray weatherJsonArr = new JSONArray(weatherJsonStr);
        JSONObject weatherJsonObj = weatherJsonArr.getJSONObject(dayIndex);
        JSONObject jsonObject = weatherJsonObj.getJSONArray("list").getJSONObject(0).getJSONObject("temp");
        double maxTemp = jsonObject.getDouble("max");
        return maxTemp;
    }
}
