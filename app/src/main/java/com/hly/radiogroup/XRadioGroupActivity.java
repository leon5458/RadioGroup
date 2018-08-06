package com.hly.radiogroup;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/6~~~~~~
 * ~~~~~~更改时间:2018/8/6~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class XRadioGroupActivity extends AppCompatActivity{


    private Boolean ischeck;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);




        XRadioGroup xRadioGroup = findViewById(R.id.xRadioGroup);
        xRadioGroup.setOnCheckedChangeListener(new XRadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(XRadioGroup group, @IdRes int checkedId) {
                Log.d("TAG", checkedId + "is checked");

            }
        });



//        final RadioButton test1 = findViewById(R.id.test1);
//        final RadioButton test2 = findViewById(R.id.test2);
//        test1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                test1.setBackgroundResource(R.drawable.shape1);
//            }
//        });
//
//
//        test2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                test2.setBackgroundResource(R.drawable.shape1);
//            }
//        });


    }
}
