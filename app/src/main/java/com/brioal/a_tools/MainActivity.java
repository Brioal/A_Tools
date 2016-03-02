package com.brioal.a_tools;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.brioal.a_tools.CicleImageTest.CicleImageTest;
import com.brioal.a_tools.ColorDialog.ColorDialogTest;
import com.brioal.a_tools.GifView.GifViewTestActivity;
import com.brioal.a_tools.ImageLoaderTest.ImageLoaderTestActivity;
import com.brioal.a_tools.LoadingView.LoadingViewTest;
import com.brioal.a_tools.PhotoView.PhotoViewTestActivity;
import com.brioal.a_tools.PicassoTest.PicassoTestActivity;
import com.brioal.tools.summary.SummaryActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Tools 测试类", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void startSummary(View view) {
        startActivity(new Intent(MainActivity.this, SummaryActivity.class));
    }

    public void startCircle(View view) {
        startActivity(new Intent(MainActivity.this, CicleImageTest.class));
    }

    public void startColorDialog(View view) {
        startActivity(new Intent(MainActivity.this, ColorDialogTest.class));
    }

    public void startLoadingView(View view) {
        startActivity(new Intent(MainActivity.this, LoadingViewTest.class));
    }

    public void startPhotoView(View view) {
        startActivity(new Intent(MainActivity.this, PhotoViewTestActivity.class));
    }

    public void startGif(View view) {
        startActivity(new Intent(MainActivity.this, GifViewTestActivity.class));
    }

    public void startImageLoader(View view) {
        startActivity(new Intent(MainActivity.this, ImageLoaderTestActivity.class));
    }

    public void startPicasso(View view) {
        startActivity(new Intent(MainActivity.this, PicassoTestActivity.class));

    }

}
