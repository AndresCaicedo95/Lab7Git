package com.example.a2101240.CalculadoraRPN;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a2101240.myapplication.R;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ServiceCalculator sc=new ServiceCalculator();
    /*Button n0;
    Button n1;
    Button n2;
    Button n3;
    Button n4;
    Button n5;
    Button n6;
    Button n7;
    Button n8;
    Button n9;
    Button div;
    Button res;
    Button mul;
    Button mas;*/
    Button pun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.number);
        /*n0=(Button) findViewById(R.id.button0);
        n1=(Button) findViewById(R.id.button1);
        n2=(Button) findViewById(R.id.button2);
        n3=(Button) findViewById(R.id.button3);
        n4=(Button) findViewById(R.id.button4);
        n5=(Button) findViewById(R.id.button5);
        n6=(Button) findViewById(R.id.button6);
        n7=(Button) findViewById(R.id.button7);
        n8=(Button) findViewById(R.id.button8);
        n9=(Button) findViewById(R.id.button9);
        div=(Button) findViewById(R.id.buttonDiv);
        res=(Button) findViewById(R.id.buttonRes);
        mas=(Button) findViewById(R.id.buttonMas);
        mul=(Button) findViewById(R.id.buttonMul);*/
        pun=(Button) findViewById(R.id.buttonPun);
        pun.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int x=0;
                String s="";
                String r=textView.getText().toString();
                while(x<r.length()-1) {
                    s += r.charAt(x);
                    x++;
                }
                s+=v.getTag().toString();
                textView.setText(s);
            }
        });

    }




    public void numberText(View button){
        textView.setText(textView.getText()+button.getTag().toString()+" ");

    }

    public void calcular(View button){
        String s="";
        String r=textView.getText().toString();
        int x=1;
        int m=r.length();
        r+=" ";
        while(x<m) {
            if(r.charAt(x+1)=='.' ||r.charAt(x)=='.' ){
                s+=r.charAt(x);
            }else {
                s += r.charAt(x) + " ";
            }
            x++;
        }
        System.out.println(s);
        textView.setText(sc.calcular(s)+"");
    }
}
