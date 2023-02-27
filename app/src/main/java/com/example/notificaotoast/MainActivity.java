package com.example.notificaotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void abrirToast(View view){
        //Forma com que de mais liberdade para criar notificação
        ImageView imagem = new ImageView (getApplicationContext());
        imagem.setImageResource(android.R.drawable.star_big_off);

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.color.purple_200);
        textView.setText("Olá Toast");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(toast.LENGTH_LONG);
        //toast.setView( imagem );
        toast.setView(textView);
        toast.show();

        //Forma fácil de notificação
/*        Toast.makeText(
                getApplicationContext(),
                "Ação realizada com sucesso!",
                Toast.LENGTH_SHORT
        ).show();*/
    }


}