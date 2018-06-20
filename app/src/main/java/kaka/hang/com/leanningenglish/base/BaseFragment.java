package kaka.hang.com.leanningenglish.base;

import android.support.v4.app.Fragment;

/**
 * Created by Admins on 6/20/2018.
 */

public class BaseFragment extends Fragment{

    public void onBackPress(){
        if ( getActivity() instanceof BaseActivity) {
            ((BaseActivity)getActivity())
                    .onBackRoot();
        }
    }
}
