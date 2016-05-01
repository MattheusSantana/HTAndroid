package com.htcursos.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.htcursos.myapplication.R;
import com.htcursos.myapplication.models.Users;
import com.htcursos.myapplication.utils.Constants;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Matheus on 30/04/2016.
 */
public class MainActivity extends AppCompatActivity {
    @Bind(R.id.title)
    TextView title;
   @Bind(R.id.edt_nome)
    EditText nome;
    @Bind(R.id.edt_email)
    EditText email;
    @Bind(R.id.edt_cell)
    EditText cell;


    @Bind(R.id.btn)
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Users user = new Users();
                user.setNome(nome.getText().toString());
                user.setEmail(email.getText().toString());
                user.setCell(cell.getText().toString());
                Intent intent = new Intent(MainActivity.this, BetaActivity.class);
                intent.putExtra(Constants.EXTRA_FOR_B, user);
                startActivity(intent);

            }
        });

    }
}
