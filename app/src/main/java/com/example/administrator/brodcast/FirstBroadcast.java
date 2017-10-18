package com.example.administrator.brodcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class FirstBroadcast extends BroadcastReceiver {

    private static final String TAG = "NetworkBrocast";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub

        String msg = intent.getStringExtra("msg");
        Log.i(TAG, "FirstBroadcast："+msg);
            //更改广播数据
        Bundle bundle=new Bundle();
        bundle.putString("msg",msg+"@FirstBroadcast");
        setResultExtras(bundle);

    }

}
