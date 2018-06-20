package kaka.hang.com.leanningenglish.base;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by Admins on 6/20/2018.
 */

public class BaseActivity extends AppCompatActivity {
    @SuppressLint("RestrictedApi")
    @Override
    public void onBackPressed() {
        //lay tat ca cac fragment nam trong
        //activity nay
        List<Fragment>
                fragments =
                getSupportFragmentManager().getFragments();

        if ( fragments != null ) {
            for (Fragment fragment : fragments) {
                if ( fragment != null &&
                        fragment.isVisible() ) {
                    if ( fragment instanceof BaseFragment ) {
                        ((BaseFragment)fragment).onBackPress();
                        return;
                    }
                }
            }
        }
        onBackRoot();
    }

    public final void onBackRoot(){
        super.onBackPressed();
    }
}
