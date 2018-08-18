package com.infzm.slidingmenu.demo.enrty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.infzm.slidingmenu.demo.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Created by acer on 2016/10/17.
 */
@ContentView(R.layout.activity_oblivious)
public class MyOblivious extends Activity {
    @ViewInject(R.id.fanhui)
    private LinearLayout fanhui;
    @ViewInject(R.id.userName)
    private EditText userName;
    @ViewInject(R.id.phoneGain)
    private EditText phoneGain;
    @ViewInject(R.id.gain)
    private Button gain;
    @ViewInject(R.id.nexttep)
    private Button nexttep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

    @Event(value = {R.id.fanhui1, R.id.gain, R.id.nexttep})
    public void getEventOblivious(View v) {
        switch (v.getId()) {
            case R.id.fanhui1:
                Intent intent = new Intent(MyOblivious.this, MainActivity_Home.class);
                startActivity(intent);

                break;
            case R.id.gain:

                break;
            case R.id.nexttep:
                if ((userName.getText().toString()).length() != 11 || (userName.getText().toString()) == null) {
                    Toast.makeText(MyOblivious.this, "请输入有效的电话号码", Toast.LENGTH_SHORT).show();
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("userName", userName.getText().toString());
                    Intent intent1 = new Intent(MyOblivious.this, MyOblivious_NextStop.class);
                    intent1.putExtras(bundle);
                    startActivity(intent1);
                }

                break;
        }
    }
}
