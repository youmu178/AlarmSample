package com.yzh.alarmsample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Util {

	/**
	 * 将字符串格式的时间转换成以毫秒为单位的时间
	 * @param time	时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	public static long getTimeInMillisFromStr(String time) {
		long result = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
		
		try {
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(sdf.parse(time));
			result = calendar.getTimeInMillis();
			
			return result;
		} catch (Exception e) {
		}
		
		return 0;
	}
}
