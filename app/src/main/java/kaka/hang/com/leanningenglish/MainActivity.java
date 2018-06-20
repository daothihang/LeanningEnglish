package kaka.hang.com.leanningenglish;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    addFragmentGuiBeforeThreeS();
                    sleep(3000);
                    Thread background=new Thread(){
                        @Override
                        public void run() {
                            //addFragmentMainAfter();
                        }
                    };
                    background.start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();

    }

    public void addFragmentGuiBeforeThreeS(){
        GuiBeforeThreeS fragmentMain = new GuiBeforeThreeS();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.content, fragmentMain, GuiBeforeThreeS.class.getName());
        transaction.commit();
    }
}
