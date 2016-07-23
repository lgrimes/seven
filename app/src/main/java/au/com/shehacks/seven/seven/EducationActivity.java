package au.com.shehacks.seven.seven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by hails on 23/07/16.
 */
public class EducationActivity extends AppCompatActivity {

    Button submitButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        setupViews();
    }

    private void setupViews () {
        submitButton = (Button) findViewById(R.id.learn);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learn();
            }
        });
    }

    private void learn(){
        setContentView(R.layout.activity_education_learn);
    }

}
