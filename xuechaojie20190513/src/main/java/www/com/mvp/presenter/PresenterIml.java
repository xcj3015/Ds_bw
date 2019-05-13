package www.com.mvp.presenter;

import www.com.MainActivity;
import www.com.api.Api;
import www.com.mvp.model.Model;
import www.com.mvp.model.ModelIml;

/**
 * Name:  The.xue
 * Date  2019-05-13
 */
public class PresenterIml implements Presenter {

    ModelIml modelIml;
    MainActivity mainActivity;
    public PresenterIml(MainActivity mainActivity){
        this.mainActivity = mainActivity;
        modelIml = new ModelIml();
    }

    @Override
    public void Commodity() {
        modelIml.Commodity(Api.list_url, new Model.CommodituCallback() {
            @Override
            public void success(String data) {
                mainActivity.OnSuccess(data);
            }
        });
    }
}
