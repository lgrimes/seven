package au.com.shehacks.seven.seven;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

/**
 * Created by hails on 23/07/16.
 */
public class EducationActivity extends BaseActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflateLayoutInContainer(R.layout.activity_education);
    }

    public void pick(View view){
        Intent intent = new Intent(getApplicationContext(), EducationLearnPickActivity.class);
        startActivity(intent);
    }
}
