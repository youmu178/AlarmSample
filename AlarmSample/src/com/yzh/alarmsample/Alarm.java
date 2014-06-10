package com.yzh.alarmsample;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "alarm", id = Alarm.ID)
public class Alarm extends Model {
	public static final String ID = "_id";
	public static final String ALARMID = "alarm_id";
	public static final String ALARMTITLE = "alarm_title";
	public static final String ALARMTIME = "alarm_time";
	public static final String ALARMTIMEMill = "alarm_time_mill";

	@Column(name = Alarm.ALARMID)
	private String alarmId;
	@Column(name = Alarm.ALARMTITLE)
	private String alarmTitle;
	@Column(name = Alarm.ALARMTIME)
	private String alarmTime;// 当前时间
	@Column(name = Alarm.ALARMTIMEMill)
	private String alarmTimeMill;//当前时间毫秒

	public String getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}

	public String getAlarmTitle() {
		return alarmTitle;
	}

	public void setAlarmTitle(String alarmTitle) {
		this.alarmTitle = alarmTitle;
	}

	public String getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(String alarmTime) {
		this.alarmTime = alarmTime;
	}

	public String getAlarmTimeMill() {
		return alarmTimeMill;
	}

	public void setAlarmTimeMill(String alarmTimeMill) {
		this.alarmTimeMill = alarmTimeMill;
	}

}
