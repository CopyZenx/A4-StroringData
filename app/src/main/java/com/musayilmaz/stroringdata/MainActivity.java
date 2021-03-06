package com.musayilmaz.stroringdata;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.musayilmaz.stroringdata", Context.MODE_PRIVATE);

        int age = 40;

        //sharedPreferences.edit().putInt("userAge", age).apply();

        int savedAge = sharedPreferences.getInt("userAge",0);

        System.out.println("saved value" + savedAge);

        age = 10;

        sharedPreferences.edit().putInt("userAge", age).apply();

        int savedAge2 = sharedPreferences.getInt("userAge", age);

        System.out.println("saved value" + savedAge2);

        sharedPreferences.edit().remove("userAge").apply();

        int savedAge3 = sharedPreferences.getInt("userAge", 0);

        System.out.println("saved value" + savedAge3);


    }
}
