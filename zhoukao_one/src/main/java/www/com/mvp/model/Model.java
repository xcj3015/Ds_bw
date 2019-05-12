package www.com.mvp.model;

/**
 * Name:  The.xue
 * Date  2019-05-10
 */
public interface Model {

    void doloogin(String url,String phone,String pwd,LoginCallback callback);
    interface LoginCallback{
        void onSuccess(String data);
    }

    void doRegister(String url,String phone,String pwd,RegisterCallback callback);
    interface RegisterCallback{
        void onSuccess(String data);
    }

    void Commodity(String url,CommodityCallback callback);
    interface CommodityCallback{
        void onSuccess(String data);
    }

}
