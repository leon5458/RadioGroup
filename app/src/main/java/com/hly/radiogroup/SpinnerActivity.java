package com.hly.radiogroup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/6~~~~~~
 * ~~~~~~更改时间:2018/8/6~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class SpinnerActivity extends AppCompatActivity{

    private Spinner spinner1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_activity_layout);

        final Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
              String result =spinner.getItemAtPosition(position).toString();
                Toast.makeText(SpinnerActivity.this,result,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner1 = findViewById(R.id.spinner1);
        String[] arr={"西红柿","土豆","豆角"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,arr);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);//设置下拉列表框的下拉选项样式
        spinner1.setAdapter(adapter);

    }
}
