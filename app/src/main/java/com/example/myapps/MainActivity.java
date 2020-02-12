package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;

public class MainActivity extends AppCompatActivity {
    GoogleSignInClient mGoogleSignInClient;
    EditText txtuser;
    EditText txtpass;
    EditText txtemail;
    Button btnsignin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (txtuser.getText().toString().isEmpty() && txtemail.getText().toString().isEmpty() && txtpass.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "MOHON ISI TERLEBIH DAHULU !", Toast.LENGTH_SHORT).show();
        } else {
            if (txtuser.getText().toString().equals("surya1810") && txtuser.getText().toString().equals("Suryadinarta8@gmail.com") && txtuser.getText().toString().equals("Halim181003")) {
                Toast.makeText(MainActivity.this, "SUCCESS !", Toast.LENGTH_SHORT).show();

                //pindah activity ke kalkulator
                Intent ka = new Intent(MainActivity.this, kalkulator.class);
                startActivity(ka);
            } else {
                Toast.makeText(MainActivity.this, "FALIED !", Toast.LENGTH_SHORT).show();
            }


        }

    getSupportActionBar().hide();

    GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build();

    mGoogleSignInClient = GoogleSignIn.getClient(this, gso);


    findViewById(R.id.sign_in_button).setOnClickListener((View.OnClickListener) this);
}}

