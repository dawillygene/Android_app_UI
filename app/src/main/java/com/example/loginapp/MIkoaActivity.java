package com.example.loginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MIkoaActivity extends AppCompatActivity {

    Button btnArusha,btnMwanza,btnDodoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mikoa);
        replaceFragment(new HomeFragment());

        btnArusha=findViewById(R.id.arusha);
        btnMwanza = findViewById(R.id.mwanza);
        btnDodoma = findViewById(R.id.dodoma);

btnArusha.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        replaceFragment(new HomeFragment());
    }
});
        btnMwanza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new ProfileFragment());
            }
        });

        btnDodoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new SettingsFragment());
            }
        });


    }


    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mikoaFramelayout,fragment);
        fragmentTransaction.commit();
    }



}