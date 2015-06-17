package me.andreandyp.samp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class seleccion extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecciona);
    }
    public void botones(View v){
        int m = v.getId();
        Intent accion;
        switch (m){
            case R.id.btn1:
                accion = new Intent(this, estadisticas.class);
                startActivity(accion);
                break;
            case R.id.btn2:
                accion = new Intent(this, estadisticasdel.class);
                startActivity(accion);
                break;
            case R.id.btn3:
                accion = new Intent(this, estadisticassub.class);
                startActivity(accion);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_samp, menu);
        return true;
    }
}
