package au.com.shehacks.seven.seven;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import au.com.shehacks.seven.seven.views.cells.ProfileThumbnailView;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */
public class UserSelectionActivity extends AppCompatActivity {
    ProfileThumbnailView childOne;
    ProfileThumbnailView childTwo;
    ProfileThumbnailView childThree;
    Button leaderboardButton;

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
        leaderboardButton = (Button) findViewById(R.id.submit_button);
        leaderboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LeaderboardActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupChildren() {
        childOne.setUsernameAndImage("Jessica", getResources().getDrawable(R.drawable.sprout));
        childTwo.setUsernameAndImage("Tom", getResources().getDrawable(R.drawable.sprout));
        childThree.setUsernameAndImage("Make New", getResources().getDrawable(R.drawable.add_child));
    }

    public void newChild(View view){
        Intent intent = new Intent(this, RegisterChildActivity.class);
        startActivity(intent);
    }
}
