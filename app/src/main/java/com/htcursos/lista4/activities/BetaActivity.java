package com.htcursos.lista4.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.htcursos.lista4.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Matheus on 06/05/2016.
 */
public class BetaActivity extends AppCompatActivity {

    @Bind(R.id.txt_text)
    TextView texto;

    @Bind(R.id.bt_voltar)
    Button btVoltar;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beta);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String nome = "Nome: "+bundle.getString("nome");
        String cargo = "Cargo: "+bundle.getString("cargo");
        String salario = "Sálario com Descontos: "+ String.valueOf(bundle.getDouble("salario"));
        texto.setText(String.format("%s\n%s\n%s", nome, cargo, salario));

    }

    @OnClick(R.id.bt_voltar)
    public void voltar(){
        finish();
    }
}
