package au.com.shehacks.seven.seven;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


/**
 * Created by hails on 23/07/16.
 */
public class RegisterChildActivity extends BaseActivity {

    public static final String TAG = RegisterChildActivity.class.getSimpleName();

    Button createButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflateLayoutInContainer(R.layout.activity_register_child);
        setViews();
    }

    private void setViews() {
        createButton = (Button) findViewById(R.id.createChild);

    }

    public void onCreateChildPressed(View view){
        Log.d(TAG, "pressed");
        Intent intent = new Intent(this, CharitySelectionActivity.class);
        startActivity(intent);
    }
}
