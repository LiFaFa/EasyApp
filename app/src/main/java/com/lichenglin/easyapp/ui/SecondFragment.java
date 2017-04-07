package com.lichenglin.easyapp.ui;/**
 * Created by dell on 2017/4/5/0005.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lichenglin.easyapp.R;
import com.lichenglin.easyapp.base.BaseFragment;


/**
 * created by LiChengalin at 2017/4/5/0005
 */
public class SecondFragment extends BaseFragment {

    public static SecondFragment newInstance() {

        Bundle bundle = new Bundle();

        SecondFragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }
}
