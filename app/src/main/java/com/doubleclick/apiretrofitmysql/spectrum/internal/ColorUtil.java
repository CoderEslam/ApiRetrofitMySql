package com.doubleclick.apiretrofitmysql.spectrum.internal;


import android.graphics.Color;

import androidx.annotation.ColorInt;

public final class ColorUtil {
    private ColorUtil() {
        //Util class
    }

    public static boolean isColorDark(@ColorInt int color) {
        double brightness = Color.red(color) * 0.299 +
                Color.green(color) * 0.587 +
                Color.blue(color) * 0.114;
        return brightness < 160;
    }

    @ColorInt public static int getRippleColor(@ColorInt int color) {
        float[] hsv = new float[3];
        Color.colorToHSV(color, hsv);
        hsv[2] = hsv[2] * 0.5f;
        return Color.HSVToColor(hsv);
    }

}
