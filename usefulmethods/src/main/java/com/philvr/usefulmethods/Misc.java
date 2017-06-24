package com.philvr.usefulmethods;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * @author Philip Van Raalte
 * @date June 24, 2017
 */

public class Misc {
    /**
     * Converts device-independent pixels to pixels.
     *
     * @param dp device-independent pixels
     * @param resource use getResources()
     * @return pixels
     */
    public float dpToPixels(float dp, Resources resource){
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 14, resource.getDisplayMetrics());
    }

    public String getStringFromPreferences(Context context, String key){
        SharedPreferences prefs = context.getSharedPreferences("name", Context.MODE_PRIVATE);
        return prefs.getString(key, "");
    }

    public void saveStringToPreferences(Context context, String key, String value){
        SharedPreferences prefs = context.getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.commit();
    }
}
