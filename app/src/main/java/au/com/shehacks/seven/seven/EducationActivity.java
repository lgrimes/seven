package au.com.shehacks.seven.seven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

/**
 * Created by hails on 23/07/16.
 */
public class EducationActivity extends AppCompatActivity {

    Button submitButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
    }

    private void learn(View view){
        Intent intent = new Intent(this, EducationLearnActivity.class);
    }

}
