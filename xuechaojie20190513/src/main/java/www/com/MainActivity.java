package www.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.List;

import www.com.bean.ListBean;
import www.com.bean.ListBean.ItemsBean;
import www.com.mvp.presenter.PresenterIml;

import static android.content.Context.VIBRATOR_SERVICE;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private PresenterIml presenterIml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        GridLayoutManager grid = new GridLayoutManager(this,2);
        recycler.setLayoutManager(grid);

        presenterIml = new PresenterIml(this);

        presenterIml.Commodity();
    }

    public void OnSuccess(String data){


        Gson gson = new Gson();
        List<ListBean.ItemsBean> list = gson.fromJson(data, (Type) ListBean.class);

//        recycler.setAdapter();
    }
}
