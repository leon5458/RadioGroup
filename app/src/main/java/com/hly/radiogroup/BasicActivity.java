package com.hly.radiogroup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/6~~~~~~
 * ~~~~~~更改时间:2018/8/6~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class BasicActivity extends AppCompatActivity{
    private RadioGroup ver_ball,hor_ball;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_activity_layout);
        hor_ball = findViewById(R.id.hor_ball);
        ver_ball = findViewById(R.id.ver_ball);

        hor_ball.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton choise = findViewById(id);
                String output = choise.getText().toString();
                Toast.makeText(BasicActivity.this, "你的性别为：" + output, Toast.LENGTH_SHORT).show();

            }
        });

        ver_ball.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton choise = findViewById(id);
                String output = choise.getText().toString();
                Toast.makeText(BasicActivity.this, "你的性别为：" + output, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
