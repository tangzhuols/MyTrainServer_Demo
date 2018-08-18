package com.infzm.slidingmenu.demo.enrty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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

@ContentView(R.layout.activity_oblvious_nextstoppwd)
public class MyOblivious_NextStopPwd extends Activity {
    @ViewInject(R.id.trName)
    private TextView trName;
    @ViewInject(R.id.trpwd11)
    private EditText trpwd11;
    @ViewInject(R.id.trpwd12)
    private EditText trpwd12;
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
    public void getEventNextPws(View v) {
        switch (v.getId()) {
            case R.id.fanhui:
                Intent intent = new Intent(MyOblivious_NextStopPwd.this, MyOblivousPs.class);
                startActivity(intent);
                break;
            case R.id.nexttep_ok:
                if ((trpwd11.getText().toString()).equals(trpwd12.getText().toString())) {
                    getObliviousHttp();
                } else
                    Toast.makeText(MyOblivious_NextStopPwd.this, "密码不一致，请重新输入！", Toast.LENGTH_SHORT).show();

                break;
        }
    }

    public void getBundle() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        trName.setText(bundle.getString("userName"));
    }

    public void getObliviousHttp() {
        RequestParams requestParams = new RequestParams(Student_info.Http_PAHT + "updateOblivious.action");

        requestParams.addParameter("trName", trName.getText().toString());
        requestParams.addParameter("trpwd", trpwd11.getText().toString());
        x.http().post(requestParams, new Callback.CommonCallback<String>() {
            ProgressBar progressBar;
            @Override
            public void onSuccess(String result) {
                CreateProgressBar();
                Gson gson = new Gson();
                JSONObject jsonObject;
                try {
                    jsonObject = new JSONObject(result);
                    String resultCode = JsonParseUtil.parseJSonString(jsonObject, "resultCode");
                    if (resultCode.equals("200")) {
                        Intent intent = new Intent(MyOblivious_NextStopPwd.this, MyEnroll.class);
                        startActivity(intent);
                        Toast.makeText(MyOblivious_NextStopPwd.this, "修改成功，请登录！", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MyOblivious_NextStopPwd.this, "修改失败，请修改注册！", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void CreateProgressBar() {
                FrameLayout layout = (FrameLayout) findViewById(android.R.id.content);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT
                );
                layoutParams.gravity = Gravity.CENTER;
                progressBar = new ProgressBar(MyOblivious_NextStopPwd.this);
                progressBar.setLayoutParams(layoutParams);
                progressBar.setVisibility(View.VISIBLE);
                layout.addView(progressBar);
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
