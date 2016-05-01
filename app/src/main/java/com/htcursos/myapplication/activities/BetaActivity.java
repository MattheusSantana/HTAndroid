package com.htcursos.myapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.htcursos.myapplication.R;
import com.htcursos.myapplication.models.Users;
import com.htcursos.myapplication.utils.Constants;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Matheus on 30/04/2016.
 */
public class BetaActivity extends AppCompatActivity {

    @Bind(R.id.title2)
    TextView title2;

    @Bind(R.id.btn_back)
    Button btnBack;

    private Users user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beta);
        ButterKnife.bind(this);
        if(getIntent()!=null) {
            if(getIntent().getExtras()!= null) {
                if (getIntent().getExtras().containsKey(Constants.EXTRA_FOR_B)) {
                   user = (Users)getIntent().getExtras().getSerializable(Constants.EXTRA_FOR_B);
                }
            }
        }
        if(user!=null){
            title2.setText(String.format("%s\n%s\n%s",user.getNome(), user.getEmail(), user.getCell()));
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
