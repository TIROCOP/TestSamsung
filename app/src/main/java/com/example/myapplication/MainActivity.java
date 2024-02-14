package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.domain.Person;
import com.example.myapplication.domain.Pets;
import com.example.myapplication.recycler.DoggyAdapter;
import com.example.myapplication.view.PersonAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private ActivityMainBinding binding;
    public Person[] arr;

    public List<Pets> baseList;
    private List<Pets> petsList1;
    private List<Pets> petsList2;
    private List<Pets> petsList3;
    private List<Pets> petsList4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DoggyAdapter adapter = new DoggyAdapter(baseList);
        binding.rvList.setAdapter(adapter);


//
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("Иван", "88005553535", petsList1));
//        personList.add(new Person("Василий", "88005553535", petsList2));
//        personList.add(new Person("Кеша", "88005553535", petsList3));
//        personList.add(new Person("Дур-Бек", "88005553535", petsList4));

        ListView lv = (ListView)findViewById(R.id.lv_person);
        PersonAdapter adapter2 = new PersonAdapter(this, arrMaker());
        lv.setAdapter(adapter2);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    baseList = petsList1;
                    DoggyAdapter adapter = new DoggyAdapter(baseList);
                    binding.rvList.setAdapter(adapter);

                } else if (position == 1){
                    baseList = petsList2;
                    DoggyAdapter adapter = new DoggyAdapter(baseList);
                    binding.rvList.setAdapter(adapter);

                } else if (position == 2){
                    baseList = petsList3;
                    DoggyAdapter adapter = new DoggyAdapter(baseList);
                    binding.rvList.setAdapter(adapter);

                } else if (position == 3){
                    baseList = petsList4;
                    DoggyAdapter adapter = new DoggyAdapter(baseList);
                    binding.rvList.setAdapter(adapter);

                }


            }
        });


    }


    public Person[] arrMaker() {
        arr = new Person[4];
        arr[0] = new Person("Иван", "88005553535", petsList1);
        arr[1] = new Person("Василий", "88005553535", petsList2);
        arr[2] = new Person("Кеша", "88005553535", petsList3);
        arr[3] = new Person("Akrey", "88005553535", petsList4);
        return arr;
    }

    public void init() {
        petsList1 = new ArrayList<>();
        petsList1.add(new Pets("name1", "imgUrl", "breed"));
        petsList1.add(new Pets("name1", "imgUrl", "breed"));
        petsList1.add(new Pets("name1", "imgUrl", "breed"));
        baseList = petsList1;
        petsList2 = new ArrayList<>();
        petsList2.add(new Pets("name2", "imgUrl", "breed"));
        petsList2.add(new Pets("name2", "imgUrl", "breed"));
        petsList2.add(new Pets("name2", "imgUrl", "breed"));
        petsList2.add(new Pets("name2", "imgUrl", "breed"));
        petsList2.add(new Pets("name2", "imgUrl", "breed"));
        petsList3 = new ArrayList<>();
        petsList3.add(new Pets("name3", "imgUrl", "breed"));
        petsList3.add(new Pets("name3", "imgUrl", "breed"));
        petsList4 = new ArrayList<>();
        petsList4.add(new Pets("name4", "imgUrl", "breed"));


    }
}