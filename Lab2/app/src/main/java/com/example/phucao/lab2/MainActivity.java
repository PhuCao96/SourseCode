package com.example.phucao.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    Spinner editThumbnail;
    CheckBox Promotion;
    Button Add;
    Thumbnail[] arr ;
    private GridView List;
    private DishAdapter dish_adapter;
    private List<Dish> list_dish;
    private Dish a;
    private int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = (EditText) findViewById(R.id.editName);
        editThumbnail = (Spinner) findViewById(R.id.editThumbnail);
        Promotion = (CheckBox) findViewById(R.id.promotion);
        Add = (Button) findViewById(R.id.Add);
        List = (GridView) findViewById(R.id.list);

        ThumbnailAdapter TNA = new ThumbnailAdapter(this,arr);
        editThumbnail.setAdapter(TNA);

        editThumbnail.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                c = arr[i].getImg();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        dish_adapter = new DishAdapter(this,list_dish);
        List.setAdapter(dish_adapter);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a.setName(editName.getText().toString());
                if(Promotion.isChecked() == true)
                    a.setPro(R.id.image_star);
                a.setImg(c);
                list_dish.add(a);
                dish_adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(),"Added successfully",Toast.LENGTH_SHORT).show();
                editName.setText("");
                Promotion.setChecked(false);

            }
        });
    }
}
