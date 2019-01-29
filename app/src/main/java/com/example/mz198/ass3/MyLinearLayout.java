package com.example.mz198.ass3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MyLinearLayout extends AppCompatActivity {

    Switch styleSwitch;
    SeekBar seekBar;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_linear_layout);

        styleSwitch = (Switch) findViewById(R.id.switchTheme);
        styleSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (styleSwitch.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "unChecked", Toast.LENGTH_SHORT).show();
                }
            }
        });


        seekBar =findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        textView = findViewById(R.id.tvSeekBarNumber);
        textView.setText(String.valueOf(seekBar.getProgress()));

        button =findViewById(R.id.btnRelativeLayout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MyRelativeLayout.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
