package www.com.mvp.model;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import www.com.net.Uitls;

/**
 * Name:  The.xue
 * Date  2019-05-13
 */
public class ModelIml implements Model {
    @Override
    public void Commodity(String url, CommodituCallback callback) {
        Uitls.get(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                callback.success(response.body().string());
            }
        });
    }
}
