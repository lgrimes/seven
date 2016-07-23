package au.com.shehacks.seven.seven;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kinvey.java.User;

import au.com.shehacks.seven.seven.callbacks.LoginCallback;
import au.com.shehacks.seven.seven.managers.IntentManager;
import au.com.shehacks.seven.seven.managers.UserManager;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */
public class RegistrationActivity extends AppCompatActivity {

    EditText usernameEditText;
    EditText passwordEditText;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        UserManager.sharedManager().setup(getResources().getString(R.string.kinvey_app_id), getResources().getString(R.string.kinvey_api_token), getApplicationContext());
        setupViews();
    }

    private void setupViews () {
        usernameEditText = (EditText) findViewById(R.id.username_edit_text);
        passwordEditText = (EditText) findViewById(R.id.pasword_edit_text);
        submitButton = (Button) findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create();
            }
        });
    }

    private void create() {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        startActivity(IntentManager.dashboard(getApplicationContext()));
//        UserManager.sharedManager().login(username, password, new LoginCallback() {
//            @Override
//            public void onSuccess(User user) {
//                Log.d("USER","created user");
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//
//                    }
//                });
//            }
//
//            @Override
//            public void onFailure(Exception ex) {
//                Log.d("USER","failed to created user");
//            }
//        });
    }
}
