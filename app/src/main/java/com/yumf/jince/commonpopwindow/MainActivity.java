package com.yumf.jince.commonpopwindow;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.yumf.jince.library.CommonPopupWindow;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.normal);
        textViewB = findViewById(R.id.text);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CommonPopupWindow commonPopupWindow = new CommonPopupWindow(MainActivity.this, R.layout.popupwindow_layout, R.color.colorAccent);
                commonPopupWindow.showAsDropDown(findViewById(R.id.normal));

//                commonPopupWindow.showAtLocation(textView, Gravity.TOP | Gravity.LEFT,0,0);
                textViewB.setText("测试");
            }
        });
    }
}
