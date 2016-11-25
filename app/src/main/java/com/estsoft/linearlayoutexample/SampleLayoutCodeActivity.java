package com.estsoft.linearlayoutexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SampleLayoutCodeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("Hello babamba");

        Button button = new Button(this);
        button.setText("Button");

        LinearLayout linearLayout  = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        linearLayout.addView(tv);
        linearLayout.addView(button);
        setContentView(linearLayout);

    }

}
