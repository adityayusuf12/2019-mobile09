package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSuperHero = findViewById(R.id.rvSuperHero);
        SuperHero hero = new SuperHero("Petruk");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);
        //membuat object hero baru
        hero = new SuperHero("Gareng");
        //menambahkan hero baru ke listSuperhero
        listSuperHero.add(hero);
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);

        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
