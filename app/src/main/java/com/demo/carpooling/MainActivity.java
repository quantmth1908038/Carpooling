package com.demo.carpooling;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity{
    TextView tvDate;
    private int mDate,mMonth,mYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tvDate = findViewById(R.id.tvDate);
//
//        tvDate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Calendar Cal = Calendar.getInstance();
//
//                mDate = Cal.get(Calendar.DATE);
//                mMonth = Cal.get(Calendar.MONTH);
//                mYear = Cal.get(Calendar.YEAR);
//
//                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, android.R.style.Theme_DeviceDefault_Dialog, new DatePickerDialog.OnDateSetListener() {
//                    @Override
//
//                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                        Calendar c = Calendar.getInstance();
//                        c.set(Calendar.YEAR,year);
//                        c.set(Calendar.MONTH, month);
//                        c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
//                        String current = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
//                        tvDate.setText(current);
//                    }
//                }, mYear,mMonth,mDate);
//                    datePickerDialog.show();
//            }
//        });

    }

}