package com.example.tiktakteo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    String v1, v2, v3, v4, v5, v6, v7, v8, v9;
    boolean st;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        bt4 = findViewById(R.id.button4);
        bt5 = findViewById(R.id.button5);
        bt6 = findViewById(R.id.button6);
        bt7 = findViewById(R.id.button7);
        bt8 = findViewById(R.id.button8);
        bt9 = findViewById(R.id.button9);

    }

    public void click(View view) {

        Button btn = (Button) view;
        if (btn.getText().toString().equals("")) {

            if (st == false) {
                count++;
                btn.setText("X");
                st = true;
            } else if (st == true) {
                btn.setText("O");
                st = false;
                count++;
            }

            v1 = bt1.getText().toString();
            v2 = bt2.getText().toString();
            v3 = bt3.getText().toString();
            v4 = bt4.getText().toString();
            v5 = bt5.getText().toString();
            v6 = bt6.getText().toString();
            v7 = bt7.getText().toString();
            v8 = bt8.getText().toString();
            v9 = bt9.getText().toString();
            if (count > 4) {

                if ((v1.equals(v2)) && (v2.equals(v3)) && !v1.equals("")) {
                    Toast.makeText(this, v1 + " is Winn", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, " New Game Start", Toast.LENGTH_LONG).show();
                    newGame();
                } else if ((v4.equals(v5)) && (v5.equals(v6)) && !v5.equals("")) {
                    Toast.makeText(this, v4 + " is Winn", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, " New Game Start", Toast.LENGTH_LONG).show();
                    newGame();
                } else if ((v7.equals(v8)) && (v8.equals(v9)) && !v7.equals("")) {
                    Toast.makeText(this, v7 + " is Winn", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, " New Game Start", Toast.LENGTH_LONG).show();
                    newGame();
                } else if ((v1.equals(v4)) && (v4.equals(v7)) && !v4.equals("")) {
                    Toast.makeText(this, v1 + " is Winn", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, " New Game Start", Toast.LENGTH_LONG).show();
                    newGame();
                } else if ((v2.equals(v5)) && (v5.equals(v8)) && !v2.equals("")) {
                    Toast.makeText(this, v2 + " is Winn", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, " New Game Start", Toast.LENGTH_LONG).show();
                    newGame();
                } else if ((v3.equals(v6)) && (v6.equals(v9)) && !v6.equals("")) {
                    Toast.makeText(this, v6 + " is Winn", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, " New Game Start", Toast.LENGTH_LONG).show();
                    newGame();
                } else if ((v1.equals(v5)) && (v5.equals(v9)) && !v1.equals("")) {
                    Toast.makeText(this, v1 + " is Winn", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, " New Game Start", Toast.LENGTH_LONG).show();newGame();
                    newGame();
                } else if ((v3.equals(v5)) && (v5.equals(v7)) && !v3.equals("")) {
                    Toast.makeText(this, v3 + " is Winn", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, " New Game Start", Toast.LENGTH_LONG).show();
                    newGame();
                }else if(count == 9 && !v1.equals("")&& !v2.equals("")&& !v3.equals("")&& !v4.equals("")&& !v5.equals("")&& !v6.equals("")&& !v7.equals("")&& !v8.equals("")&& !v9.equals("")){
                    Toast.makeText(this,  " Game is Drawn", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, " New Game Start", Toast.LENGTH_LONG).show();
                    newGame();
                }
            }
        }
    }

    public void newGame(){
        count = 0;
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
    }

}