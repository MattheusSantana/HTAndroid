package com.htcursos.aula3;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
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

    double[] vetor = new double[2];
    double result = 0;
    boolean soma = false;
    boolean sub = false;
    boolean div = false;
    boolean mult = false;
    boolean virg = false;
    boolean resultado = false;

    @Bind(R.id.texto)
    TextView texto;

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
    public void click() {
        texto.setText("");
        if(resultado == true){
            result = 0;
        }

    }


    public void txt(String valor) {
        texto.setText(texto.getText() + "" + valor);
        if (soma == true || sub == true || div == true || mult == true) {
            vetor[1] = Double.parseDouble(texto.getText().toString());
        }

    }


    @OnClick(R.id.bt1)
    public void bt1() {
        txt("1");

    }

    @OnClick(R.id.bt2)
    public void bt2() {
        txt("2");

    }

    @OnClick(R.id.bt3)
    public void bt3() {
        txt("3");

    }

    @OnClick(R.id.bt4)
    public void bt4() {
        txt("4");

    }

    @OnClick(R.id.bt5)
    public void bt5() {
        txt("5");

    }


    @OnClick(R.id.bt6)
    public void bt6() {
        txt("6");

    }


    @OnClick(R.id.bt7)
    public void bt7() {
        txt("7");


    }


    @OnClick(R.id.bt8)
    public void bt8() {
        txt("8");

    }


    @OnClick(R.id.bt9)
    public void bt9() {
        txt("9");

    }


    @OnClick(R.id.bt0)
    public void bt0() {
        txt("0");

    }


    @OnClick(R.id.bt_virgula)
    public void btVirgula() {
        txt(".");
        virg = true;
        if (virg == true) {
            return;
        }

    }


    @OnClick(R.id.bt_soma)
    public void btSoma() {
        try{
            if (texto.getText()== ""){
                btSoma.setEnabled(false);
            }

        vetor[0] = Double.parseDouble(texto.getText().toString());
        texto.setText("");
        soma = true;
        virg = false;
    }catch (Exception e){
        texto.setText("");
    }

    }


    @OnClick(R.id.bt_dividir)
    public void btDividir() {
        try {
            if (texto.getText()== ""){
                btDividir.setEnabled(false);
            }
            vetor[0] = Double.parseDouble(texto.getText().toString());
            texto.setText("");
            div = true;
            virg = false;
        }catch (Exception e){
            texto.setText("");
        }
    }


    @OnClick(R.id.bt_subtracao)
    public void btSubtracao() {
        try{
            if (texto.getText()== ""){
                btSubtracao.setEnabled(false);
            }
        vetor[0] = Double.parseDouble(texto.getText().toString());
        texto.setText("");
        sub = true;
        virg = false;
        }catch (Exception e){
            texto.setText("");
        }

    }


    @OnClick(R.id.bt_multiplicacao)
    public void btMultiplicacao() {
        try{
            if (texto.getText()== ""){
                btMultiplicacao.setEnabled(false);
            }
        vetor[0] = Double.parseDouble(texto.getText().toString());
        texto.setText("");
        mult = true;
        virg = false;
        }catch (Exception e){
            texto.setText("");
        }


    }

    @OnClick(R.id.bt_igual)
    public void btResultado() {
        resultado = true;

        if (soma == true) {
            result = vetor[0] + vetor[1];
        } else if (sub == true) {
            result = vetor[0] - vetor[1];
        } else if (div == true) {
            result = vetor[0] / vetor[1];
        } else if (mult == true) {
            result = vetor[0] * vetor[1];
        }

        texto.setText(String.valueOf(result));

        soma = false;
        sub = false;
        div = false;
        mult = false;
        virg = false;
        vetor[0]= 0;
        vetor[1]=0;

    }
}