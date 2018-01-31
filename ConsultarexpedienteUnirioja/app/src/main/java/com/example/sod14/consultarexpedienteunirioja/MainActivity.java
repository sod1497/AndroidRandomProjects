package com.example.sod14.consultarexpedienteunirioja;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sod14.consultarexpedienteunirioja.Persistence.DataStorage;
import com.example.sod14.consultarexpedienteunirioja.gen.Expedientes;
import com.example.sod14.consultarexpedienteunirioja.gen.ExpedientesService;
import com.example.sod14.consultarexpedienteunirioja.gen.GetCalificacionesResponse;
import com.example.sod14.consultarexpedienteunirioja.gen.SecurityToken;

public class MainActivity extends AppCompatActivity {

    Button bSignIn;
    EditText etUser;
    EditText etPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSignIn = findViewById(R.id.bSignIn);
        etUser = findViewById(R.id.etCuasi);
        etPwd = findViewById(R.id.etPwd);

    }

    public void signIn(View view)
    {
        if(etUser.getText().length()!=0&&etPwd.getText().length()!=0)
        {
            new AsyncTask<Void,Void,Void>()
            {
                @Override
                protected void onPostExecute(Void aVoid) {
                    super.onPostExecute(aVoid);

                    if(DataStorage.getInstance().isCorrect())
                    {
                        Intent intent;
                    }

                }

                @Override
                protected Void doInBackground(Void... voids) {
                    ExpedientesService expedientesService = new ExpedientesService();
                    Expedientes expedientes=expedientesService.getExpedientesPort();


                    SecurityToken securityToken2 = new SecurityToken();
                    securityToken2.setUsername(etUser.getText().toString()); securityToken2.setPasswd(etPwd.getText().toString());
                    DataStorage.getInstance().setGetCalificacionesResponse(expedientes.getCalificaciones(null, securityToken2));
                    DataStorage.getInstance().setGetAsignaturasMatriculaConImporteResponse(expedientes.getAsignaturasMatriculaConImporte(null,securityToken2));
                    DataStorage.getInstance().setGetAsignaturasMatriculaResponse(expedientes.getAsignaturasMatricula(null,securityToken2));
                    DataStorage.getInstance().setGetTitulacionesResponse(expedientes.getTitulaciones(null,securityToken2));

                    DataStorage.getInstance().setCorrect(true);

                    return null;
                }
            }.execute();
        }
        else{
            Toast.makeText(this,"Introduce usuario y contraseña",Toast.LENGTH_SHORT).show();
        }
    }
}
