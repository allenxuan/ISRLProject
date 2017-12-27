package com.allenxuan.xuanyihuang.isrlproject;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.allenxuan.xuanyihuang.inheritedswiperefreshlayout.swiperefreshlayout.InheritedSwipeRefreshLayout;

public class MainActivity extends AppCompatActivity {
    InheritedSwipeRefreshLayout inheritedSwipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((RecyclerView) findViewById(R.id.rv)).setAdapter(new RVAdapter());
        ((RecyclerView) findViewById(R.id.rv)).setLayoutManager(new LinearLayoutManager(this));
        inheritedSwipeRefreshLayout = (InheritedSwipeRefreshLayout) findViewById(R.id.srl);
        inheritedSwipeRefreshLayout.setOnRefreshListener(new InheritedSwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new CountDownTimer(2000, 2000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        inheritedSwipeRefreshLayout.setRefreshing(false);
                    }
                }.start();
            }
        });
    }
}
