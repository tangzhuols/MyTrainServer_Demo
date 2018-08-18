package com.infzm.slidingmenu.demo.enrty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.infzm.slidingmenu.demo.R;
import com.infzm.slidingmenu.demo.view.JsonParseUtil;
import com.xq.vo.Student_info;

import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Created by acer on 2016/10/17.
 */

@ContentView(R.layout.activity_oblvious_nextstop)
public class MyOblivious_NextStop extends Activity {
    @ViewInject(R.id.trName)
    private TextView trName;
    @ViewInject(R.id.tuName)
    private EditText tuName;
    @ViewInject(R.id.traddress)
    private EditText traddress;
    @ViewInject(R.id.trjage)
    private EditText trjage;
    @ViewInject(R.id.trpwd)
    private EditText trpwd;
    @ViewInject(R.id.trpwd1)
    private EditText trpwd1;
    @ViewInject(R.id.nexttep_ok)
    private Button nexttep_ok;
    @ViewInject(R.id.fanhui)
    private LinearLayout fanhui;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);

        getBundle();//接受传过来的值

    }

    @Event(value = {R.id.fanhui, R.id.nexttep_ok})
    public void getEventNext(View v) {
        switch (v.getId()) {
            case R.id.fanhui:
                Intent intent = new Intent(MyOblivious_NextStop.this, MyOblivious.class);
                startActivity(intent);
                break;
            case R.id.nexttep_ok:
                if((trpwd.getText().toString()).equals(trpwd1.getText().toString())){
                    getObliviousHttp();
                }else
                    Toast.makeText(MyOblivious_NextStop.this,"密码不一致，请重新输入！",Toast.LENGTH_SHORT).show();

                break;
        }
    }

    public void getBundle() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        trName.setText(bundle.getString("userName"));
    }

    public void getObliviousHttp() {

        RequestParams requestParams = new RequestParams(Student_info.Http_PAHT + "insertOblivious.action");
        requestParams.addParameter("tuName", tuName.getText().toString());
        requestParams.addParameter("trName", trName.getText().toString());
        requestParams.addParameter("trpwd", trpwd.getText().toString());
        requestParams.addParameter("traddress", traddress.getText().toString());
        requestParams.addParameter("trjage", Integer.parseInt(trjage.getText().toString()));
        x.http().post(requestParams, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                JSONObject jsonObject;
                try {
                    jsonObject =new JSONObject(result);
                    String resultCode = JsonParseUtil.parseJSonString(jsonObject,"resultCode");
                    if(resultCode.equals("200")){
                        Intent intent =new Intent(MyOblivious_NextStop.this, MyEnroll.class);
                        startActivity(intent);
                        Toast.makeText(MyOblivious_NextStop.this,"注册成功，请登录！",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MyOblivious_NextStop.this,"注册失败，请重新注册！",Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}
