package au.com.shehacks.seven.seven;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


/**
 * Created by hails on 23/07/16.
 */
public class RegisterChildActivity extends BaseActivity {
    Button createButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflateLayoutInContainer(R.layout.activity_register_child);
        setViews();
    }

    private View.OnClickListener listen = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onCreateChildPressed(v);
        }
    };

    private void setViews() {
        createButton = (Button) findViewById(R.id.createChild);
        createButton.setOnClickListener(listen);
    }

    public void onCreateChildPressed(View view){
        Intent intent = new Intent(view.getContext(), CharitySelectionActivity.class);
        startActivity(intent);
    }
}
