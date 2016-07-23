package au.com.shehacks.seven.seven.managers;

import android.content.Context;
import android.content.Intent;
import au.com.shehacks.seven.seven.DashboardActivity;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */
public class IntentManager {

    public static Intent dashboard(Context context) {
        Intent paymentIntent = new Intent(context , DashboardActivity.class);
        return paymentIntent;
    }
}
