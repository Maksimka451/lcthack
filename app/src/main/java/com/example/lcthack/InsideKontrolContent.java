package com.example.lcthack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class InsideKontrolContent extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_kontrol_content);

        Button sign_out_kontrol;
        sign_out_kontrol = (Button)findViewById(R.id.sign_out_kontrol);

        sign_out_kontrol.setOnClickListener(view -> signOut());

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser == null){
            startActivity(new Intent(InsideKontrolContent.this, Login.class));
        }
    }



    private void signOut() {
        mAuth.signOut();
        Intent intent = new Intent(InsideKontrolContent.this, Signinoptions.class);
        startActivity(intent);
    }
}