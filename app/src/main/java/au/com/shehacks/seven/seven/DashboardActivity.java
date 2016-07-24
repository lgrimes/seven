package au.com.shehacks.seven.seven;

import android.os.Bundle;
import android.widget.RelativeLayout;

import au.com.shehacks.seven.seven.views.cells.PastDonationView;

public class DashboardActivity extends BaseActivity {

    PastDonationView donationOne;
    PastDonationView donationTwo;
    PastDonationView donationThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflateLayoutInContainer(R.layout.activity_dashboard);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
