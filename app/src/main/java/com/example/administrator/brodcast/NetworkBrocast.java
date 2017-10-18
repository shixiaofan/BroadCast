package com.example.administrator.brodcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class NetworkBrocast extends BroadcastReceiver {
        /**
         * 当网络发生改变时*/
    private static final String TAG = "NetworkBrocast";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub

        String msg = intent.getStringExtra("msg");
        Log.i(TAG, "NetworkBrocast state chaged!");
            if (! isValidate(context)){
                Toast.makeText(context,"network disconnected!",Toast.LENGTH_SHORT).show();
            }


    }
    public  static boolean isValidate(Context context) {
        ConnectivityManager cm=(ConnectivityManager)context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfos=cm.getAllNetworkInfo();
        if (networkInfos!=null){
            for (int i=0;i<networkInfos.length;i++){
                if (networkInfos[i].getState()==NetworkInfo.State.CONNECTED){
                    return true;
                }
            }
        }
        return false;
    }

}
