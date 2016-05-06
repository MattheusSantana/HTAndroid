package com.htcursos.agentaht.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.htcursos.DataBase.DataBase;
import com.htcursos.adapter.UserListAdapter;
import com.htcursos.agentaht.R;
import com.htcursos.agentaht.models.Agenda;
import com.htcursos.agentaht.models.User;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Matheus on 04/05/2016.
 */
public class BetaActivity extends AppCompatActivity {


    @Bind(R.id.bt_back)
    Button btnBack;

    @Bind(R.id.list_user)
    ListView listUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beta);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        //Capturando dados do Bundle da tela anterior.
        String nome = bundle.getString("nome");
        String email = bundle.getString("email");
        String telefone = bundle.getString("telefone");

        //Instanciando um nome usuario com os dados do bundle.
        User user = new User();
        user.setImagem(R.drawable.user_image);
        user.setNome(nome);
        user.setTelefone(telefone);
        user.setEmail(email);

        //Instanciando um objeto db.
        DataBase db = new DataBase(this);

        //Salvando o usuario.
        db.salvar(user);
        //Listando os usuarios.
        UserListAdapter adapter = new UserListAdapter(this, db.buscarTodos());
        listUser.setAdapter(adapter);
    }

    @OnClick(R.id.bt_back)
    public void sair() {
        finish();
    }
}
