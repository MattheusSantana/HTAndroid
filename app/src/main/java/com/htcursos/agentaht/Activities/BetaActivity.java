package com.htcursos.agentaht.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.htcursos.agentaht.R;

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


    List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beta);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
         bundle.getString("nome");
        list.add(bundle.getString("nome"));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listUser.setAdapter(adapter);
    }

    @OnClick(R.id.bt_back)
    public void sair() {
        finish();
    }
}
