package com.example.thangbach.myapplication.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.thangbach.myapplication.View.TrangChu.Fragment.DienTuFragment;
import com.example.thangbach.myapplication.View.TrangChu.Fragment.KhuyenMaiFragment;
import com.example.thangbach.myapplication.View.TrangChu.Fragment.LamDepFragment;
import com.example.thangbach.myapplication.View.TrangChu.Fragment.MeVaBeFragment;
import com.example.thangbach.myapplication.View.TrangChu.Fragment.NhaCuaDoiSongFragment;
import com.example.thangbach.myapplication.View.TrangChu.Fragment.NoiBatFragment;
import com.example.thangbach.myapplication.View.TrangChu.Fragment.TheThaoDuLichFragment;
import com.example.thangbach.myapplication.View.TrangChu.Fragment.ThoiTrangFragment;
import com.example.thangbach.myapplication.View.TrangChu.Fragment.ThuongHieuFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThangBach on 1/2/2017.
 */

public class ViewpagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments=new ArrayList<Fragment>();
    List<String> fragmentTitle=new ArrayList<String>();
    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
        fragments.add(new NoiBatFragment());
        fragments.add(new KhuyenMaiFragment());
        fragments.add(new DienTuFragment());
        fragments.add(new NhaCuaDoiSongFragment());
        fragments.add(new MeVaBeFragment());
        fragments.add(new LamDepFragment());
        fragments.add(new ThoiTrangFragment());
        fragments.add(new TheThaoDuLichFragment());
        fragments.add(new ThuongHieuFragment());

        fragmentTitle.add("Nổi bật");
        fragmentTitle.add("Khuyến mãi");
        fragmentTitle.add("Điện tử");
        fragmentTitle.add("Nhà cửa & đời sống");
        fragmentTitle.add("Mẹ & bé");
        fragmentTitle.add("Làm đẹp");
        fragmentTitle.add("Thời trang");
        fragmentTitle.add("Thể thao & du lịch");
        fragmentTitle.add("Thương Hiệu");
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
}
