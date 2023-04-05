package fcu.app.listviewapphw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvFoods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFoods = findViewById(R.id.lv_foods);

        List<FoodItem> lsFoods = new ArrayList<FoodItem>();
        lsFoods.add(new FoodItem(R.drawable.food_01, "Burger", 50));
        lsFoods.add(new FoodItem(R.drawable.food_02, "Omlette", 35));
        lsFoods.add(new FoodItem(R.drawable.food_03, "Chicken", 80));
        lsFoods.add(new FoodItem(R.drawable.food_04, "Sandwich", 60));
        lsFoods.add(new FoodItem(R.drawable.food_05, "Rice", 45));
        lsFoods.add(new FoodItem(R.drawable.food_06, "Coke", 30));

        ListViewAdapter adapter = new ListViewAdapter(this, lsFoods);
        lvFoods.setAdapter(adapter);



    }
}