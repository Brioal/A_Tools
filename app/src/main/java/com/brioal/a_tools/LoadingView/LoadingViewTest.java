package com.brioal.a_tools.LoadingView;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.brioal.a_tools.R;
import com.brioal.tools.loadingview.ShapeLoadingDialog;

public class LoadingViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_view_test);
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
    }

    public void startView(View view) {
        startActivity(new Intent(LoadingViewTest.this,LoadingAsView.class));
    }

    public void startDialog(View view) {
        ShapeLoadingDialog dialog = new ShapeLoadingDialog(LoadingViewTest.this);
        dialog.setLoadingText("加载中....");
        dialog.show();
    }

}
