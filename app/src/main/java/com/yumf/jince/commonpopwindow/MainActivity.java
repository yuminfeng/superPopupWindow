package com.yumf.jince.commonpopwindow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yumf.jince.library.CommonPopupWindow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.normal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CommonPopupWindow commonPopupWindow = new CommonPopupWindow(MainActivity.this, R.layout.popupwindow_layout, 400, 300);
                commonPopupWindow.showAsDropDown(findViewById(R.id.normal));
            }
        });
    }
}
