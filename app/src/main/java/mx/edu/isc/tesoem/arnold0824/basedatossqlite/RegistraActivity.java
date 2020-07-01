package mx.edu.isc.tesoem.arnold0824.basedatossqlite;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import mx.edu.isc.tesoem.arnold0824.basedatossqlite.BaseDatos.DatosConexion;

public class RegistraActivity extends AppCompatActivity {
    EditText txtnombre, txtedad, txtsexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registra);
        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
        txtsexo = findViewById(R.id.txtsexo);

    }

    public void  registra_registo(View v){
        ContentValues contentValues = new ContentValues();
        DatosConexion datosConexion = new DatosConexion(this);
        datosConexion.open();

        contentValues.put("nombre",txtnombre.getText().toString());
        contentValues.put("edad",txtedad.getText().toString());
        contentValues.put("sexo",txtsexo.getText().toString());

        if (datosConexion.insertar(contentValues)){
            Toast.makeText(this, "Se Registro Correctamente", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "No se pudo Grabar", Toast.LENGTH_SHORT).show();
        }
        datosConexion.close();

    }
}
