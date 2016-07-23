package au.com.shehacks.seven.seven;

import android.os.Bundle;

public class DashboardActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflateLayoutInContainer(R.layout.activity_dashboard);
    }
}
