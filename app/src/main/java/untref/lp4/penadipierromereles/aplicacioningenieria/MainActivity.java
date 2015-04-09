package untref.lp4.penadipierromereles.aplicacioningenieria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    /* defino la variable de tipo Button cuyo nombre es el ID del boton definido en la interfaz*/
    private Button btnComputacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Conecto el comportamiento de la variable con el boton de la interfaz*/
        btnComputacion = (Button)findViewById(R.id.btnComputacion);

        //Evento de CLick del boton: COMPLETAR Y DOCUMENTAR!!!!
        btnComputacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creo el intent para acceder a la Activity de Computacion
                Intent intent = new Intent(MainActivity.this, ComputacionActivity.class);

                //Inicio la nueva Activity
                startActivity(intent);
            }
        });

    }

}
