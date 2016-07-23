package au.com.shehacks.seven.seven;

import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.TextView;
import au.com.shehacks.seven.seven.views.cells.LeaderboardCell;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */

public class LeaderboardActivity extends AppCompatActivity {
    LeaderboardCell childOneCell;
    LeaderboardCell childTwoCell;
    LeaderboardCell childThreeCell;
    TextView closeButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
        setViews();
    }

    private void setViews() {
        childOneCell = (LeaderboardCell) findViewById(R.id.child_one);
        childTwoCell = (LeaderboardCell) findViewById(R.id.child_two);
        childThreeCell = (LeaderboardCell) findViewById(R.id.child_three);
        closeButton = (TextView) findViewById(R.id.close_button);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        childOneCell.animateProgress((float) .25, size.x);
        childTwoCell.animateProgress((float) .65, size.x);
        childThreeCell.animateProgress((float) .40, size.x);
    }
}
