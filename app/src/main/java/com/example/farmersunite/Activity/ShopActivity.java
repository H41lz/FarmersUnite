package com.example.farmersunite.Activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.farmersunite.Adapter.CategoryAdapter;
import com.example.farmersunite.Adapter.TopProductsAdapter;
import com.example.farmersunite.Domain.CategoryDomain;
import com.example.farmersunite.Domain.ItemsDomain;
import com.example.farmersunite.R;

import java.util.ArrayList;


public class ShopActivity extends AppCompatActivity {
private RecyclerView.Adapter catAdapter, bestDealAdapter;
private RecyclerView recyclerViewCat, recyclerViewBestDeal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shop);

        initRecyclerviewCat();
        initLocation();
        initRecyclerViewBestDeal();
    }

    private void initLocation() {
        String[] items=new String[]{"Baguio City, Philippines"};
        final Spinner locationSpin=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        locationSpin.setAdapter(adapter);
    }

    private void initRecyclerviewCat() {
        ArrayList<CategoryDomain> items=new ArrayList<>();
        items.add(new CategoryDomain("cat1","Vegetables"));
        items.add(new CategoryDomain("cat2","Fruit"));
        items.add(new CategoryDomain("cat3","Dairy"));
        items.add(new CategoryDomain("cat4","Drinks"));
        items.add(new CategoryDomain("cat5","Grain"));

        recyclerViewCat=findViewById(R.id.catView);
        recyclerViewCat.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        catAdapter=new CategoryAdapter(items);
        recyclerViewCat.setAdapter(catAdapter);

    }
    public void initRecyclerViewBestDeal(){
        recyclerViewBestDeal=findViewById(R.id.bestView);
        recyclerViewBestDeal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        bestDealAdapter=new TopProductsAdapter(getData());
        recyclerViewBestDeal.setAdapter(bestDealAdapter);
    }

    public ArrayList<ItemsDomain> getData(){
        ArrayList<ItemsDomain>items = new ArrayList<>();
        items.add(new ItemsDomain("orange", 4.2, "Fresh Orange", 6.2, "Fresh pick from the field"));
        items.add(new ItemsDomain("apple", 12, "Fresh Apple", 6, "Ripe Apples"));
        items.add(new ItemsDomain("watermelon", 14, "Fresh Watermelon", 14, "Freshly grown"));
        items.add(new ItemsDomain("berry", 6, "Fresh Berry", 4, "Home grown berry"));
        items.add(new ItemsDomain("pineapple", 7, "Fresh Pineapple", 13, "Sweet and Riped pineapple"));
        items.add(new ItemsDomain("strawberry", 8, "Fresh Strawberry", 10, "Fresh pick from the farm"));
        return items;
    }
}