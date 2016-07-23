package au.com.shehacks.seven.seven.views.cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import au.com.shehacks.seven.seven.R;
import au.com.shehacks.seven.seven.models.SlideAnimation;
import au.com.shehacks.seven.seven.views.images.SmallThumbnailImageView;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */

public class LeaderboardCell extends RelativeLayout {

    TextView nameTextView;
    SmallThumbnailImageView profileImage;

    public LeaderboardCell(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.view_leaderboard_entry, this, true);
        setViews();
    }

    public LeaderboardCell(Context context) {
        super(context);
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.view_leaderboard_entry, this, true);
        setViews();
    }

    private void setViews() {
        nameTextView = (TextView) findViewById(R.id.name_text);
        profileImage = (SmallThumbnailImageView) findViewById(R.id.profileImage);
    }

    public void setDetails(String username, Drawable image) {
        nameTextView.setText(username);
        profileImage.setImageDrawable(image);
    }

    public void animateProgress(float progressPercentage, float screenwidth) {
        profileImage.startAnimation(new SlideAnimation(profileImage.getX(), screenwidth * progressPercentage,profileImage.getY(), profileImage.getY()));
    }
}
