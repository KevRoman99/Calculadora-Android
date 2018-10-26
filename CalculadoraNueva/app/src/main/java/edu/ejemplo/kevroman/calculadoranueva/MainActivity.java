package edu.ejemplo.kevroman.calculadoranueva;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements metodoclick {

    private TextView textView;
    private TextView textViewR;
    private TextView textViewM;
    private TextView textViewD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.suma);
        TextView textViewR = (TextView)findViewById(R.id.resta);
        TextView textViewM = (TextView)findViewById(R.id.multiplicacion);
        TextView textViewD = (TextView)findViewById(R.id.division);
        //this.textView = (TextView) findViewById(R.id.suma);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("edu.ejemplo.kevroman.calculadoranueva.SumaActivity");
                startActivity (intent);
            }
        });
        textViewR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentR = new Intent("edu.ejemplo.kevroman.calculadoranueva.RestaActivity");
                startActivity(intentR);
            }
        });
        textViewM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentM = new Intent("edu.ejemplo.kevroman.calculadoranueva.MultiplicacionActivity");
                startActivity(intentM);
            }
        });
        textViewD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentD = new Intent("edu.ejemplo.kevroman.calculadoranueva.DividirActivity");
                startActivity(intentD);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void click(String clicked) {

    }
}

