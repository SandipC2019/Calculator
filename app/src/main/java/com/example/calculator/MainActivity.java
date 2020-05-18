package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double first, second = 0;
    boolean addSelect = false;
    boolean subSelect = false;
    boolean mulSelect = false;
    boolean divSelect = false;

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, button10, buttonC, buttonEqual, buttonDot;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

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
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        resultText = (TextView) findViewById(R.id.result);
    }

    public static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }

    public void clickDiv(View view) {
        System.out.println("clickDiv");
        if(resultText.getText() == null || resultText.getText().equals("")) {
            resultText.setText(null);
        }
        else {
            try {
                first = Double.parseDouble(resultText.getText() + "");
                addSelect = false;
                subSelect = false;
                mulSelect = false;
                divSelect = true;
                resultText.setText(null);
            } catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
    }

    public void clickMul(View view) {
        System.out.println("clickMul");
        if(resultText.getText() == null || resultText.getText().equals("")) {
            resultText.setText(null);
        }
        else {
            try {
                first = Double.parseDouble(resultText.getText()+"");
                addSelect = false;
                subSelect = false;
                mulSelect = true;
                divSelect = false;
                resultText.setText(null);
            } catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public void clickAdd(View view) {
        System.out.println("clickAdd");
        if(resultText.getText() == null || resultText.getText().equals("")) {
            resultText.setText(null);
        }
        else {
            try {
                first = Double.parseDouble(resultText.getText() + "");
                addSelect = true;
                subSelect = false;
                mulSelect = false;
                divSelect = false;
                resultText.setText(null);
            } catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public void clickSub(View view) {
        System.out.println("clickSub");
        if(resultText.getText() == null || resultText.getText().equals("")) {
            resultText.setText(null);
        }
        else {
            try {
                first = Double.parseDouble(resultText.getText() + "");
                addSelect = false;
                subSelect = true;
                mulSelect = false;
                divSelect = false;
                resultText.setText(null);
            } catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public void click1(View view) {
        resultText.setText(resultText.getText()+"1");
    }

    public void click2(View view) {
        resultText.setText(resultText.getText()+"2");
    }

    public void click3(View view) {
        resultText.setText(resultText.getText()+"3");
    }

    public void click4(View view) {
        resultText.setText(resultText.getText()+"4");
    }

    public void click5(View view) {
        resultText.setText(resultText.getText()+"5");
    }

    public void click6(View view) {
        resultText.setText(resultText.getText()+"6");
    }

    public void click7(View view) {
        resultText.setText(resultText.getText()+"7");
    }

    public void click8(View view) {
        resultText.setText(resultText.getText()+"8");
    }

    public void click9(View view) {
        resultText.setText(resultText.getText()+"9");
    }

    public void click0(View view) {
        resultText.setText(resultText.getText()+"0");
    }

    public void clickDot(View view) {
        resultText.setText(resultText.getText()+".");
    }

    public void clickC(View view) {
        resultText.setText(null);
        addSelect = false;
        subSelect = false;
        mulSelect = false;
        divSelect = false;
    }

    public void clickEqual(View view) {
        if(resultText.getText() != null && !resultText.getText().equals("")) {
            second = Double.parseDouble(resultText.getText() + "");
            if (addSelect) {
                resultText.setText(fmt(first + second) + "");
                addSelect = false;
            }
            if (subSelect) {
                resultText.setText(fmt(first - second) + "");
                subSelect = false;
            }
            if (mulSelect) {
                resultText.setText(fmt(first * second) + "");
                mulSelect = false;
            }
            if (divSelect) {
                resultText.setText(fmt(first / second) + "");
                divSelect = false;
            }
        }
    }
}
