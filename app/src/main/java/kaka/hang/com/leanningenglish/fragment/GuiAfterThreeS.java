package kaka.hang.com.leanningenglish.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kaka.hang.com.leanningenglish.MainActivity;
import kaka.hang.com.leanningenglish.R;
import kaka.hang.com.leanningenglish.adapter.MainAdapter;
import kaka.hang.com.leanningenglish.base.BaseFragment;
import kaka.hang.com.leanningenglish.model.ItemMain;

/**
 * Created by Admins on 6/21/2018.
 */

public class GuiAfterThreeS extends BaseFragment implements MainAdapter.ITopicAdapter{
    private List<ItemMain> itemMains;
    private ListView lvMain;
    private MainAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.gui_after_three_s,container,false);
        inits(view);
        return view;
    }
    private void inits(View view) {
        itemMains = new ArrayList<>();
        itemMains.add(new ItemMain(R.drawable.english,
                "Ngữ pháp"));
        itemMains.add(new ItemMain(R.drawable.english,
                "Từ vựng"));
        itemMains.add(new ItemMain(R.drawable.english,
                "Nhạc English"));
        itemMains.add(new ItemMain(R.drawable.english,
                "Đọc báo"));
        itemMains.add(new ItemMain(R.drawable.english,
                "Game"));

        lvMain = (ListView) view.findViewById(R.id.lv_main);
        adapter = new MainAdapter(itemMains, this);
        lvMain.setAdapter(adapter);
    }

    @Override
    public void openStore(int position) {
        ((MainActivity) getActivity()).openStore(
                itemMains.get(position).getTitle()
        );

    }


}
