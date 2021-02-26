package com.facility.model.maintenance;

import java.util.Date;

public class Schedule {

    private int scheduleId;

    private String scheduleContents;

    private Date date;

    public Schedule() {};

    public int getScheduleId() {return scheduleId;}

    public void setScheduleId(int scheduleId) {this.scheduleId = scheduleId;}

    public String getScheduleContents() {return scheduleContents;}

    public void setScheduleContents(String scheduleContents) {this.scheduleContents = scheduleContents;}

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}
}
