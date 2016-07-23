package au.com.shehacks.seven.seven.views.images;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au.com.shehacks.seven.seven.R;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */
public class ProfileThumbnailView extends RelativeLayout {

    TextView usernameText;
    LargeThumbnailImageView imageView;

    public ProfileThumbnailView(Context context) {
        super(context);
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.view_profile_thumbnail_title, this, true);
        setViews();
    }

    public ProfileThumbnailView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.view_profile_thumbnail_title, this, true);
        setViews();
    }

    private void setViews() {
        usernameText = (TextView) findViewById(R.id.name_text);
        imageView = (LargeThumbnailImageView) findViewById(R.id.profileImage);
    }

    public void setUsernameAndImage(String name, Drawable image) {
        usernameText.setText(name);
        imageView.setImageDrawable(image);
    }
}
