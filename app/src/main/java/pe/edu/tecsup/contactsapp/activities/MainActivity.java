package pe.edu.tecsup.contactsapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import pe.edu.tecsup.contactsapp.R;
import pe.edu.tecsup.contactsapp.adapters.PersonAdapter;
import pe.edu.tecsup.contactsapp.repositories.PersonRepository;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  //de que manera se van a alinear los item de forma lineal

        PersonAdapter personAdapter = new PersonAdapter();
        personAdapter.setPeople(PersonRepository.getList());

        recyclerView.setAdapter(personAdapter);

    }
}
