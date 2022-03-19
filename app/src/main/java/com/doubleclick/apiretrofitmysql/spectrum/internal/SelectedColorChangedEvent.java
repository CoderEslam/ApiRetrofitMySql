package com.doubleclick.apiretrofitmysql.spectrum.internal;


import androidx.annotation.ColorInt;

public class SelectedColorChangedEvent {

    private @ColorInt
    int mSelectedColor;

    public SelectedColorChangedEvent(@ColorInt int color) {
        mSelectedColor = color;
    }

    public @ColorInt int getSelectedColor() {
        return mSelectedColor;
    }
}
