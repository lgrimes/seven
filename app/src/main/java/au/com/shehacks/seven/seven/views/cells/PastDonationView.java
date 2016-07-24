package au.com.shehacks.seven.seven.views.cells;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import au.com.shehacks.seven.seven.R;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 24/07/2016
 * Contact: lauren@pwcventures.com
 */
public class PastDonationView extends RelativeLayout {

    TextView donationName;
    TextView charityName;
    TextView date;

    public PastDonationView(Context context) {
        super(context);
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.view_record_history, this, true);
        setViews();
    }

    public PastDonationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.view_record_history, this, true);
        setViews();
    }

    private void setViews() {
        donationName = (TextView) findViewById(R.id.day_title);
        charityName = (TextView) findViewById(R.id.date_title);
        date = (TextView) findViewById(R.id.amount_title);
    }

    public void setDetails(String charityName, String description, String dateString) {
        donationName.setText(description);
        this.charityName.setText(charityName);
        date.setText(dateString);
    }
}
