package www.com.mvp.model;

/**
 * Name:  The.xue
 * Date  2019-05-13
 */
public interface Model {

    void Commodity(String url,CommodituCallback callback);
    interface CommodituCallback{
        void success(String data);
    }
}
