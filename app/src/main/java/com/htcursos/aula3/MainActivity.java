package com.htcursos.aula3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Matheus on 23/04/2016.
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.texto)
    TextView texto;

    @Bind(R.id.resultado)
    TextView resultado;

    @Bind(R.id.bt1)
    Button bt1;

    @Bind(R.id.bt2)
    Button bt2;

    @Bind(R.id.bt3)
    Button bt3;

    @Bind(R.id.bt4)
    Button bt4;

    @Bind(R.id.bt5)
    Button bt5;

    @Bind(R.id.bt6)
    Button bt6;

    @Bind(R.id.bt7)
    Button bt7;

    @Bind(R.id.bt8)
    Button bt8;

    @Bind(R.id.bt9)
    Button bt9;

    @Bind(R.id.bt0)
    Button bt0;

    @Bind(R.id.bt_multiplicacao)
    Button btMultiplicacao;

    @Bind(R.id.bt_subtracao)
    Button btSubtracao;

    @Bind(R.id.bt_dividir)
    Button btDividir;

    @Bind(R.id.bt_soma)
    Button btSoma;

    @Bind(R.id.bt_igual)
    Button btIgual;

    @Bind(R.id.bt_virgula)
    Button btVirgula;

    @Bind(R.id.bt_del)
    Button btDel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.bt_del)
    public void click(){
        texto.setText("");

    }


    public void txt(String valor){

        texto.setText(texto.getText()+""+valor);

    }

    @OnClick(R.id.bt1)
    public void bt1(){
        txt("1");
    }

    @OnClick(R.id.bt2)
    public void bt2(){
        txt("2");

    }

    @OnClick(R.id.bt3)
    public void bt3(){
        txt("3");

    }

    @OnClick(R.id.bt4)
    public void bt4(){
        txt("4");

    }

    @OnClick(R.id.bt5)
    public void bt5(){
        txt("5");
    }


    @OnClick(R.id.bt6)
    public void bt6(){
        txt("6");
    }


    @OnClick(R.id.bt7)
    public void bt7(){
        txt("7");

    }


    @OnClick(R.id.bt8)
    public void bt8(){
        txt("8");
    }


    @OnClick(R.id.bt9)
    public void bt9(){
        txt("9");
    }


    @OnClick(R.id.bt0)
    public void bt0(){
        txt("0");
    }


    @OnClick(R.id.bt_virgula)
    public void btVirgula(){
        txt(",");
    }


    @OnClick(R.id.bt_soma)
    public void btSoma(){
        txt("+");

    }


    @OnClick(R.id.bt_dividir)
    public void btDividir(){
        txt("÷");


    }


    @OnClick(R.id.bt_subtracao)
    public void btSubtracao(){
        txt("-");
    }


    @OnClick(R.id.bt_multiplicacao)
    public void btMultiplicacao(){
        txt("x");
    }

}
