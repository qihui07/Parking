package com.qihui.parking;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ThirdFragment extends Fragment {

    private TextView mTextMessage;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, null);
//        mTextMessage = view.findViewById(R.id.content);
//        mTextMessage.setText("页面三");
        return view;
    }

}
