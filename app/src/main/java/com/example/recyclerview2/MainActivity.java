package com.example.recyclerview2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
//    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<MainModel> recycleViewList;
    private RecyclerAdapter mAdapter;
    private int[] avatar = new int[]
            {
                    R.drawable.abaac_first_img,
                    R.drawable.abaac_first_img,
                    R.drawable.abaac_first_img,
                    R.drawable.abaac_first_img,
                    R.drawable.abaac_first_img,
                    R.drawable.abaac_first_img,
                    R.drawable.abaac_first_img,
                    R.drawable.abaac_first_img
            };
    private String[] title = new String[]
            {
                    "Bike",
                    "Benz",
                    "Car",
                    "Carrera",
                    "Ferrari",
                    "Harly",
                    "Lamborghini",
                    "Silver"
            };
    private String[] message = new String[]
            {
                    "Hello there,what's up?",
                    "Coucou",
                    "I miss you, ou know...",
                    "When you coming, to Boston?",
                    "100K USD bro", "Really!!!",
                    "Let's go race!!!",
                    "Lmfaoo!!"
            };
    private String[] sentAt = new String[]
            {
                    "10:34 AM",
                    "1035 AM",
                    "11:06 AM",
                    "11:24 AM",
                    "11:27 AM",
                    "11:45 AM",
                    "12:00 PM",
                    "12:46 PM"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);


        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        // recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        recycleViewList = populatedList();
        mAdapter = new RecyclerAdapter(recycleViewList);
        recyclerView.setAdapter(mAdapter);
    }

    private ArrayList<MainModel> populatedList() {
        ArrayList<MainModel> mainList = new ArrayList<>();
        for (int i = 0; i<8; i++){
            MainModel model = new MainModel();
            //model.setAvatar(avatar[i]);
            model.setTitle(title[i]);
            model.setMessage(message[i]);
            model.setSentAt(sentAt[i]);
            mainList.add(model);
        }
        return mainList;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
