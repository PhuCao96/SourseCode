package com.example.phucao.lab2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ThumbnailAdapter extends BaseAdapter {

    private Activity activity;
    private Thumbnail[] items;

    public ThumbnailAdapter(Activity activity,Thumbnail[] items){
        this.activity = activity;
        this.items = items;
    }
    @Override
    public int getCount() {
        return items.length;
    }
    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = activity.getLayoutInflater();

        // Đổ dữ liệu vào biến View, view này chính là những gì nằm trong item_name.xml
        view = inflater.inflate(R.layout.item_selected_thumbnail, null);

        TextView tvName = (TextView) view.findViewById(R.id.textThumbnail_selected);

        String a = items[i].getName().toString();
        tvName.setText(a);

        return view;
    }
    @Override
    public View getDropDownView(int i, View view, ViewGroup viewGroup){

        LayoutInflater inflater = activity.getLayoutInflater();
        // Đổ dữ liệu vào biến View, view này chính là những gì nằm trong item_name.xml
        view = inflater.inflate(R.layout.item_thumbnail, null);

        TextView tvName = (TextView) view.findViewById(R.id.Name_Thumbnail);
        ImageView tvImage = (ImageView) view.findViewById(R.id.Image_Thumbnail);

        String a = items[i].getName().toString();
        tvName.setText(a);

        int b = items[i].getImg();
        tvImage.setImageResource(b);

        return view;
    };
}
