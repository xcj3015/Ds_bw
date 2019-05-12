package www.com.mvp.presenter;

import www.com.LoginActivity;
import www.com.RegisterActivity;
import www.com.api.Api;
import www.com.fragment.ListFragment;
import www.com.mvp.model.Model;
import www.com.mvp.model.ModelIml;

/**
 * Name:  The.xue
 * Date  2019-05-10
 */
public class PresenterIml implements Presenter {
    LoginActivity loginActivity;
    RegisterActivity registerActivity;
    ListFragment listFragment;
    ModelIml modelIml;

    public PresenterIml(LoginActivity loginActivity){
        this.loginActivity = loginActivity;
        modelIml = new ModelIml();
    }

    public PresenterIml(RegisterActivity registerActivity){
        this.registerActivity = registerActivity;
        modelIml = new ModelIml();
    }

    public PresenterIml(ListFragment listFragment){
        this.listFragment = listFragment;
        modelIml = new ModelIml();
    }


    @Override
    public void doLogin(String phone, String pwd) {
        modelIml.doloogin(Api.login_url, phone, pwd, new Model.LoginCallback() {
            @Override
            public void onSuccess(String data) {
                loginActivity.doLogin(data);
            }
        });
    }

    @Override
    public void doRegister(String phone, String pwd) {
        modelIml.doRegister(Api.login_url, phone, pwd, new Model.RegisterCallback() {
            @Override
            public void onSuccess(String data) {
                registerActivity.doRegister(data);
            }
        });
    }

    @Override
    public void doCommodity() {
        modelIml.Commodity(Api.list_url, new Model.CommodityCallback() {
            @Override
            public void onSuccess(String data) {
                listFragment.getCommodity(data);
            }
        });
    }
}
