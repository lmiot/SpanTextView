package com.limot.spantextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.limot.spantextviewlibrary.SpanTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /*   SpanTextView spanTextView= (SpanTextView) findViewById(R.id.id_span_text_view);
        spanTextView.setText01("第一组字体");
        spanTextView.setText02("第二组字体");
        spanTextView.setSize01(30);
        spanTextView.setSize02(10);
        spanTextView.setColor01(Color.RED);
        spanTextView.setColor02(Color.BLUE);*/
    }
}
