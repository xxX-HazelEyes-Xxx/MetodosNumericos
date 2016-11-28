package com.dunkellabs.metodosnumericos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dunkellabs.metodosnumericos.com.dunkellabs.metodosnumericos.primerDepartamental.DepPrim;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] departamental = new String[] {"Primer Departamental", "Segundo Departamental","Tercer Departamental"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listaPrincipal);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, departamental);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick( AdapterView<?> parent, View view, int position, long id)  {
                switch(position){
                    case 0:
                        Intent primerDep = new Intent(MainActivity.this, DepPrim.class);
                        startActivity(primerDep);
                        break;

                }

            }
        });
       
    }



}
