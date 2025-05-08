package com.example.tictactoe2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 , btn9 , restart;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag=0 ;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });
        init();
       btn1.setOnClickListener(v -> {
           if (btn1.getText().toString().equals("")) {
               if(flag==0){
                   btn1.setText("x");
                   flag=1;
               }else{
                   btn1.setText("o");
                   flag=0;
               }
               count++;
               updateBoard();
               check(null);
           }
       });
        btn2.setOnClickListener(v -> {
            if (btn2.getText().toString().equals("")) {
                if(flag==0){
                    btn2.setText("x");
                    flag=1;
                }else{
                    btn2.setText("o");
                    flag=0;
                }
                count++;
                updateBoard();
                check(null);
            }
        });
        btn3.setOnClickListener(v -> {
            if (btn3.getText().toString().equals("")) {
                if(flag==0){
                    btn3.setText("x");
                    flag=1;
                }else{
                    btn3.setText("o");
                    flag=0;
                }
                count++;
                updateBoard();
                check(null);
            }
        });
        btn4.setOnClickListener(v -> {
            if (btn4.getText().toString().equals("")) {
                if(flag==0){
                    btn4.setText("x");
                    flag=1;
                }else{
                    btn4.setText("o");
                    flag=0;
                }
                count++;
                updateBoard();
                check(null);
            }
        });
        btn5.setOnClickListener(v -> {
            if (btn5.getText().toString().equals("")) {
                if(flag==0){
                    btn5.setText("x");
                    flag=1;
                }else{
                    btn5.setText("o");
                    flag=0;
                }
                count++;
                updateBoard();
                check(null);
            }
        });
        btn6.setOnClickListener(v -> {
            if (btn6.getText().toString().equals("")) {
                if(flag==0){
                    btn6.setText("x");
                    flag=1;
                }else{
                    btn6.setText("o");
                    flag=0;
                }
                count++;
                updateBoard();
                check(null);
            }
        });
        btn7.setOnClickListener(v -> {
            if (btn7.getText().toString().equals("")) {
                if(flag==0){
                    btn7.setText("x");
                    flag=1;
                }else{
                    btn7.setText("o");
                    flag=0;
                }
                count++;
                updateBoard();
                check(null);
            }
        });
        btn8.setOnClickListener(v -> {
            if (btn8.getText().toString().equals("")) {
                if(flag==0){
                    btn8.setText("x");
                    flag=1;
                }else{
                    btn8.setText("o");
                    flag=0;
                }
                count++;
                updateBoard();
                check(null);
            }
        });
        btn9.setOnClickListener(v -> {
            if (btn9.getText().toString().equals("")) {
                if(flag==0){
                    btn9.setText("x");
                    flag=1;
                }else{
                    btn9.setText("o");
                    flag=0;
                }
                count++;
                updateBoard();
                check(null);
            }

        });
        restart.setOnClickListener(v -> {
            restart();
        });
    }

    private void updateBoard() {
        b1 = btn1.getText().toString();
        b2 = btn2.getText().toString();
        b3 = btn3.getText().toString();
        b4 = btn4.getText().toString();
        b5 = btn5.getText().toString();
        b6 = btn6.getText().toString();
        b7 = btn7.getText().toString();
        b8 = btn8.getText().toString();
        b9 = btn9.getText().toString();
    }
    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        restart = findViewById(R.id.restart);
    }

    public void check(View view){
        if(count>4){
            if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                Toast.makeText(this, b1+" is winner", Toast.LENGTH_SHORT).show();
                restart();
//                1
            }else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                Toast.makeText(this, b1+" is winner", Toast.LENGTH_SHORT).show();
                restart();
//                2
            } else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                Toast.makeText(this,  b2+" is winner", Toast.LENGTH_SHORT).show();
                restart();
//                3
            }else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                Toast.makeText(this, b3+" is winner", Toast.LENGTH_SHORT).show();
                restart();
//                4
            }else if(b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                Toast.makeText(this, b4+" is winner", Toast.LENGTH_SHORT).show();
                restart();
//                5
            }else if(b7.equals(b8) && b8.equals(b9) && !b8.equals("")){
                Toast.makeText(this, b7+" is winner", Toast.LENGTH_SHORT).show();
                restart();
//                6
            }else if(b1.equals(b5) && b1.equals(b9) && !b1.equals("")){
                Toast.makeText(this,  b1+"is winner", Toast.LENGTH_SHORT).show();
                restart();
//                7
            }else if(b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
                Toast.makeText(this, b3+" is winner", Toast.LENGTH_SHORT).show();
                restart();
//                8
            }else if(!b1.equals("") && !b2.equals("") && !b3.equals("")
                    &&!b4.equals("") && !b5.equals("") && !b6.equals("")
                    &&!b7.equals("") && !b8.equals("") && !b9.equals("")){
                Toast.makeText(this, "The game is drawn", Toast.LENGTH_SHORT).show();
                restart();
            }
        }
    }
public void restart() {

    new android.os.Handler().postDelayed(() -> {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag = 0;
        count = 0;
    }, 1000);
}
}
