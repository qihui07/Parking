package com.qihui.parking;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private FrameLayout mainFrame;
    MainFragment firstFragment;
    SecondFragment secondFragment;
    ThirdFragment thirdFragment;


    FragmentManager fragmentManager = getFragmentManager();
    FragmentTransaction transaction;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
//                   mTextMessage.setText(R.string.title_home);
                    transaction = fragmentManager. beginTransaction();
                    transaction.replace(R.id.main_frame, new MainFragment(),"main");
                    transaction.commit();

                    //getFragmentManager().beginTransaction().add(R.id.main_frame,new MainFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
                    transaction = fragmentManager. beginTransaction();
                    transaction.replace(R.id.main_frame, new SecondFragment(),"second");
                    transaction.commit();
                    //getFragmentManager().beginTransaction().add(R.id.main_frame,new SecondFragment()).commit();
                    return true;
                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
                    transaction = fragmentManager. beginTransaction();
                    transaction.replace(R.id.main_frame, new ThirdFragment(),"third");
                    transaction.commit();

                    //getFragmentManager().beginTransaction().add(R.id.main_frame,new ThirdFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        mainFrame = (FrameLayout) findViewById(R.id.main_frame);

        transaction = fragmentManager. beginTransaction();
        transaction.replace(R.id.main_frame, new MainFragment(),"main");
        transaction.commit();
        //getFragmentManager().beginTransaction().add(R.id.main_frame,new MainFragment()).commit();
        //transaction.commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
