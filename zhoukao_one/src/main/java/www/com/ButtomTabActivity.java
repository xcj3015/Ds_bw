package www.com;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hjm.bottomtabbar.BottomTabBar;

import www.com.fragment.ListFragment;
import www.com.fragment.MyFragment;

/**
 * Name:  The.xue
 * Date  2019-05-10
 */
public class ButtomTabActivity extends AppCompatActivity {

    private BottomTabBar bottomTabBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttom_tab);

        bottomTabBar = findViewById(R.id.btn_tab_bar);
        bottomTabBar.init(getSupportFragmentManager())
                .setFontSize(10)
                .setImgSize(50,50)
                .setTabPadding(6,8,10)
                .setChangeColor(Color.RED,Color.BLACK)
                .addTabItem("首页",R.drawable.yi,ListFragment.class)
                .addTabItem("我的",R.drawable.er,MyFragment.class)
                .isShowDivider(false);

    }
}
