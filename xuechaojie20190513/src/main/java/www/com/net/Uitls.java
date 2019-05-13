package www.com.net;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Name:  The.xue
 * Date  2019-05-13
 */
public class Uitls {

    public static void get(String url, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).get().build();
        client.newCall(request).enqueue(callback);
    }

}
