package kaka.hang.com.leanningenglish;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kaka.hang.com.leanningenglish.fragment.DetailCaterogyFragment;
import kaka.hang.com.leanningenglish.fragment.Gui;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
       addFragmentGui();
    }

    private String tex = "";

    public void addFragmentGui() {
        Gui fragmentMain = new Gui();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.content, fragmentMain, Gui.class.getName());
        transaction.commit();
    }

    public void addFragmentActivityCaterogyNews() {
        DetailCaterogyFragment detailCaterogyFragment = new DetailCaterogyFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Bundle bundle = new Bundle();
        bundle.putString("NAME", tex);
        detailCaterogyFragment.setArguments(bundle);
        transaction.replace(R.id.content, detailCaterogyFragment, DetailCaterogyFragment.class.getName());
        transaction.addToBackStack(null);
        transaction.commit();

    }

    public void openStore(String title) {
        if (title == "Nhạc English") {

        }
        if (title == "Đọc báo") {
            addFragmentActivityCaterogyNews();

        }
        if (title == "Ngữ pháp") {

        }
        if (title == "Từ vựng") {

        }
        if (title == "Game") {

        }
    }


}
