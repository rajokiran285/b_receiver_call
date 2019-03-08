package com.example.broadcast_rec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class reciever extends BroadcastReceiver {

    String number;

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bun=intent.getExtras();
        if(bun!=null)
        {
            String state=bun.getString(TelephonyManager.EXTRA_STATE);

            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING))
            {
                number=intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);

                Toast.makeText(context, "app"+number, Toast.LENGTH_SHORT).show();

                
            }
        }
    }
}
