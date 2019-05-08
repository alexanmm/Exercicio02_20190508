package br.com.digitalhouse.exercicio02_20190508;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Valide os campos nome e email quando o usuário clicar no botão enviar, caso algum dos campos
    //esteja vazio mostre uma mensagem com o componente Toast informando o campo que deve ser preenchido.
    //Ex: "Preencha o campo e-mail"
    //
    //Caso todos os campos estejam preenchidos mostre uma mensagem com o componente Toast "Dados OK"

    private TextView textViewNome;
    private TextView textViewEmail;
    private TextView textViewEndereco;
    private TextView textViewProfissao;
    private TextView botaoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNome = findViewById(R.id.editTextNome);
        textViewEmail = findViewById(R.id.editTextEmail);
        textViewEndereco = findViewById(R.id.editTextEndereco);
        textViewProfissao = findViewById(R.id.editTextProfissao);
        botaoEnviar = findViewById(R.id.botaoEnviar);

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (validarDados()) { // Dados validados com sucesso
                    Toast.makeText(MainActivity.this, "Dados Ok", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public boolean validarDados() {

        String nome = textViewNome.getText().toString();
        String email = textViewEmail.getText().toString();
        String endereco = textViewEndereco.getText().toString();
        String profissao = textViewProfissao.getText().toString();

        if (nome.equals("")) {
            Toast.makeText(MainActivity.this, "Preencha o campo nome", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (email.equals("")) {
            Toast.makeText(MainActivity.this, "Preencha o campo e-mail", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (endereco.equals("")) {
            Toast.makeText(MainActivity.this, "Preencha o campo endereco", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (profissao.equals("")) {
            Toast.makeText(MainActivity.this, "Preencha o campo profissão", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

}
