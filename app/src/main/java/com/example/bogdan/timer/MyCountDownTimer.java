package com.example.bogdan.timer;

import android.os.CountDownTimer;
import android.widget.BaseAdapter;

public class MyCountDownTimer extends CountDownTimer {

    BaseAdapter mAdapter;

    public MyCountDownTimer(long millisInFuture, long countDownInterval, BaseAdapter adapter) {

        super( millisInFuture, countDownInterval );
        mAdapter = adapter;
    }

    @Override
    public void onFinish() {

        mAdapter.notifyDataSetChanged();
        this.start();
    }

    @Override
    public void onTick( long millisUntilFinished ) {

        // NO OP
    }

}
