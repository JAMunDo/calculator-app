package com.example.calculator;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, buttonNeg, buttonPer, buttonSqr,buttonDel;
    EditText calcEditText = null;



     double num1, num2,temp;

    boolean addition, subtract, multiplication, division, square, percent,negative,dp = false;

    @Override
    @TargetApi(21)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonNeg = (Button) findViewById(R.id.buttonneg);
        buttonPer = (Button) findViewById(R.id.buttonper);
        buttonSqr = (Button) findViewById(R.id.buttonsqr);
        buttonDel = (Button) findViewById(R.id.buttondel);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        calcEditText = (EditText) findViewById(R.id.edt1);
        calcEditText.setShowSoftInputOnFocus(false);

        calcEditText.setText(calcEditText.getText() + "0");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "1");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "1");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "2");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "2");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "2");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "3");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "3");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "3");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "4");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "4");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "4");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "5");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "5");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "5");
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "6");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "6");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "6");
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "7");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "7");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "7");
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "8");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "8");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "8");
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "9");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "9");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "9");
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=calcEditText.getText().toString();
                temp = Double.parseDouble(calcEditText.getText() + "");
                if(s.equals("0.")){
                    calcEditText.setText(calcEditText.getText() + "0");
                }else  if(temp > -1 || temp < 1){
                    calcEditText.setText(calcEditText.getText() + "0");
                }
                if( s.equals("0") || s.equals("Infinity")){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "0");
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = Double.parseDouble(calcEditText.getText() + "");
                    num1 = Double.parseDouble(calcEditText.getText() + "");
                    addition = true;
                    dp = false;
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "0");
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    num1 = Double.parseDouble(calcEditText.getText() + "");
                    subtract = true;
                    dp = false;
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "0");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    num1 = Double.parseDouble(calcEditText.getText() + "");
                    multiplication = true;
                    dp = false;
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "0");
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    num1 = Double.parseDouble(calcEditText.getText() + "");
                    division = true;
                    dp = false;
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "0");
            }
        });

        buttonSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    num1 = Double.parseDouble(calcEditText.getText() + "");
                    if(num1 != 0){
                        num1 = num1 * num1;
                        calcEditText.setText(num1 + "");
                        dp = true;
                    }

            }
        });

        buttonPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    num1 = Double.parseDouble(calcEditText.getText() + "");
                    if(num1 != 0) {
                        num1 = num1 / 100;
                        calcEditText.setText(num1 + "");
                        dp = true;
                    }
            }
        });

        buttonNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // temp = Double.parseDouble(calcEditText.getText() + "");
                    num1 = Double.parseDouble(calcEditText.getText() + "");
                    if(num1 != 0) {
                        num1 = num1 * -1;
                        calcEditText.setText(num1 + "");
                        dp = true;
                    }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Double.parseDouble(calcEditText.getText() + "");


                if (addition == true) {
                    calcEditText.setText(num1 + num2 + "");
                    addition = false;
                    dp = true;
                }

                if (subtract == true) {
                    calcEditText.setText(num1 - num2  + "");
                    subtract = false;
                    dp = true;
                }

                if (multiplication == true) {
                    calcEditText.setText(num1 * num2  + "");
                    multiplication = false;
                    dp = true;
                }

                if (division == true) {
                    calcEditText.setText(num1 / num2 + "");
                    division = false;
                    dp = true;
                }

               temp = Double.parseDouble(calcEditText.getText() + "");
                if(temp == 0){
                    calcEditText.setText("");
                    calcEditText.setText(calcEditText.getText() + "0");
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcEditText.setText("");
                calcEditText.setText(calcEditText.getText() + "0");
                dp = false;

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dp== false) {
                    calcEditText.setText(calcEditText.getText() + ".");
                    dp = true;
                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=calcEditText.getText().toString();
                s=s.substring(0,s.length()-1);
                calcEditText.setText(s);
                if(s.equals(null) || s.equals("")){
                    calcEditText.setText("0");
                    dp = false;
                }
            }
        });

    }
}