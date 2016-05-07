package com.htcursos.lista4.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.htcursos.lista4.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Matheus on 06/05/2016.
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.edt_nome)
    EditText nome;

    @Bind(R.id.edt_cargo)
    EditText cargo;

    @Bind(R.id.edt_salario)
    EditText salario;

    @Bind(R.id.bt_calcular)
    Button calcular;

    double novosalario =0;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.bt_calcular)
    public void calcular() {
        if (nome.getText().toString().equals("") || salario.getText().toString().equals("") || cargo.getText().toString().equals("")) {
            Toast.makeText(this, "Por Favor Preencha todos os campos!", Toast.LENGTH_SHORT).show();
        } else {

            novosalario = 0.9 * Double.parseDouble(salario.getText().toString());

            Intent intent = new Intent(MainActivity.this, BetaActivity.class);
            intent.putExtra("nome", nome.getText().toString());
            intent.putExtra("cargo", cargo.getText().toString());
            intent.putExtra("salario", novosalario);
            startActivity(intent);

            nome.setText("");
            cargo.setText("");
            salario.setText("");
        }
    }

}
