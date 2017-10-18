package com.example.administrator.brodcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ThirdBroadcast extends BroadcastReceiver {

    private static final String TAG = "NetworkBrocast";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub

        String broadcast_msg = intent.getStringExtra("msg");
        Log.i(TAG, "broadcast_msg:ThirdBroadcast："+broadcast_msg);
            //接受数据
        String msg = getResultExtras(true).getString("msg");
          Log.i(TAG, "ThirdBroadcast: " + msg);

        Bundle bundle=new Bundle();
        bundle.putString("msg",msg+"@ThirdBroadcast");
        setResultExtras(bundle);



    }

}
