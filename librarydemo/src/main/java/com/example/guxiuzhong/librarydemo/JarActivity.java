package com.example.guxiuzhong.librarydemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * ================================================
 * 作    者：顾修忠-guxiuzhong@youku.com/gfj19900401@163.com
 * 版    本：
 * 创建日期：16/7/19-下午4:32
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class JarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(MResource.getIdByName(this, "layout", "jar_layout"));

        ImageView mPlayerLogo = (ImageView) this.findViewById(MResource.getIdByName(this, "id", "logo"));

        mPlayerLogo.setImageResource(MResource.getIdByName(this, "drawable", "cheese2"));
    }
}
