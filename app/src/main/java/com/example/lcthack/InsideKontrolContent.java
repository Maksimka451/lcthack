package com.example.lcthack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class InsideKontrolContent extends AppCompatActivity {

    private FirebaseAuth mAuth;
    public ItemControlBanner descriptionData;


    TextView date, kno, type, time, theme, email, id;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_kontrol_content);


        mAuth = FirebaseAuth.getInstance();

        date = findViewById(R.id.textView31);
        kno = findViewById(R.id.textView32);
        type = findViewById(R.id.textView33);
        time = findViewById(R.id.textView34);
        theme = findViewById(R.id.textView35);
        email = findViewById(R.id.textView36);
        id = findViewById(R.id.textView37);


        final DatabaseReference Rootref;
        Rootref = FirebaseDatabase.getInstance().getReference();

        Rootref.child("Consulting").child("Department").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                descriptionData = snapshot.getValue(ItemControlBanner.class);
                if (  descriptionData.getTypeofcontrol() == null || descriptionData.getKno() == null || descriptionData.getThemeofconsulting() == null || descriptionData.getDate() == null || descriptionData.getTime() == null || descriptionData.getUseremail() == null || descriptionData.getUserid() == null) {
                    Toast.makeText(InsideKontrolContent.this, "Error", Toast.LENGTH_SHORT).show();
                } else {
                    date.setText(descriptionData.getDate());
                    kno.setText(descriptionData.getKno());
                    time.setText(descriptionData.getTime());
                    type.setText(descriptionData.getTypeofcontrol());
                    theme.setText(descriptionData.getThemeofconsulting());
                    email.setText(descriptionData.getUseremail());
                    id.setText(descriptionData.getUserid());
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


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