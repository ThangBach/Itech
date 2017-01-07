package com.example.thangbach.myapplication.View.ManHinhChao;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.thangbach.myapplication.R;
import com.example.thangbach.myapplication.View.TrangChu.TrangChuActivity;

/**
 * Created by ThangBach on 12/30/2016.
 */

public class ManHinhChaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }catch (Exception e){

                }finally {
                    Intent intent=new Intent(ManHinhChaoActivity.this, TrangChuActivity.class);
                    startActivity(intent);
                }
            }
        });
        thread.start();
    }
}
