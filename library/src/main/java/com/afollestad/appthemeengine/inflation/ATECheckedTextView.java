package com.afollestad.appthemeengine.inflation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

import com.afollestad.appthemeengine.ATE;
import com.afollestad.appthemeengine.ATEActivity;

/**
 * @author Aidan Follestad (afollestad)
 */
class ATECheckedTextView extends CheckedTextView implements ViewInterface {

    public ATECheckedTextView(Context context) {
        super(context);
        init(context, null);
    }

    public ATECheckedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, null);
    }

    public ATECheckedTextView(Context context, AttributeSet attrs, @Nullable ATEActivity keyContext) {
        super(context, attrs);
        init(context, keyContext);
    }

    private void init(Context context, @Nullable ATEActivity keyContext) {
        setTag("tint_accent_color,text_primary");
        ATEViewUtil.init(keyContext, this, context);
    }

    public void setKey(String key) {
        ATE.apply(getContext(), this, key);
    }

    @Override
    public boolean setsStatusBarColor() {
        return false;
    }

    @Override
    public boolean setsToolbarColor() {
        return false;
    }
}