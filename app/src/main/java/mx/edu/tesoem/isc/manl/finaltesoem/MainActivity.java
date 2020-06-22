package mx.edu.tesoem.isc.manl.finaltesoem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

EditText txtmatricula, txtnombre, txtcorreo, txtpromediof, txtjson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmatricula = findViewById(R.id.lblMatricula);
        txtnombre = findViewById(R.id.lblNombre);
        txtcorreo = findViewById(R.id.lblCorreo);
        txtpromediof = findViewById(R.id.lblPromedio);
        txtjson = findViewById(R.id.txtJson);
    }
    public void GrabarJson(View v){

        AllDatos dato = new AllDatos();
        Gson gson = new Gson();

        txtjson.setText(gson.toJson(dato));



        dato.setMatricula(txtmatricula.getText().toString());
        dato.setNombre(txtnombre.getText().toString());
        dato.setCorreo(txtcorreo.getText().toString());
        dato.setPromediof(txtpromediof.getText().toString());
        dato.setJson(txtjson.getText().toString());

    }
}
