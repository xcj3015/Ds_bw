package www.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import www.com.bean.Login;
import www.com.mvp.presenter.PresenterIml;

public class LoginActivity extends AppCompatActivity {

    private EditText mPhone,mPwd;
    private CheckBox checkBox;
    private PresenterIml presenterIml;
    private Button bt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mPhone = (EditText)findViewById(R.id.ed_phone);
        mPwd = (EditText)findViewById(R.id.ed_pwd);
        checkBox = findViewById(R.id.checkbox);
        findViewById(R.id.bt_login);
        bt_register = findViewById(R.id.bt_register);


        presenterIml = new PresenterIml(this);

        bt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.bt_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone = mPhone.getText().toString();
                String pwd = mPwd.getText().toString();
                if (TextUtils.isEmpty(phone)||TextUtils.isEmpty(pwd)){
                    Toast.makeText(LoginActivity.this,"输入不能为空",Toast.LENGTH_LONG).show();;
                }else{
                    presenterIml.doLogin(phone,pwd);
                }
            }
        });
    }

    public void doLogin(String data){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Gson gson = new Gson();
                Login login = gson.fromJson(data,Login.class);
                String status = login.getStatus();
                if (status.equals("0000")){
                    startActivity(new Intent(LoginActivity.this,ButtomTabActivity.class));
                }else{
                    Toast.makeText(LoginActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
