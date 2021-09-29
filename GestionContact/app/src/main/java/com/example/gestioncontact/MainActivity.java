package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //declaration
    Button btn_valide , btn_quitter ;
    EditText ed_name ,ed_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// reception
        btn_quitter = findViewById(R.id.btn_quitter_auth);
        btn_valide = findViewById(R.id.btn_valider_auth);
        ed_name= findViewById(R.id.ed_name_auth);
        ed_password= findViewById(R.id.ed_password_auth);

        btn_quitter.setOnClickListener(this);
        btn_valide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view==btn_quitter){
            this.finish();
        }
        if(view==btn_valide){
            String name = ed_name.getText().toString();
            String password = ed_password.getText().toString();
            if(name.equals("issat") && password.equals("0000")){
               Intent New_A = new Intent(this,Acceuil.class);
               startActivity(New_A);
            }else{
                Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            }


        }

    }
}