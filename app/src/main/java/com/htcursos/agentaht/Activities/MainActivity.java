package com.htcursos.agentaht.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.htcursos.agentaht.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Matheus on 04/05/2016.
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.title)
    TextView title;
    @Bind(R.id.edt_nome)
    EditText edtNome;

    @Bind(R.id.btn)
    Button btn;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn)
    public void salvar(){
        String nome = edtNome.getText().toString();
        Intent intent = new Intent(MainActivity.this, BetaActivity.class);
        intent.putExtra("nome", nome);
        startActivity(intent);
    }

}
