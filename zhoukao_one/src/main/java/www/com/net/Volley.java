package www.com.net;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Name:  The.xue
 * Date  2019-05-10
 */
public class Volley {

    public static void get(String url,Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).get().build();
        client.newCall(request).enqueue(callback);
    }

    public static void post(String url, String phone, String pwd, Callback callback){
        OkHttpClient client = new OkHttpClient();
        FormBody body = new FormBody.Builder().add("phone",phone).add("pwd",pwd).build();
        Request request = new Request.Builder().url(url).post(body).build();
        client.newCall(request).enqueue(callback);
    }

}
