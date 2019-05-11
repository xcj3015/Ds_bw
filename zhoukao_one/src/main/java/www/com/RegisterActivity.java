package www.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import www.com.bean.Register;
import www.com.mvp.presenter.PresenterIml;

/**
 * Name:  The.xue
 * Date  2019-05-10
 */
public class RegisterActivity extends AppCompatActivity {
    private EditText mPhone,mPwd;
    private Button bt_register2;
    private PresenterIml presenterIml;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_register);

        mPhone = findViewById(R.id.ed_phone);
        mPwd = findViewById(R.id.ed_pwd);
        bt_register2 = findViewById(R.id.bt_register2);
        presenterIml = new PresenterIml(this);

        bt_register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = mPhone.getText().toString();
                String pwd = mPwd.getText().toString();
                if (TextUtils.isEmpty(phone)||TextUtils.isEmpty(pwd)){
                    Toast.makeText(RegisterActivity.this,"输入框不能为空",Toast.LENGTH_SHORT).show();
                }else {
                    presenterIml.doRegister(phone,pwd);
                }
            }
        });
    }
    public void doRegister(final String data) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Gson gson = new Gson();
                Register register = gson.fromJson(data, Register.class);
                String status = register.getStatus();
                if (status.equals("0000")){
                    Toast.makeText(RegisterActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                    finish();
                }else {
                    Toast.makeText(RegisterActivity.this,"注册失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
