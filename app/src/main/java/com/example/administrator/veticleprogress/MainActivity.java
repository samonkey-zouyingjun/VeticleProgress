package com.example.administrator.veticleprogress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.veticleprogress.View.VerticalSeekBar;

public class MainActivity extends AppCompatActivity {

    private VerticalSeekBar veticleSeekBar;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        veticleSeekBar = (VerticalSeekBar) findViewById(R.id.vs);
        tv = (TextView) findViewById(R.id.tv);
        veticleSeekBar.setThumb(getResources().getDrawable(R.drawable.thumb));
        veticleSeekBar.setOnSeekBarChangeListener(new VerticalSeekBar.OnSeekBarChangeListener() {
            int current;
            @Override
            public void onProgressChanged(VerticalSeekBar VerticalSeekBar, int progress, boolean fromUser) {
                current = progress;
            }

            @Override
            public void onStartTrackingTouch(VerticalSeekBar VerticalSeekBar) {

            }

            @Override
            public void onStopTrackingTouch(VerticalSeekBar VerticalSeekBar) {
                tv.setText(""+current);
            }
        });
    }
}
