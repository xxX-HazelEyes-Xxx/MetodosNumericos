package com.dunkellabs.metodosnumericos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DepPrim extends AppCompatActivity {

    ListView listView;

    String[] temas = new String[] {"Raíz de Dos", "Otro Tema","Otro Tema"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep_prim);

        listView = (ListView) findViewById(R.id.listaPrimerDep);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, temas);
        listView.setAdapter(adapter);
    }
}
