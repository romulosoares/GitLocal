package com.example.labmovel.f54u;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AdicionarUrl extends AppCompatActivity {

    private EditText et;
    private Button button;
    private RadioGroup rg;
    private RadioButton rb;
    private String tempo;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_url);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        rg = (RadioGroup) findViewById(R.id.rg_url);
        button = (Button) findViewById(R.id.b_F5);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                et = (EditText) findViewById(R.id.et_url); //url digitada
                url = et.getText().toString(); //guarda valor da url

                //recupera o valor do tempo
                int idRg = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(idRg);
                tempo = rb.getText().toString(); //guarda valor do tempo

                Toast.makeText(AdicionarUrl.this, url, Toast.LENGTH_SHORT).show();

//                switch (idRg) {
//
//                    case (R.id.rb_15min):
//                        tempo = 15;
//                        break;
//                    case (R.id.rb_30min):
//                        tempo = 30;
//                        break;
//                    case (R.id.rb_1h):
//                        tempo = 60;
//                        break;
//                    case (R.id.rb_2h):
//                        tempo = 120;
//                        break;
//                    case (R.id.rb_6h):
//                        tempo = 360;
//                        break;
//                    case (R.id.rb_12h):
//                        tempo = 720;
//                        break;
                //}
            }

        });
    }
}



