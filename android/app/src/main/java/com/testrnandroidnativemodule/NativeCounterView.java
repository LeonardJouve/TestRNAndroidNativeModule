package com.testrnandroidnativemodule;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NativeCounterView extends LinearLayout {
    private Context context;
    private Button button;
    private TextView textView;
    private TextView exposedTextView;
    private Integer count;

    public NativeCounterView(Context context) {
        super(context);
        inflate(context, R.layout.native_counter_layout, this);
        this.context = context;
        this.button = findViewById(R.id.button);
        this.textView = findViewById(R.id.textView);
        this.exposedTextView = findViewById(R.id.exposedTextView);

        this.count = 0;
        this.textView.setText(String.valueOf(this.count));

        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCount();
            }
        });
    }

    private void incrementCount() {
        this.count += 1;
        this.textView.setText(String.valueOf(this.count));
    }

    public void setText(String text) {
        this.exposedTextView.setText(text);
    }
}
