package www.com.mvp.model;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import www.com.net.Volley;

/**
 * Name:  The.xue
 * Date  2019-05-10
 */
public class ModelIml implements Model {
    @Override
    public void doloogin(String url, String phone, String pwd, final LoginCallback callback) {
        Volley.post(url, phone, pwd, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                callback.onSuccess(response.body().string());
            }
        });
    }

    @Override
    public void doRegister(String url, String phone, String pwd, RegisterCallback callback) {
        Volley.post(url, phone, pwd, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                callback.onSuccess(response.body().string());
            }
        });
    }
}
