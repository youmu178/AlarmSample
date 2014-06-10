package com.yzh.alarmsample;


import com.activeandroid.Model;
import com.activeandroid.query.Select;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;

public class AlarmUtil {

	// 设置闹钟
	public static final void setAlarmClock(Context context, Alarm alarm) {
		Model executeSingle = new Select().from(Alarm.class).where(Alarm.ALARMID + "= ?", alarm.getAlarmId()).executeSingle();
		Long id = executeSingle.getId();
		AlarmManager am = (AlarmManager) MyApplication.getInstance().getSystemService(Service.ALARM_SERVICE);
		//
		Intent intent1 = new Intent(context, AlarmBroadCast.class);
		PendingIntent pi1 = PendingIntent.getBroadcast(context, new Long(id).intValue(), intent1, 0);
		//
		long alarmTime = Util.getTimeInMillisFromStr(alarm.getAlarmTime());
		am.set(AlarmManager.RTC_WAKEUP, alarmTime, pi1);
	}

	// 取消闹钟
	public static final void cancleAlarmClock(Context context,  Alarm alarm) {
		Model executeSingle = new Select().from(Alarm.class).where(Alarm.ALARMID + "= ?", alarm.getAlarmId()).executeSingle();
		Long id = executeSingle.getId();
		AlarmManager am = (AlarmManager) context.getSystemService(Service.ALARM_SERVICE);

		Intent intent = new Intent(context, AlarmBroadCast.class);
		PendingIntent pi = PendingIntent.getBroadcast(context, new Long(id).intValue(), intent, 0);
		am.cancel(pi);
	}
}
