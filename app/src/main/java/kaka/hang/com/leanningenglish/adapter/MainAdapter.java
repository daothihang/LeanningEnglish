package kaka.hang.com.leanningenglish.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kaka.hang.com.leanningenglish.R;
import kaka.hang.com.leanningenglish.model.ItemMain;

/**
 * Created by Admins on 6/24/2018.
 */

public class MainAdapter extends BaseAdapter{
    private List<ItemMain> itemMains;
    private  ITopicAdapter inter;
    public MainAdapter(List<ItemMain> itemMains,
                        ITopicAdapter inter) {
        this.itemMains = itemMains;
        this.inter = inter;
    }

    @Override
    public int getCount() {
        if( itemMains == null ){
            return 0;
        }
        return itemMains.size();
    }

    @Override
    public Object getItem(int position) {
        return itemMains.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if ( convertView == null ) {
            LayoutInflater inflater =
                    LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.item_main, parent, false);
        }
        ImageView ivImage = (ImageView)
                convertView.findViewById(R.id.img_main);
        TextView tvName = (TextView)
                convertView.findViewById(R.id.txt_main);
        ItemMain itemMain = itemMains.get(position);
        ivImage.setImageResource(itemMain.getImageResouce());
        tvName.setText(itemMain.getTitle());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inter.openStore(position);
            }
        });
        return convertView;
    }
    public interface ITopicAdapter{
        void openStore(int position);
    }
}
