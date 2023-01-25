package com.example.quizapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.example.quizapp.Admin.AdminCategoryActivity;
import com.example.quizapp.Admin.AdminCategoryAdapter;
import com.example.quizapp.Admin.AdminMainActivity;
import com.example.quizapp.Admin.AdminQuestionsActivity;

public class MainActivity extends AppCompatActivity {
    private TextView title;
    private Button start;
    private Button Admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.main_title);
        start = findViewById(R.id.ma_startB);
        Admin = findViewById(R.id.ma_AdminB);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);
        title.setTypeface(typeface);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(intent);



            }
        });
        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdminMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
