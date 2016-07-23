package au.com.shehacks.seven.seven.managers;

import android.content.Context;
import android.widget.Toast;

import com.kinvey.android.Client;
import com.kinvey.android.callback.KinveyUserCallback;
import com.kinvey.java.User;

import au.com.shehacks.seven.seven.callbacks.LoginCallback;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */
public class UserManager {
    private static UserManager sharedManager = null;
    private Client client;

    public static UserManager sharedManager() {
        if (sharedManager == null) {
            sharedManager = new UserManager();
        }
        return sharedManager;
    }

    public void setup(String appKey, String appSecret, Context context) {
        client =  new Client.Builder(appKey, appSecret, context).build();
    }

    public void create(String username, String password, final LoginCallback callback) {
        client.user().create(username, password, new KinveyUserCallback() {
            @Override
            public void onSuccess(User user) {
                callback.onSuccess(user);
            }

            @Override
            public void onFailure(Throwable throwable) {
                callback.onFailure(new Exception(throwable.getMessage()));
            }
        });
    }

    public void login(String username, String password, final LoginCallback callback) {
        client.user().login(username, password, new KinveyUserCallback() {
            @Override
            public void onSuccess(User user) {
                callback.onSuccess(user);
            }

            @Override
            public void onFailure(Throwable throwable) {
                callback.onFailure(new Exception(throwable.getMessage()));
            }
        });
    }

}
