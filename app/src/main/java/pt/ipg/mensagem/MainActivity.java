package pt.ipg.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviaMensagem(View view) {

        Intent intent = new Intent(this, MostraInfoActivity.class);


        String mensagem = "ola mundo";

        intent.putExtra("MENSAGEM", mensagem);
        startActivity(intent);



        //todo: enviar mensagem
    }
}
