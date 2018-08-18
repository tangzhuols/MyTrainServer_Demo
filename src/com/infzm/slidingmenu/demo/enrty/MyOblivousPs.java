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
import android.widget.Toast;

import com.google.gson.Gson;
import com.infzm.slidingmenu.demo.R;
import com.infzm.slidingmenu.demo.view.JsonParseUtil;
import com.xq.vo.Instructor;
import com.xq.vo.Student_info;

import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Created by acer on 2016/10/18.
 */
@ContentView(R.layout.activity_obliviousps)
public class MyOblivousPs extends Activity {
    @ViewInject(R.id.fanhui1pwd)
    private LinearLayout fanhui1pwd;
    @ViewInject(R.id.userNameps)
    private EditText userNameps;
    @ViewInject(R.id.phoneGainps)
    private EditText phoneGainps;
    @ViewInject(R.id.gainps)
    private Button gainps;
    @ViewInject(R.id.nexttepps)
    private Button nexttepps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

    @Event(value = {R.id.nexttepps, R.id.fanhui1pwd, R.id.gainps})
    public void getEventPs(View v) {
        switch (v.getId()) {
            case R.id.nexttepps:
                if ((userNameps.getText().toString()).length() != 11 || (userNameps.getText().toString()) == null) {
                    Toast.makeText(MyOblivousPs.this, "请输入有效的电话号码", Toast.LENGTH_SHORT).show();
                } else {
                    getInstructorHTTP();
                }
                break;
            case R.id.fanhui1pwd:

                Intent intent = new Intent(MyOblivousPs.this, MainActivity_Home.class);
                startActivity(intent);
                break;
            case R.id.gainps:

                break;
        }
    }

    public void getInstructorHTTP() {
        RequestParams requestParams = new RequestParams(Student_info.Http_PAHT + "instructorUerName.action");
        requestParams.addParameter("trName", userNameps.getText().toString());
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
                    String data = JsonParseUtil.parseJSonString(jsonObject, "data");
                    Instructor instructor = gson.fromJson(data, Instructor.class);
                    if (resultCode.equals("200")) {
                        Bundle bundle = new Bundle();
                        bundle.putString("userName", userNameps.getText().toString());
                        Intent intent1 = new Intent(MyOblivousPs.this, MyOblivious_NextStopPwd.class);
                        intent1.putExtras(bundle);
                        startActivity(intent1);
                    } else {
                        Toast.makeText(MyOblivousPs.this, "电话号码没有被注册，请注册！", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            public void CreateProgressBar() {
                FrameLayout layout = (FrameLayout) findViewById(android.R.id.content);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT
                );
                layoutParams.gravity = Gravity.CENTER;
                progressBar = new ProgressBar(MyOblivousPs.this);
                progressBar.setLayoutParams(layoutParams);
                progressBar.setVisibility(View.VISIBLE);
                layout.addView(progressBar);
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
