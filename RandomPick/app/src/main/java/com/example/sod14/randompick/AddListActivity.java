package com.example.sod14.randompick;

import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.sod14.randompick.Logic.ElementList;
import com.example.sod14.randompick.Logic.ElementListManager;
import com.example.sod14.randompick.Persistence.ActiveData;

public class AddListActivity extends AppCompatActivity {

    private ActiveData activeData;
    private ElementListManager manager;

    private EditText etName, etDescription;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list);
        etName=findViewById(R.id.etName);
        etDescription=findViewById(R.id.etDescription);
        imageView = findViewById(R.id.imageView);


        activeData = ActiveData.getInstance();
        manager = activeData.getManager();

    }

    public void bAcceptClic(View view)
    {
        Snackbar mySnackbar = Snackbar.make(view, "Añade un nombre y descripción", BaseTransientBottomBar.LENGTH_SHORT);
        Snackbar mySnackbar2 = Snackbar.make(view, "Ya existe una lista con este nombre", BaseTransientBottomBar.LENGTH_SHORT);

        if(etName.getText().toString().length()==0||etDescription.getText().toString().length()==0)
        {
            mySnackbar.show();
        }
        else{
            ElementList<String> newElement = new ElementList<>();
            newElement.setName(etName.getText().toString());
            newElement.setDescription(etDescription.getText().toString());
            newElement.setColor(imageView.getSolidColor());

            if(!manager.addList(newElement)){
                mySnackbar2.show();
            }
            else{
                finish();
            }
        }
    }
}
