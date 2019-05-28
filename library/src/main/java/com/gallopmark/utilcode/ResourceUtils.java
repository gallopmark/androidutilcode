package com.gallopmark.utilcode;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.ArrayRes;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;

public class ResourceUtils {
    /*
     * 如果getDimension()返回结果是20.5f，那么getDimensionPixelSize()返回结果就是21，getDimensionPixelOffset()返回结果就是20。
     * */
    public static float getDimension(@DimenRes int id) {
        return AndroidUtilCode.getApp().getResources().getDimension(id);
    }

    /*将getDimension结果转换为int，并且小数部分四舍五入*/
    public static int getDimensionPixelSize(@DimenRes int id) {
        return AndroidUtilCode.getApp().getResources().getDimensionPixelSize(id);
    }

    /*直接截断小数位，即取整其实就是把float强制转化为int，注意不是四舍五入*/
    public static int getDimensionPixelOffset(@DimenRes int id) {
        return AndroidUtilCode.getApp().getResources().getDimensionPixelOffset(id);
    }

    public static int[] getIntArray(@ArrayRes int id) {
        return AndroidUtilCode.getApp().getResources().getIntArray(id);
    }

    public static String getString(@StringRes int id) {
        return AndroidUtilCode.getApp().getString(id);
    }

    public static String getString(@StringRes int id, Object... formatArgs) {
        return AndroidUtilCode.getApp().getString(id, formatArgs);
    }

    public static String[] getStringArray(@ArrayRes int id) {
        return AndroidUtilCode.getApp().getResources().getStringArray(id);
    }

    public static int getColor(@ColorRes int id) {
        return ContextCompat.getColor(AndroidUtilCode.getApp(), id);
    }

    public static ColorStateList getColorStateList(@ColorRes int id) {
        return ContextCompat.getColorStateList(AndroidUtilCode.getApp(), id);
    }

    public static Drawable getDrawable(@DrawableRes int id) {
        return ContextCompat.getDrawable(AndroidUtilCode.getApp(), id);
    }
}
