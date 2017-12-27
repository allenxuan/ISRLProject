package com.allenxuan.xuanyihuang.inheritedswiperefreshlayout.swiperefreshlayout.header;

import android.content.Context;
import android.view.animation.Animation;

/**
 * Created by allenxuan on 26/12/2017.
 */

public interface IHeaderView {
    public abstract void inflateLayout(Context context);
    public abstract void setAnimationListener(Animation.AnimationListener listener);
}
