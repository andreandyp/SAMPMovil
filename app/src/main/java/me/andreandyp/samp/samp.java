package me.andreandyp.samp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class samp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samp);
    }
    public void ingreso(View v){
        Button b = (Button) findViewById(R.id.btn1);
        EditText txt1 = (EditText) findViewById(R.id.txt1);
        EditText txt2 = (EditText) findViewById(R.id.txt2);
        if(txt1.getText().toString().equals("IMSS") && txt2.getText().toString().equals("huehuehue")) {
            if (v == b) {
                Intent envia = new Intent(this, seleccion.class);
                finish();
                startActivity(envia);
            }
        }
        else {
            txt1.setText("");
            txt2.setText("");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_samp, menu);
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
}
