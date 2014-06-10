package com.yzh.alarmsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class AlarmBroadCast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
//		mContext = context;
		// 接受其他闹钟事件，电话事件，短信事件等，进行交互处理
		String action = intent.getAction();
		if (action != null && action.equals("android.intent.action.PHONE_STATE")) {
		} else if (action != null && action.equals("android.provider.Telephony.SMS_RECEIVED")) {
		} else {
			Intent i = new Intent(context, AlarmAlertActivity.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
	}

}