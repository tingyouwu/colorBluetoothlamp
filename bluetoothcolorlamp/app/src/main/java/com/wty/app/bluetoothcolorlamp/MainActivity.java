package com.wty.app.bluetoothcolorlamp;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDefaultNavigation().setTitle(getResources().getString(R.string.app_name));
        getDefaultNavigation().getLeftButton().hide();
        getDefaultNavigation().setRightButton("关于我们", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
