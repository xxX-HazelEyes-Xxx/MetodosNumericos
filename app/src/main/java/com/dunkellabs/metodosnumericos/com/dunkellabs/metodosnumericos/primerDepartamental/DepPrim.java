package com.dunkellabs.metodosnumericos.com.dunkellabs.metodosnumericos.primerDepartamental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dunkellabs.metodosnumericos.R;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)  {
                switch(position){
                    case 0:
                        Intent raizDos = new Intent(DepPrim.this, DepPrimRaizDos.class);
                        startActivity(raizDos);
                        break;

                }


            }
        });
    }
}
