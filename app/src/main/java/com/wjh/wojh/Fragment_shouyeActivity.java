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

import com.wjh.wojh.R;
import com.youth.banner.Banner;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zykj on 2017/5/18.
 */

public class Fragment_shouyeActivity extends Fragment {

    @Bind(R.id.chengshi)
    TextView chengshi;
    @Bind(R.id.ll_sousuo)
    LinearLayout llSousuo;
    @Bind(R.id.banner)
    Banner banner;
    @Bind(R.id.wodetuandui_tv)
    TextView wodetuanduiTv;
    @Bind(R.id.hongbaozhongxin_tv)
    TextView hongbaozhongxinTv;
    @Bind(R.id.jiangpinzhongxin_tv)
    TextView jiangpinzhongxinTv;
    @Bind(R.id.meishi_img)
    ImageView meishiImg;
    @Bind(R.id.rencai_img)
    ImageView rencaiImg;
    @Bind(R.id.jiudian_img)
    ImageView jiudianImg;
    @Bind(R.id.gongzuo_img)
    ImageView gongzuoImg;
    @Bind(R.id.dongdong_img)
    ImageView dongdongImg;
    @Bind(R.id.fangzi_img)
    ImageView fangziImg;
    @Bind(R.id.huodong_img)
    ImageView huodongImg;
    @Bind(R.id.shangpu_img)
    ImageView shangpuImg;
    @Bind(R.id.gengduo_img)
    ImageView gengduoImg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_shouye, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.chengshi, R.id.ll_sousuo, R.id.wodetuandui_tv, R.id.hongbaozhongxin_tv, R.id.jiangpinzhongxin_tv, R.id.meishi_img, R.id.rencai_img, R.id.jiudian_img, R.id.gongzuo_img, R.id.dongdong_img, R.id.fangzi_img, R.id.huodong_img, R.id.shangpu_img, R.id.gengduo_img})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.chengshi:
                break;
            case R.id.ll_sousuo:

                break;
            case R.id.wodetuandui_tv:
                break;
            case R.id.hongbaozhongxin_tv:
                break;
            case R.id.jiangpinzhongxin_tv:
                break;
            case R.id.meishi_img:
                break;
            case R.id.rencai_img:
                break;
            case R.id.jiudian_img:
                break;
            case R.id.gongzuo_img:
                break;
            case R.id.dongdong_img:
                break;
            case R.id.fangzi_img:
                break;
            case R.id.huodong_img:
                break;
            case R.id.shangpu_img:
                break;
            case R.id.gengduo_img:
                break;
        }
    }
}
