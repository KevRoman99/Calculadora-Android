package edu.ejemplo.kevroman.calculadoranueva;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class RestaActivity extends AppCompatActivity implements metodoclick {
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView recyclerView;
    private EditText editText;
    private EditText editText2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        this.editText = (EditText) findViewById(R.id.numero1);
        this.editText2 = (EditText) findViewById(R.id.numero2);
        this.recyclerView = (RecyclerView) findViewById(R.id.recycler);
        button = (Button) findViewById(R.id.botonR);
        this.recyclerAdapter = new RecyclerAdapter(new ArrayList<String>(),this);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setAdapter(recyclerAdapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = Integer.parseInt(editText.getText().toString());
                int numero2 = Integer.parseInt(editText2.getText().toString());

                int resultado = numero - numero2;

                recyclerView.setTextAlignment((int)resultado);
                recyclerAdapter.addListado(String.valueOf(resultado));
                Snackbar.make(view,"Se ha realizado la resta",Snackbar.LENGTH_LONG)
                        .setAction("action",null).show();
            }

        });

    }


    @Override
    public void click(String clicked) {

    }
}
