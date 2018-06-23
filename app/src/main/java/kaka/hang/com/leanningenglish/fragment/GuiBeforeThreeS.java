package kaka.hang.com.leanningenglish.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kaka.hang.com.leanningenglish.R;
import kaka.hang.com.leanningenglish.base.BaseFragment;

/**
 * Created by Admins on 6/20/2018.
 */

public class GuiBeforeThreeS extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gui_before_three_s,
                container, false);
        return view;

    }
}
