package au.com.shehacks.seven.seven.models;

import android.view.animation.TranslateAnimation;
/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */
public class SlideAnimation extends TranslateAnimation {

    public float entranceStartX;
    public float entranceStartY;

    public SlideAnimation(float fromXDelta, float toXDelta, float fromYDelta, float toYDelta) {
        super(fromXDelta, toXDelta, fromYDelta, toYDelta);
        setDuration(1300); // duration in ms
        setFillAfter(true);
        entranceStartX = fromXDelta;
        entranceStartY = fromYDelta;
    }
}