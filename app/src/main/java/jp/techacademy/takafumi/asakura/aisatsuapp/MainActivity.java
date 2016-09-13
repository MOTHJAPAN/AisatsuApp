package jp.techacademy.takafumi.asakura.aisatsuapp;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            showTimePickerDialog() ;
        if  (v.getId() == R.id.button2) {


        }


        }
    }


    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Log.d("UI-PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));

                        //ここでIF等設定
                        if (18 <= hourOfDay){
                            mTextView.setText("こんばんわ");

                        }
                        else if (10 <= hourOfDay){
                            mTextView.setText("こんにちは");

                        }
                        else if(2 <= hourOfDay){
                            mTextView.setText("おはよう");

                        }

                    }
                },



                1, // 初期値（時間）
                0,  // 初期値（分）
                true);
        timePickerDialog.show();
    }

}






