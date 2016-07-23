package au.com.shehacks.seven.seven.callbacks;

import android.os.Handler;

import com.kinvey.java.User;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */
public interface LoginCallback  {
    void onSuccess(User user);
    void onFailure(Exception ex);
}
