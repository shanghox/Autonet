package com.el1t.iolite;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {
    public AlarmReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("TAG","AlarmReceiver opened...");
        Intent service1 = new Intent(context, AutonetService.class);
        context.startService(service1);
    }
}
