package com.brioal.a_tools.GifView;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ant.liao.GifView;
import com.brioal.a_tools.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * GifView播放动态图片
 * 使用方法：
 *  1.布局文件定义GifView
 *  2.设置图片资源
 *   gifView.setGifImage(R.drawable.gif);
 */
public class GifViewTestActivity extends AppCompatActivity {
    @Bind(R.id.gif_image)
    GifView gifView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif_view_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        ButterKnife.bind(this);
        gifView.setGifImage(R.drawable.gif);

    }

}
