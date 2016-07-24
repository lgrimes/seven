package au.com.shehacks.seven.seven;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CharitySelectionActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflateLayoutInContainer(R.layout.activity_charity_selection);
    }

    public void popUp(){
        findViewById(R.id.popUpImage).setVisible(true);
    }

}
