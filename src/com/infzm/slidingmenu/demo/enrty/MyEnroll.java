package com.infzm.slidingmenu.demo.enrty;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.infzm.slidingmenu.demo.MainActivity;
import com.infzm.slidingmenu.demo.R;
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
 * Created by acer on 2016/10/17.
 */
@ContentView(R.layout.activity_enroll)
public class MyEnroll extends Activity {
    @ViewInject(R.id.fanhui2)
    private LinearLayout fanhui2;
    @ViewInject(R.id.trName)
    private EditText trName;
    @ViewInject(R.id.trpwd)
    private EditText trpwd;
    @ViewInject(R.id.nexttep)
    private Button nexttep;
    @ViewInject(R.id.wagnji)
    private LinearLayout wagnji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);

    }

    @Event(value = {R.id.fanhui2, R.id.nexttep, R.id.wagnji})
    public void getEventMyEnroll(View v) {
        switch (v.getId()) {
            case R.id.fanhui2:
                Intent intent = new Intent(MyEnroll.this, MainActivity_Home.class);
                startActivity(intent);
                finish();
                break;
            case R.id.wagnji:
                Intent intent3 = new Intent(MyEnroll.this, MyOblivousPs.class);
                startActivity(intent3);
            break;
            case R.id.nexttep:
                new AsyncTask<String, Long, String>() {
                    ProgressBar progressBar;

                    public void CreateProgressBar() {
                        FrameLayout layout = (FrameLayout) findViewById(android.R.id.content);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
                                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT
                        );
                        layoutParams.gravity = Gravity.CENTER;
                        progressBar = new ProgressBar(MyEnroll.this);
                        progressBar.setLayoutParams(layoutParams);
                        progressBar.setVisibility(View.VISIBLE);
                        layout.addView(progressBar);
                    }

                    @Override
                    protected String doInBackground(String... params) {
                        getEnrollXUtil();
                        return null;
                    }

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        CreateProgressBar();
                    }
                }.execute(String.valueOf(true));
                break;
        }
    }

    public void getEnrollXUtil() {
        RequestParams requestParams = new RequestParams(Student_info.Http_PAHT + "instructorOne.action");
        requestParams.addParameter("trName", trName.getText().toString());
        requestParams.addParameter("trpwd", trpwd.getText().toString());
        x.http().post(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                JSONObject jsonObject;
                try {
                    Gson gson = new Gson();
                    jsonObject = new JSONObject(result);
                    String resultCode = com.infzm.slidingmenu.demo.view.JsonParseUtil.parseJSonString(jsonObject, "resultCode");
                    String data = com.infzm.slidingmenu.demo.view.JsonParseUtil.parseJSonString(jsonObject, "data");
                    Instructor instructor = gson.fromJson(data, Instructor.class);
                    Log.d("MtEnroll", "instructor====" + instructor);
                    if (resultCode.equals("200") && data != null) {
                        Intent intent = new Intent(MyEnroll.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(MyEnroll.this, "用户名或密码错误，请重新输入", Toast.LENGTH_LONG).show();
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
