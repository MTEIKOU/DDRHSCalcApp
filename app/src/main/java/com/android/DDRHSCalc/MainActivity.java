package com.android.DDRHSCalc;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText editText;

    // キーボード表示を制御するためのオブジェクト
    InputMethodManager inputMethodManager;
    // 背景のレイアウト
    private LinearLayout mainLayout;

    //AlertDialog
    AlertDialog alertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //画面全体のレイアウト
        mainLayout = (LinearLayout)findViewById(R.id.allview);
        //キーボード表示を制御するためのオブジェクト
        inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
    }

    @Override
    public void onBackPressed() {
        alertDialog = new AlertDialog.Builder(MainActivity.this)
                .setTitle("確認")
                .setMessage("終了しますか？")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertDialog.dismiss();
                    }
                }).show();
    }

    // 画面タップ時の処理
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //キーボードを隠す
        inputMethodManager.hideSoftInputFromWindow(mainLayout.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        //背景にフォーカスを移す
        mainLayout.requestFocus();

        return false;
    }

    public void clear(View view) {
        TextView bpm1 = (TextView) findViewById(R.id.bpm1);
        bpm1.setText("");
        TextView bpm2 = (TextView) findViewById(R.id.bpm2);
        bpm2.setText("");

        //キーボードを隠す
        inputMethodManager.hideSoftInputFromWindow(mainLayout.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        //背景にフォーカスを移す
        mainLayout.requestFocus();
    }

    public void calcNum(View view){

        EditText editText1=(EditText)findViewById(R.id.bpm1);
        EditText editText2=(EditText)findViewById(R.id.bpm2);
        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();

        if(editText1.getText().toString().trim().length() == 0){//null判定
            str1= String.valueOf(0);//0代入
        }

        if(editText2.getText().toString().trim().length() == 0){//null判定
            str2= String.valueOf(0);//0代入
        }

       //int bpm1 = Integer.parseInt(str1);
        //int bpm2 = Integer.parseInt(str2);
        double bpm1 = Double.parseDouble(str1);
        double bpm2 = Double.parseDouble(str2);

        //0.25
        TextView textView025m = (TextView)findViewById(R.id.textView025m);
        double result025m = bpm1 * 0.25;
        String str025m = String.valueOf(result025m);
        textView025m.setText(str025m);
        TextView textView025s = (TextView)findViewById(R.id.textView025s);
        double result025s = bpm2 * 0.25;
        String str025s = String.valueOf(result025s);
        textView025s.setText(str025s);

        //0.5
        TextView textView050m = (TextView)findViewById(R.id.textView050m);
        double result050m = bpm1 * 0.5;
        String str050m = String.valueOf(result050m);
        textView050m.setText(str050m);
        TextView textView050s = (TextView)findViewById(R.id.textView050s);
        double result050s = bpm2 * 0.5;
        String str050s = String.valueOf(result050s);
        textView050s.setText(str050s);

        //0.75
        TextView textView075m = (TextView)findViewById(R.id.textView075m);
        double result075m = bpm1 * 0.75;
        String str075m = String.valueOf(result075m);
        textView075m.setText(str075m);
        TextView textView075s = (TextView)findViewById(R.id.textView075s);
        double result075s = bpm2 * 0.75;
        String str075s = String.valueOf(result075s);
        textView075s.setText(str075s);

        //1.00
        TextView textView100m = (TextView)findViewById(R.id.textView100m);
        double result100m = bpm1 * 1.00;
        String str100m = String.valueOf(result100m);
        textView100m.setText(str100m);
        TextView textView100s = (TextView)findViewById(R.id.textView100s);
        double result100s = bpm2 * 1.00;
        String str100s = String.valueOf(result100s);
        textView100s.setText(str100s);

        //1.25
        TextView textView125m = (TextView)findViewById(R.id.textView125m);
        double result125m = bpm1 * 1.25;
        String str125m = String.valueOf(result125m);
        textView125m.setText(str125m);
        TextView textView125s = (TextView)findViewById(R.id.textView125s);
        double result125s = bpm2 * 1.25;
        String str125s = String.valueOf(result125s);
        textView125s.setText(str125s);

        //1.5
        TextView textView150m = (TextView)findViewById(R.id.textView150m);
        double result150m = bpm1 * 1.5;
        String str150m = String.valueOf(result150m);
        textView150m.setText(str150m);
        TextView textView150s = (TextView)findViewById(R.id.textView150s);
        double result150s = bpm2 * 1.5;
        String str150s = String.valueOf(result150s);
        textView150s.setText(str150s);

        //1.75
        TextView textView175m = (TextView)findViewById(R.id.textView175m);
        double result175m = bpm1 * 1.75;
        String str175m = String.valueOf(result175m);
        textView175m.setText(str175m);
        TextView textView175s = (TextView)findViewById(R.id.textView175s);
        double result175s = bpm2 * 1.75;
        String str175s = String.valueOf(result175s);
        textView175s.setText(str175s);

        //2.0
        TextView textView200m = (TextView)findViewById(R.id.textView200m);
        double result200m = bpm1 * 2.00;
        String str200m = String.valueOf(result200m);
        textView200m.setText(str200m);
        TextView textView200s = (TextView)findViewById(R.id.textView200s);
        double result200s = bpm2 * 2.00;
        String str200s = String.valueOf(result200s);
        textView200s.setText(str200s);

        //2.25
        TextView textView225m = (TextView)findViewById(R.id.textView225m);
        double result225m = bpm1 * 2.25;
        String str225m = String.valueOf(result225m);
        textView225m.setText(str225m);
        TextView textView225s = (TextView)findViewById(R.id.textView225s);
        double result225s = bpm2 * 2.25;
        String str225s = String.valueOf(result225s);
        textView225s.setText(str225s);

        //2.5
        TextView textView250m = (TextView)findViewById(R.id.textView250m);
        double result250m = bpm1 * 2.50;
        String str250m = String.valueOf(result250m);
        textView250m.setText(str250m);
        TextView textView250s = (TextView)findViewById(R.id.textView250s);
        double result250s = bpm2 * 2.50;
        String str250s = String.valueOf(result250s);
        textView250s.setText(str250s);

        //2.75
        TextView textView275m = (TextView)findViewById(R.id.textView275m);
        double result275m = bpm1 * 2.75;
        String str275m = String.valueOf(result275m);
        textView275m.setText(str275m);
        TextView textView275s = (TextView)findViewById(R.id.textView275s);
        double result275s = bpm2 * 2.75;
        String str275s = String.valueOf(result275s);
        textView275s.setText(str275s);

        //3.0
        TextView textView300m = (TextView)findViewById(R.id.textView300m);
        double result300m = bpm1 * 3.00;
        String str300m = String.valueOf(result300m);
        textView300m.setText(str300m);
        TextView textView300s = (TextView)findViewById(R.id.textView300s);
        double result300s = bpm2 * 3.00;
        String str300s = String.valueOf(result300s);
        textView300s.setText(str300s);

        //3.25
        TextView textView325m = (TextView)findViewById(R.id.textView325m);
        double result325m = bpm1 * 3.25;
        String str325m = String.valueOf(result325m);
        textView325m.setText(str325m);
        TextView textView325s = (TextView)findViewById(R.id.textView325s);
        double result325s = bpm2 * 3.25;
        String str325s = String.valueOf(result325s);
        textView325s.setText(str325s);

        //3.5
        TextView textView350m = (TextView)findViewById(R.id.textView350m);
        double result350m = bpm1 * 3.5;
        String str350m = String.valueOf(result350m);
        textView350m.setText(str350m);
        TextView textView350s = (TextView)findViewById(R.id.textView350s);
        double result350s = bpm2 * 3.5;
        String str350s = String.valueOf(result350s);
        textView350s.setText(str350s);

        //3.75
        TextView textView375m = (TextView)findViewById(R.id.textView375m);
        double result375m = bpm1 * 3.75;
        String str375m = String.valueOf(result375m);
        textView375m.setText(str375m);
        TextView textView375s = (TextView)findViewById(R.id.textView375s);
        double result375s = bpm2 * 3.75;
        String str375s = String.valueOf(result375s);
        textView375s.setText(str375s);

        //4.0
        TextView textView400m = (TextView)findViewById(R.id.textView400m);
        double result400m = bpm1 * 4.00;
        String str400m = String.valueOf(result400m);
        textView400m.setText(str400m);
        TextView textView400s = (TextView)findViewById(R.id.textView400s);
        double result400s = bpm2 * 4.00;
        String str400s = String.valueOf(result400s);
        textView400s.setText(str400s);

        //4.5
        TextView textView450m = (TextView)findViewById(R.id.textView450m);
        double result450m = bpm1 * 4.5;
        String str450m = String.valueOf(result450m);
        textView450m.setText(str450m);
        TextView textView450s = (TextView)findViewById(R.id.textView450s);
        double result450s = bpm2 * 4.5;
        String str450s = String.valueOf(result450s);
        textView450s.setText(str450s);

        //5.0
        TextView textView500m = (TextView)findViewById(R.id.textView500m);
        double result500m = bpm1 * 5.00;
        String str500m = String.valueOf(result500m);
        textView500m.setText(str500m);
        TextView textView500s = (TextView)findViewById(R.id.textView500s);
        double result500s = bpm2 * 5.00;
        String str500s = String.valueOf(result500s);
        textView500s.setText(str500s);

        //5.5
        TextView textView550m = (TextView)findViewById(R.id.textView550m);
        double result550m = bpm1 * 5.5;
        String str550m = String.valueOf(result550m);
        textView550m.setText(str550m);
        TextView textView550s = (TextView)findViewById(R.id.textView550s);
        double result550s = bpm2 * 5.5;
        String str550s = String.valueOf(result550s);
        textView550s.setText(str550s);

        //6.0
        TextView textView600m = (TextView)findViewById(R.id.textView600m);
        double result600m = bpm1 * 6.00;
        String str600m = String.valueOf(result600m);
        textView600m.setText(str600m);
        TextView textView600s = (TextView)findViewById(R.id.textView600s);
        double result600s = bpm2 * 6.00;
        String str600s = String.valueOf(result600s);
        textView600s.setText(str600s);

        //6.5
        TextView textView650m = (TextView)findViewById(R.id.textView650m);
        double result650m = bpm1 * 6.5;
        String str650m = String.valueOf(result650m);
        textView650m.setText(str650m);
        TextView textView650s = (TextView)findViewById(R.id.textView650s);
        double result650s = bpm2 * 6.5;
        String str650s = String.valueOf(result650s);
        textView650s.setText(str650s);

        //7.0
        TextView textView700m = (TextView)findViewById(R.id.textView700m);
        double result700m = bpm1 * 7.0;
        String str700m = String.valueOf(result700m);
        textView700m.setText(str700m);
        TextView textView700s = (TextView)findViewById(R.id.textView700s);
        double result700s = bpm2 * 7.0;
        String str700s = String.valueOf(result700s);
        textView700s.setText(str700s);

        //7.5
        TextView textView750m = (TextView)findViewById(R.id.textView750m);
        double result750m = bpm1 * 7.5;
        String str750m = String.valueOf(result750m);
        textView750m.setText(str750m);
        TextView textView750s = (TextView)findViewById(R.id.textView750s);
        double result750s = bpm2 * 7.5;
        String str750s = String.valueOf(result750s);
        textView750s.setText(str750s);

        //8.0
        TextView textView800m = (TextView)findViewById(R.id.textView800m);
        double result800m = bpm1 * 8.0;
        String str800m = String.valueOf(result800m);
        textView800m.setText(str800m);
        TextView textView800s = (TextView)findViewById(R.id.textView800s);
        double result800s = bpm2 * 8.0;
        String str800s = String.valueOf(result800s);
        textView800s.setText(str800s);

        //キーボードを隠す
        inputMethodManager.hideSoftInputFromWindow(mainLayout.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        //背景にフォーカスを移す
        mainLayout.requestFocus();
    }
}
