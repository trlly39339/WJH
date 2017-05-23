package com.wjh.wojh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/5/18.
 */

public class Fragment_fabuActivity extends Fragment {

    @Bind(R.id.chengshi)
    TextView chengshi;
    @Bind(R.id.ll_fameishi)
    LinearLayout llFameishi;
    @Bind(R.id.ll_farencai)
    LinearLayout llFarencai;
    @Bind(R.id.ll_fajiudian)
    LinearLayout llFajiudian;
    @Bind(R.id.ll_fagongzuo)
    LinearLayout llFagongzuo;
    @Bind(R.id.ll_fadongdog)
    LinearLayout llFadongdog;
    @Bind(R.id.ll_fafangzi)
    LinearLayout llFafangzi;
    @Bind(R.id.ll_fahuodong)
    LinearLayout llFahuodong;
    @Bind(R.id.ll_fashangpu)
    LinearLayout llFashangpu;
    @Bind(R.id.imageView)
    ImageView imageView;
    @Bind(R.id.ll_fahongbao)
    LinearLayout llFahongbao;
    @Bind(R.id.ll_fajiangpin)
    LinearLayout llFajiangpin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_fabu, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.ll_fameishi, R.id.ll_farencai, R.id.ll_fajiudian, R.id.ll_fagongzuo, R.id.ll_fadongdog, R.id.ll_fafangzi, R.id.ll_fahuodong, R.id.ll_fashangpu, R.id.ll_fahongbao, R.id.ll_fajiangpin})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_fameishi:
                break;
            case R.id.ll_farencai:
                break;
            case R.id.ll_fajiudian:
                break;
            case R.id.ll_fagongzuo:
                break;
            case R.id.ll_fadongdog:
                break;
            case R.id.ll_fafangzi:
                break;
            case R.id.ll_fahuodong:
                break;
            case R.id.ll_fashangpu:
                break;
            case R.id.ll_fahongbao:
                break;
            case R.id.ll_fajiangpin:
                break;
        }
    }
}
