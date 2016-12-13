package jonass.meuportifolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import info.hoang8f.widget.FButton;

public class MainActivity extends AppCompatActivity {

    private FButton fbFilmes;
    private FButton fbStock;
    private FButton fbMaior;
    private FButton fbMaterial;
    private FButton fbOnipresente;
    private FButton fbCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carregaComponentes();

        fbFilmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Este botão iniciará o app " +
                                fbFilmes.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        fbStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Este botão iniciará o app " +
                                fbStock.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        fbMaior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Este botão iniciará o app " +
                                fbMaior.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        fbMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Este botão iniciará o app " +
                                fbMaterial.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        fbOnipresente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Este botão iniciará o app " +
                                fbOnipresente.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        fbCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Este botão iniciará o app " +
                                fbCapstone.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void carregaComponentes() {
        fbFilmes = (FButton) findViewById(R.id.fb_filmes);
        fbStock = (FButton) findViewById(R.id.fb_stock);
        fbMaior = (FButton) findViewById(R.id.fb_maior);
        fbMaterial = (FButton) findViewById(R.id.fb_material);
        fbOnipresente = (FButton) findViewById(R.id.fb_onipresente);
        fbCapstone = (FButton) findViewById(R.id.fb_capstone);
    }
}
