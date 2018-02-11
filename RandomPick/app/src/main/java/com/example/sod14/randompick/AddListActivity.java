package com.example.sod14.randompick;

import android.content.Intent;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.sod14.randompick.Logic.ElementList;
import com.example.sod14.randompick.Logic.ElementListManager;
import com.example.sod14.randompick.Persistence.ActiveData;

import java.util.List;

public class AddListActivity extends AppCompatActivity {

    private ActiveData activeData;
    private ElementListManager manager;

    //If it's null, it's a new list. Else we are editing an existing list.
    private ElementList<String> elementList;

    private EditText etName, etDescription;
    private ImageView imageView;
    private Button bAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list);
        etName = findViewById(R.id.etName);
        etDescription = findViewById(R.id.etDescription);
        imageView = findViewById(R.id.imageView);
        bAccept = findViewById(R.id.bAdd);

        activeData = ActiveData.getInstance();
        manager = activeData.getManager();

        if (getIntent().hasExtra(Intent.EXTRA_TEXT)) {
            String elementListName = getIntent().getStringExtra(Intent.EXTRA_TEXT);

            List<ElementList<String>> lists = manager.getLists();
            int a = 0;
            while (a < lists.size()) {
                if (lists.get(a).getName().equals(elementListName)) break;
                a++;
            }

            elementList = lists.get(a);
            etName.setText(elementList.getName());
            etDescription.setText(elementList.getDescription());
            bAccept.setText(R.string.edit_list);
            bAccept.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bEditClic(v);
                }
            });
            setTitle(R.string.edit_list);
        }


    }

    public void bAcceptClic(View view) {
        Snackbar mySnackbar = Snackbar.make(view, R.string.add_name_description, BaseTransientBottomBar.LENGTH_SHORT);
        Snackbar mySnackbar2 = Snackbar.make(view, R.string.already_exists, BaseTransientBottomBar.LENGTH_SHORT);

        if (etName.getText().toString().length() == 0 || etDescription.getText().toString().length() == 0) {
            mySnackbar.show();
        } else {
            ElementList<String> newElement = new ElementList<>();
            newElement.setName(etName.getText().toString());
            newElement.setDescription(etDescription.getText().toString());
            newElement.setColor(imageView.getSolidColor());

            if (!manager.addList(newElement)) {
                mySnackbar2.show();
            } else {
                finish();
            }
        }
    }

    public void bEditClic(View view) {
        Snackbar mySnackbar = Snackbar.make(view, R.string.add_name_description, BaseTransientBottomBar.LENGTH_SHORT);
        Snackbar mySnackbar2 = Snackbar.make(view, R.string.already_exists, BaseTransientBottomBar.LENGTH_SHORT);

        if (etName.getText().toString().length() == 0 || etDescription.getText().toString().length() == 0) {
            mySnackbar.show();
        } else {
            try {
                ElementList<String> newElement = (ElementList<String>) elementList.clone();
                newElement.setName(etName.getText().toString());
                newElement.setDescription(etDescription.getText().toString());
                newElement.setColor(imageView.getSolidColor());

                if (!manager.addList(newElement)) {
                    mySnackbar2.show();
                } else {
                    manager.deleteList(elementList);
                    finish();
                }
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}
