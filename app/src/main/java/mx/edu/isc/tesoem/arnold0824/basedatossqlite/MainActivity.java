package mx.edu.isc.tesoem.arnold0824.basedatossqlite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Lanzar_registro(View v){
        Intent intent = new Intent(this,RegistraActivity.class);
        startActivity(intent);
    }

}
