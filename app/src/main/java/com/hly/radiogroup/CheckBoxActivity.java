package com.hly.radiogroup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/6~~~~~~
 * ~~~~~~更改时间:2018/8/6~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class CheckBoxActivity extends AppCompatActivity{
    private CheckBox box1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box_layout);

        box1 = findViewById(R.id.box1);

        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckBoxActivity.this,"点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
