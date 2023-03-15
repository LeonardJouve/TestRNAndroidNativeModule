package com.testrnandroidnativemodule;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NativeCounterView extends LinearLayout {
    private TextView textView;
    private TextView exposedTextView;
    private Button button;
    private Integer count;

    public NativeCounterView(Context context) {
        super(context);
        this.textView = new TextView(context);
        this.exposedTextView = new TextView(context);
        this.button = new Button(context);

        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCount();
            }
        });

        this.addView(textView);
        this.addView(exposedTextView);
        this.addView(button);

        this.count = 0;
        this.textView.setText(String.valueOf(this.count));
        this.button.setText("Increment count");
    }

    private void incrementCount() {
        this.count += 1;
        this.textView.setText(String.valueOf(this.count));
    }

    public void setText(String text) {
        this.exposedTextView.setText(text);
    }
}
