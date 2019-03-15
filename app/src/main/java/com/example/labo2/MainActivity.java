package com.example.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = findViewById(R.id.bt_contact);

        txt1 =findViewById(R.id.Edit_Text1);
        txt2 =findViewById(R.id.Edit_Text2);

        btn1=findViewById(R.id.btn1);

        btn1.setOnCLickListener(this)

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        Log.i(tag:"id", msg:viewId + "");
        switch (viewId){
            case R.id.btn1;
                Toast.makeText(context:MainActivity.this , text "btn1", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
