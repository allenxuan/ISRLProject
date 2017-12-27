package com.allenxuan.xuanyihuang.inheritedswiperefreshlayout.swiperefreshlayout.header;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.allenxuan.xuanyihuang.inheritedswiperefreshlayout.R;

/**
 * Created by allenxuan on 26/12/2017.
 */

public class SimpleHeaderViewImpl extends HeaderViewBase{


    public SimpleHeaderViewImpl(@NonNull Context context) {
        super(context);
    }

    public SimpleHeaderViewImpl(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleHeaderViewImpl(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void inflateLayout(Context context) {
        LayoutInflater.from(context).inflate(R.layout.default_header, this);
    }
}
