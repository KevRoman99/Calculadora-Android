package edu.ejemplo.kevroman.calculadoranueva;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class SumaActivity extends AppCompatActivity implements metodoclick {
    private EditText editText;
    private EditText editText2;
    private Button button;
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);


        this.editText = (EditText) findViewById(R.id.numero1);
        this.editText2 = (EditText) findViewById(R.id.numero2);
        this.recyclerView = (RecyclerView)findViewById(R.id.recycler);
        button = (Button) findViewById(R.id.boton);
        this.recyclerAdapter = new RecyclerAdapter(new ArrayList<String>(),this);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setAdapter(recyclerAdapter);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(editText.getText().toString());
                int valor2 = Integer.parseInt(editText2.getText().toString());

                int resultado = valor1 + valor2;
                recyclerView.setTextAlignment((int) resultado);

                recyclerAdapter.addListado(String.valueOf(resultado));

                Snackbar.make(view,"Se ha realizado la suma",Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show();
            }

        });


    }



    @Override
    public void click(String clicked) {

    }
}