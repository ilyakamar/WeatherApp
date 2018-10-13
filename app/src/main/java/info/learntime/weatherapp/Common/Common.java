package info.learntime.weatherapp.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {


    // api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=85390e4c99d7889014fdcc8ac27d8183
    // 1-  api.openweathermap.org/data/2.5/
//    public static final String APP_ID = "ac12ef0cbf4386188f2c4fe1158e7cef";
    // try
    public static final String APP_ID = "85390e4c99d7889014fdcc8ac27d8183";
    public static Location current_location = null;

    public static String  convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);
        return formatted;
    }
}
