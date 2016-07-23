package au.com.shehacks.seven.seven;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/**
 * Created by hails on 23/07/16.
 */
public class EducationActivity extends BaseActivity {
    Button submitButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflateLayoutInContainer(R.layout.activity_education);
        //setContentView(R.layout.activity_education);
    }

    public void pick(View view){
        Intent intent = new Intent(this, EducationLearnPickActivity.class);
        startActivity(intent);
    }

}
