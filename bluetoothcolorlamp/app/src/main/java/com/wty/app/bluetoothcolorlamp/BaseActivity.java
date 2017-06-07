package com.wty.app.bluetoothcolorlamp;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wty.app.bluetoothcolorlamp.widget.navigation.NavigationText;

/**
 * @author wty
 * @Desc activity基础类
 **/
public class BaseActivity extends AppCompatActivity {

    protected NavigationText navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStatusBar();
        setNavigation(getDefaultNavigation());
    }

    @TargetApi(19)
    private void initStatusBar() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.blue));
        }
    }

    public NavigationText getDefaultNavigation(){
        if(navigation==null){
            navigation = new NavigationText(this);
        }
        return navigation;
    }

    /**
     * 动态设置actionbar
     */
    public void setNavigation(View navigation){
        ActionBar actionBar = getSupportActionBar();
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(
                android.view.ViewGroup.LayoutParams.MATCH_PARENT,
                android.view.ViewGroup.LayoutParams.MATCH_PARENT);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setCustomView(navigation,layoutParams);
        if(navigation instanceof  NavigationText)
            this.navigation = (NavigationText)navigation;
        actionBar.show();
    }

}
