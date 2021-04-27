package com.demo.carpooling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toolbar;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvDate = findViewById(R.id.tvDate);

        tvDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);

        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textView = findViewById(R.id.tvDate);
        textView.setText(currentDateString);
    }
}