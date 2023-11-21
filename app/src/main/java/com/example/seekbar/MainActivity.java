package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // atribuição dos inputs
    SeekBar seekBar;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // entrada de dados
        seekBar = findViewById(R.id.seekBar);
        txtResultado = findViewById(R.id.txtResultado);

        //chamar metodo lister do seekBar
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //onProgress
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //clica e avança
                //txtResultado.setText("Você está ... ");
                //progress é variável
                txtResultado.setText("Meu estágio de Felicidade é: " + progress + "/" + seekBar.getMax());

            }
            //onStart
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //escolha
                //txtResultado.setText("Você está ... ");
            }
            //onStop
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //parada
                //txtResultado.setText("Só vale ser FELIZ!");
            }
        });


        }

        //Recuperação
        public void recuperarProgresso(View v) {
            txtResultado.setText("Seu estágio de Felicidade foi: " + seekBar.getProgress());

    }
}