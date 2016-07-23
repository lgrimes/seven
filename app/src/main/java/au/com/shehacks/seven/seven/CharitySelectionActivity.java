package au.com.shehacks.seven.seven;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by hails on 23/07/16.
 */
public class CharitySelectionActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflateLayoutInContainer(R.layout.activity_charity_selection);
    }

    public void selectCharity(View view){
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }
}
