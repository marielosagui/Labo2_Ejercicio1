package com.example.labo2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

        EditText user, password;
        Button button;
        TextView caja;



        @Override

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);



            user = findViewById(R.id.user);

            password = findViewById(R.id.password);
            button = findViewById(R.id.button);
            caja = findViewById(R.id.cajaEmpty);

            button.setOnClickListener(this);
            button.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            caja.setText(user.getText());

        }


        @Override

        public boolean onLongClick(View v) {

            caja.setText(password.getText());

            return false;
        }
    }
