package au.com.shehacks.seven.seven;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;


/**
 * Created by hails on 23/07/16.
 */
public class RegisterChildActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflateLayoutInContainer(R.layout.activity_register_child);
    }

    public void createUser(View view){
        Intent intent = new Intent(this, CharitySelectionActivity.class);
        startActivity(intent);
    }
}
