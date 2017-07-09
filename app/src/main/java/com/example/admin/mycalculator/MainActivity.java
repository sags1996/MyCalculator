package com.example.admin.mycalculator;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    double result=0.0;
    int id1=0;
    int id=0;
    /*boolean add;
    boolean sub;
    boolean multiply;
    boolean divide;
    boolean perc;
    boolean pm;*/
    Button plusminus;
    Button plus;
    Button minus;
    Button div;
    Button mul;
    Button dot;
    Button clear;
    Button mod;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button equal;
     TextView t;
    //String num;
    //String num1;



    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusminus=(Button)findViewById(R.id.plusMinus);
        plus=(Button)findViewById(R.id.plus);
         minus=(Button)findViewById(R.id.minus);
         div=(Button)findViewById(R.id.divide);
        mul=(Button)findViewById(R.id.multiply);
         dot=(Button)findViewById(R.id.dot);
         clear=(Button)findViewById(R.id.clear);
       mod=(Button)findViewById(R.id.Mod);
         one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
         three=(Button)findViewById(R.id.three);
      four=(Button)findViewById(R.id.four);
         five=(Button)findViewById(R.id.five);
         six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
      eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
      zero=(Button)findViewById(R.id.zero);
        equal=(Button)findViewById(R.id.equals);
      t=(TextView)findViewById(R.id.textView);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        clear.setOnClickListener(this);
        dot.setOnClickListener(this);
        plus.setOnClickListener(this);
        equal.setOnClickListener(this);
        minus.setOnClickListener(this);
        plusminus.setOnClickListener(this);
        mod.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //num="";

        id=v.getId();
        if(id==R.id.one){
          t.setText(t.getText()+"1");
        }
        if(id==R.id.two){
            t.setText(t.getText()+"2");
        }
         if(id==R.id.three){

             t.setText(t.getText()+"3");
        }
         if(id==R.id.four)  {
             t.setText(t.getText()+"4");
         }
         if(id==R.id.five){
             t.setText(t.getText()+"5");
         }
         if(id==R.id.six){
             t.setText(t.getText()+"6");
         }
         if(id==R.id.seven){
             t.setText(t.getText()+"7");

         }
         if(id==R.id.eight){

             t.setText(t.getText()+"8");
         }
         if(id==R.id.nine){
             t.setText(t.getText()+"9");
         }
         if(id==R.id.zero){
             t.setText(t.getText()+"0");
         }
         if(id==R.id.clear){
             t.setText("");
             result=0.0;

         }
         if(id==R.id.dot){
             t.setText(t.getText()+".");
         }
         if(id==R.id.plus){
         if(id1==R.id.plus){
             add();
         }
         else if(id1==R.id.minus){
             sub();
         }
         else if(id1==R.id.multiply){
             mul();
         }
         else if(id1==R.id.divide){
             div();
         }
         else{

             result=Double.parseDouble(t.getText().toString());

         }
         id1=R.id.plus;
         }
         if(id==R.id.minus){
             if(id1==R.id.plus){
                 add();
             }
             else if(id1==R.id.minus){
                 sub();
             }
             else if(id1==R.id.multiply){
                 mul();
             }
             else if(id1==R.id.divide){
                 div();
             }
             else{
                 result=Double.parseDouble(t.getText().toString());
             }
             id1=R.id.minus;
         }
         if(id==R.id.multiply){
             if(id1==R.id.plus){
                 add();
             }
             else if(id1==R.id.minus){
                 sub();
             }
             else if(id1==R.id.multiply){
                 mul();
             }
             else if(id1==R.id.divide){
                 div();
             }
             else{
                 result=Double.parseDouble(t.getText().toString());
             }
             id1=R.id.multiply;
            /* id1=id;
             if(result==0){
                 result=Double.parseDouble(t.getText().toString())*(result+1);
             }
             else{
                 result=result*Double.parseDouble(t.getText().toString());
             }*/
           /*  sub=false;
             add=false;
             multiply=true;
             divide=false;
             perc=false;
             pm=false;*/
            // t.setText("");

         }
         if(id==R.id.divide){
             if(id1==R.id.plus){
                 add();
             }
             else if(id1==R.id.minus){
                 sub();
             }
             else if(id1==R.id.multiply){
                 mul();
             }
             else if(id1==R.id.divide) {
                 div();
             }else{
                 result=Double.parseDouble(t.getText().toString());
             }
             id1=R.id.divide;
            /* id1=id;
             if(result==0){
                 result=Double.parseDouble(t.getText().toString())/(result+1);
             }
             else{
                 result=result/Double.parseDouble(t.getText().toString());
             }*/
           /*  sub=false;
             add=false;
             multiply=false;
             divide=true;
             perc=false;
             pm=false;*/
            // t.setText("");

         }
         if(id==R.id.plusMinus){
             //id1=id;
             result=-1*Double.parseDouble(t.getText().toString());
             t.setText(""+result);
             result=0.0;

         }
         if(id==R.id.Mod){
             result=Double.parseDouble(t.getText().toString())/100;
             t.setText(""+result);
             result=0.0;
         }

        if(id==R.id.equals){
             if(id1==R.id.plus) {
                 Double d= Double.parseDouble(t.getText().toString());
                 d=d+result;
                 t.setText(""+ d);
                 d = 0.0;
                 result=0.0;
                 //add=false;
             }
            else if(id1==R.id.minus){
                 Double d1=Double.parseDouble(t.getText().toString());
                 d1=result-d1;
                 t.setText(""+d1);
                 d1=0.0;
                 result=0.0;
                // sub=false;
             }
           else  if(id1==R.id.multiply){
                 Double d2=Double.parseDouble(t.getText().toString());
                 d2=d2*result;
                 t.setText(""+d2);
                 d2=0.0;
                 result=0.0;
                // multiply=false;
             }
            else if(id1==R.id.divide){
                 Double d3=Double.parseDouble(t.getText().toString());
                 d3=result/d3;
                 t.setText(""+d3);
                 d3=0.0;
                result=0.0;
                 //divide=false;
             }
             else{
                 Double d4=Double.parseDouble((t.getText().toString()));
                 t.setText(""+d4);
                 d4=0.0;
                 result=0.0;
             }



         }

         }
         public void add(){
             result=result+Double.parseDouble(t.getText().toString());
             id1=id;
             t.setText("");
         }
         public void sub(){
             id1=id;
             if(result==0){
                 result=Double.parseDouble(t.getText().toString());}
             else{
                 result=result-Double.parseDouble(t.getText().toString());
             }
             t.setText("");

         }
         public void mul(){
             id1=id;
             if(result==0){
                 result=Double.parseDouble(t.getText().toString())*(result+1);
             }
             else{
                 result=result*Double.parseDouble(t.getText().toString());
             }

             t.setText("");

         }
         public void div(){
             id1=id;
             if(result==0){
                 result=Double.parseDouble(t.getText().toString())/(result+1);
             }
             else{
                 result=result/Double.parseDouble(t.getText().toString());
             }
             t.setText("");
         }

    }

