package au.com.shehacks.seven.seven.networking;

import java.io.IOException;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */

public class Requester {
    public static Requester sharedInstance = new Requester();
    public final OkHttpClient client = new OkHttpClient();
    public final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public void post(String url, String json, Callback callback) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
