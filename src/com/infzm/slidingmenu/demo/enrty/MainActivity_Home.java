package com.infzm.slidingmenu.demo.enrty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import com.infzm.slidingmenu.demo.R;

import org.xutils.x;

@ContentView(R.layout.activity_main_home)
public class MainActivity_Home extends Activity {
    @ViewInject(R.id.Entry)
    private Button Entry;
    @ViewInject(R.id.oblivious)
    private Button oblivious;
    @ViewInject(R.id.button_wang)
    private Button button_wang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

    @Event(value = {R.id.Entry, R.id.oblivious})
    public void getEventMain(View v) {
        switch (v.getId()) {
            case R.id.Entry:
                Intent intent1 = new Intent(MainActivity_Home.this, MyEnroll.class);
                startActivity(intent1);
                break;
            case R.id.oblivious:
                Intent intent = new Intent(MainActivity_Home.this, MyOblivious.class);
                startActivity(intent);
                break;
            case R.id.button_wang:
                Intent intent2 = new Intent(MainActivity_Home.this, MyOblivousPs.class);
                startActivity(intent2);
                break;
        }
    }
}
