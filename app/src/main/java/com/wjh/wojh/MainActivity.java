package com.wjh.wojh;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends FragmentActivity {

    @Bind(R.id.vp)
    ViewPager vp;
    @Bind(R.id.shouye_img)
    ImageView shouyeImg;
    @Bind(R.id.shouye_tv)
    TextView shouyeTv;
    @Bind(R.id.ll_shouye)
    LinearLayout llShouye;
    @Bind(R.id.fabu_img)
    ImageView fabuImg;
    @Bind(R.id.fabu_tv)
    TextView fabuTv;
    @Bind(R.id.ll_fabu)
    LinearLayout llFabu;
    @Bind(R.id.wo_img)
    ImageView woImg;
    @Bind(R.id.wo_tv)
    TextView woTv;
    @Bind(R.id.ll_wo)
    LinearLayout llWo;
    @Bind(R.id.activity_main)
    LinearLayout activityMain;
    //    主页创建集合 储存fragment
    private List<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //        添加首页fragment
        list.add(new Fragment_shouyeActivity());
        //        添加发布fragment
        list.add(new Fragment_fabuActivity());
        //        添加我fragment
        list.add(new Fragment_woActivity());
        Fragment_Adaper adaper = new Fragment_Adaper(getSupportFragmentManager(), list);
        vp.setAdapter(adaper);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        shouyeImg.setImageResource(R.mipmap.shouye_lan);
                        shouyeTv.setTextColor(Color.parseColor("#1BA9D2"));
                        //                发布变暗
                        fabuImg.setImageResource(R.mipmap.fabu);
                        fabuTv.setTextColor(Color.parseColor("#979797"));
                        //                我变暗
                        woImg.setImageResource(R.mipmap.gerenzhongxin);
                        woTv.setTextColor(Color.parseColor("#979797"));
                        break;
                    case 1:
                        shouyeImg.setImageResource(R.mipmap.shouye);
                        shouyeTv.setTextColor(Color.parseColor("#979797"));
                        //                发布变亮
                        fabuImg.setImageResource(R.mipmap.fabu_lan);
                        fabuTv.setTextColor(Color.parseColor("#1BA9D2"));
                        //                我变暗
                        woImg.setImageResource(R.mipmap.gerenzhongxin);
                        woTv.setTextColor(Color.parseColor("#979797"));
                        break;
                    case 2:
                        shouyeImg.setImageResource(R.mipmap.shouye);
                        shouyeTv.setTextColor(Color.parseColor("#979797"));
                        //                发布变暗
                        fabuImg.setImageResource(R.mipmap.fabu);
                        fabuTv.setTextColor(Color.parseColor("#979797"));
                        //                我变亮
                        woImg.setImageResource(R.mipmap.gerenzhongxin_lan);
                        woTv.setTextColor(Color.parseColor("#1BA9D2"));
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @OnClick({R.id.ll_shouye, R.id.ll_fabu, R.id.ll_wo})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_shouye://点击首页
                //                首页变亮
                vp.setCurrentItem(0);
                shouyeImg.setImageResource(R.mipmap.shouye_lan);
                shouyeTv.setTextColor(Color.parseColor("#1BA9D2"));
                //                发布变暗
                fabuImg.setImageResource(R.mipmap.fabu);
                fabuTv.setTextColor(Color.parseColor("#979797"));
                //                我变暗
                woImg.setImageResource(R.mipmap.gerenzhongxin);
                woTv.setTextColor(Color.parseColor("#979797"));
                break;
            case R.id.ll_fabu://点击发布

                //                首页变暗
                vp.setCurrentItem(1);
                shouyeImg.setImageResource(R.mipmap.shouye);
                shouyeTv.setTextColor(Color.parseColor("#979797"));
                //                发布变亮
                fabuImg.setImageResource(R.mipmap.fabu_lan);
                fabuTv.setTextColor(Color.parseColor("#1BA9D2"));
                //                我变暗
                woImg.setImageResource(R.mipmap.gerenzhongxin);
                woTv.setTextColor(Color.parseColor("#979797"));
                break;
            case R.id.ll_wo://点击我
                //                首页变暗
                vp.setCurrentItem(2);
                shouyeImg.setImageResource(R.mipmap.shouye);
                shouyeTv.setTextColor(Color.parseColor("#979797"));
                //                发布变暗
                fabuImg.setImageResource(R.mipmap.fabu);
                fabuTv.setTextColor(Color.parseColor("#979797"));
                //                我变亮
                woImg.setImageResource(R.mipmap.gerenzhongxin_lan);
                woTv.setTextColor(Color.parseColor("#1BA9D2"));
                break;
        }
    }
}
