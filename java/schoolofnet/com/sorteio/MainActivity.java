package schoolofnet.com.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Carregue o botão com o id btnSorteio para a variável btnSorteio
        Button btnSorteio = findViewById(R.id.btnSorteio);
        // Carregar o texto
        final TextView resultadoTXT = findViewById(R.id.resultadoTXT);

        btnSorteio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Isso é um TOAST", Toast.LENGTH_LONG).show();
                Random rd = new Random();
                // Gero um número aleatório
                Number numero = rd.nextInt(100);
                // Carrego esse número no meu texto
                resultadoTXT.setText(numero.toString());
            }
        });

    }
}
