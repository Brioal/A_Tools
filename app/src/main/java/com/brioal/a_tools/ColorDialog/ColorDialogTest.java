package com.brioal.a_tools.ColorDialog;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import com.brioal.a_tools.R;
import com.brioal.tools.colordialog.ColorDialog;
import com.brioal.tools.colordialog.PromptDialog;

public class ColorDialogTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_dialog_test);
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

    public void startText(View view) {
        new PromptDialog(this).setDialogType(PromptDialog.DIALOG_TYPE_SUCCESS)
                .setTitleText("Success").setContentText("Loading Success.")
                .setPositiveListener("OK", new PromptDialog.OnPositiveListener() {
                    @Override
                    public void onClick(PromptDialog dialog) {
                        dialog.dismiss();
                    }
                }).show();
    }

    public void startPic(View view) {
        ColorDialog dialog = new ColorDialog(this);
        dialog.setTitle("Success");
        dialog.setAnimationEnable(true);
        dialog.setAnimationIn(getInAnimationTest(this));
        dialog.setAnimationOut(getOutAnimationTest(this));
        dialog.setContentImage(getResources().getDrawable(R.drawable.image));
        dialog.setPositiveListener("delete", new ColorDialog.OnPositiveListener() {
            @Override
            public void onClick(ColorDialog dialog) {
                Toast.makeText(ColorDialogTest.this, dialog.getPositiveText().toString(), Toast.LENGTH_SHORT).show();
            }
        })
                .setNegativeListener("Cancel", new ColorDialog.OnNegativeListener() {
                    @Override
                    public void onClick(ColorDialog dialog) {
                        Toast.makeText(ColorDialogTest.this, dialog.getNegativeText().toString(), Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }).show();
    }

    public void startTextandPic(View view) {
        ColorDialog dialog = new ColorDialog(this);
        dialog.setTitle("Success");
        dialog.setAnimationEnable(true);
        dialog.setContentText("Loading Success");
        dialog.setContentImage(getResources().getDrawable(R.mipmap.ic_launcher));
        dialog.setPositiveListener("Delete", new ColorDialog.OnPositiveListener() {
            @Override
            public void onClick(ColorDialog dialog) {
                Toast.makeText(ColorDialogTest.this, dialog.getPositiveText().toString(), Toast.LENGTH_SHORT).show();
            }
        })
                .setNegativeListener("Cancel", new ColorDialog.OnNegativeListener() {
                    @Override
                    public void onClick(ColorDialog dialog) {
                        Toast.makeText(ColorDialogTest.this, dialog.getNegativeText().toString(), Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }).show();
    }

    public void startMessage(View view) {
        ColorDialog dialog = new ColorDialog(this);
        dialog.setColor("#8ECB54");
        dialog.setAnimationEnable(true);
        dialog.setTitle("Success");
        dialog.setContentText("Loading Success.");
        dialog.setPositiveListener("I Know", new ColorDialog.OnPositiveListener() {
            @Override
            public void onClick(ColorDialog dialog) {
                Toast.makeText(ColorDialogTest.this, dialog.getPositiveText().toString(), Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
    public static AnimationSet getInAnimationTest(Context context) {
        AnimationSet out = new AnimationSet(context, null);
        AlphaAnimation alpha = new AlphaAnimation(0.0f, 1.0f);
        alpha.setDuration(150);
        ScaleAnimation scale = new ScaleAnimation(0.6f, 1.0f, 0.6f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(150);
        out.addAnimation(alpha);
        out.addAnimation(scale);
        return out;
    }

    public static AnimationSet getOutAnimationTest(Context context) {
        AnimationSet out = new AnimationSet(context, null);
        AlphaAnimation alpha = new AlphaAnimation(1.0f, 0.0f);
        alpha.setDuration(150);
        ScaleAnimation scale = new ScaleAnimation(1.0f, 0.6f, 1.0f, 0.6f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(150);
        out.addAnimation(alpha);
        out.addAnimation(scale);
        return out;
    }
}
