package au.com.shehacks.seven.seven.views.images;

import android.content.Context;
import android.util.AttributeSet;

import au.com.shehacks.seven.seven.R;

/**
 * Created by lauren grimes on 1/07/2016.
 */
public class LargeThumbnailImageView extends RoundedImageView {

    public LargeThumbnailImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setupBackground();
    }

    public LargeThumbnailImageView(Context context) {
        super(context);
        setupBackground();
    }

    @Override
    public void setupBackground() {
        setBackground(getResources().getDrawable(R.drawable.bg_light_grey_rounded_outline_large));
    }
}
