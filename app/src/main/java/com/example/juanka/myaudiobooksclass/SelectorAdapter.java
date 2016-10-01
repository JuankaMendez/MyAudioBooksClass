package com.example.juanka.myaudiobooksclass;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.juanka.myaudiobooksclass.modelo.BookInfo;

import java.util.List;

/**
 * Created by Juanka on 15/09/2016.
 */
public class  SelectorAdapter extends BaseAdapter {
    List<BookInfo> _lst;

    public SelectorAdapter(List<BookInfo> lst) {
        this._lst = lst;
    }

    @Override
    public int getCount() {
        return _lst.size();
    }

    @Override
    public Object getItem(int i) {
        return _lst.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView1;
        TextView titulo;
        BookInfo itemBook = _lst.get(position);
        View viewItem =laya
    }


}


