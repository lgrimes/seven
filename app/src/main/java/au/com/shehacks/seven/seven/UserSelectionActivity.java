package au.com.shehacks.seven.seven;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import au.com.shehacks.seven.seven.views.images.ProfileThumbnailView;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */
public class UserSelectionActivity extends AppCompatActivity {
    ProfileThumbnailView childOne;
    ProfileThumbnailView childTwo;
    ProfileThumbnailView childThree;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_selection);
        setupViews();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setupChildren();
    }

    private void setupViews() {
        childOne = (ProfileThumbnailView) findViewById(R.id.child_one);
        childTwo = (ProfileThumbnailView) findViewById(R.id.child_two);
        childThree = (ProfileThumbnailView) findViewById(R.id.child_three);
    }

    private void setupChildren() {
        childOne.setUsernameAndImage("Jessica", getResources().getDrawable(R.drawable.sprout));
        childTwo.setUsernameAndImage("Tom", getResources().getDrawable(R.drawable.sprout));
        childThree.setUsernameAndImage("Ashleigh", getResources().getDrawable(R.drawable.sprout));
    }
}
