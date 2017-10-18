package com.example.administrator.brodcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.administrator.brodcast.R.id.sent_btn;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //在发送之前，确定在代码的某个位置已经动态注册
        //动态注册
/*
        NetworkBrocast receiver = new NetworkBrocast();
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.intent.action.MY_BROADCAST");
        registerReceiver(receiver, filter);
*/


        //发送广播
        Button btn= (Button)findViewById(sent_btn);
        btn.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
       send();

    }

    public void send() {
        Intent intent = new Intent("android.intent.action.MY_BROADCAST");
        intent.putExtra("msg", "hello receiver.");
//        sendBroadcast(intent);
        sendOrderedBroadcast(intent,null);
    }


}
