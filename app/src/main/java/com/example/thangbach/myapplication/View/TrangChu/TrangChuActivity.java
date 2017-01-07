package com.example.thangbach.myapplication.View.TrangChu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.thangbach.myapplication.Adapter.ViewpagerAdapter;
import com.example.thangbach.myapplication.R;

/**
 * Created by ThangBach on 1/2/2017.
 */

public class TrangChuActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewpagerAdapter viewpagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        anhxa();
        setSupportActionBar(toolbar);
        viewpagerAdapter=new ViewpagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void anhxa(){
        //toolbar
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");

        //tablayout
        tabLayout= (TabLayout) findViewById(R.id.tabs);

        //viewpager
        viewPager= (ViewPager) findViewById(R.id.viewpager);
    }

    // khoi tao menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutrangchu,menu);
        return true;
    }

    // xu ly su kien click menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
