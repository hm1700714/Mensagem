package pt.ipg.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MostraInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_info);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra(App.MENSAGEM);

        TextView textViewMensagem = (TextView) findViewById(R.id.textViewMensagem);
        textViewMensagem.setText(mensagem);


        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();



    }
}
