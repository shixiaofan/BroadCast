package com.example.administrator.brodcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SecondBrodcast extends BroadcastReceiver {

    private static final String TAG = "NetworkBrocast";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub

       /* String msg = intent.getStringExtra("msg");
        Log.i(TAG, "SecondBrodcast："+msg);*/
       String msg=getResultExtras(true).getString("msg");
        Log.i(TAG,"SecondBrodcast:"+msg);

    }

}
