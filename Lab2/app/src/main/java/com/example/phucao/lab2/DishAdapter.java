package com.example.phucao.lab2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class DishAdapter extends BaseAdapter{

    private Context context;
    private List<Dish> list_dish;

    public DishAdapter(Context context, List<Dish> list_dish){
        this.list_dish = list_dish;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list_dish.size() ;
    }

    @Override
    public Object getItem(int i) {
        return list_dish.get(i);
    }

    @Override
    public long getItemId(int i) {
        return list_dish.get(i).getImg();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = View.inflate(context,R.layout.item_dish,null);

        ImageView a = (ImageView) view.findViewById(R.id.image_dish);
        ImageView c = (ImageView) view.findViewById(R.id.image_star);
        TextView e = (TextView) view.findViewById(R.id.name_dish);

        e.setText(list_dish.get(i).getName());
        a.setImageResource(list_dish.get(i).getImg());
        if (list_dish.get(i).getPro() == 1)
            c.setImageResource(R.drawable.ic_promotion);
        return v;
    }
}
