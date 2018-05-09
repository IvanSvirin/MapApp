package com.example.isvirin.mapapp;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

public class CustomDialog extends Dialog {
    private Context context;
    private Button button_cancel;
    private Button button_ok;
    public CustomDialog(@NonNull Context context) {
        super(context);
        this.context = context;
        init();
    }

    private void init() {
        this.setContentView(R.layout.dialog);

        button_cancel = findViewById(R.id.button_cancel);
        button_ok = findViewById(R.id.button_ok);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

}
