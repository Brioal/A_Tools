package com.brioal.a_tools.ImageLoaderTest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.brioal.a_tools.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 图片加载框架ImageLoader的使用
 */
public class ImageLoaderTestActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.image_loader_image)
    ImageView imageLoaderImage;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loader_test);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ImageLoader loader = ImageLoader.getInstance();
        loader.displayImage("https://www.baidu.com/img/bd_logo1.png",imageLoaderImage);
    }

}
