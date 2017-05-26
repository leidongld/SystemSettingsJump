package com.example.leidong.systemsettingsjump;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        initActions();
    }

    /**
     * 初始化动作
     */
    private void initActions() {
        button1.setOnClickListener(this);
    }

    /**
     * 初始化控件
     */
    private void initWidgets() {
        button1 = (Button) findViewById(R.id.button1);
    }

    /**
     * 按钮点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent1 = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS );
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
