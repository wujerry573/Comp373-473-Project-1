package com.facility.model.use;


import java.util.Date;

public class UseSchedule {
    private String scheduleId;
    private String unitId;
    private Date startDateTime;
    private Date endDateTime;
    private String userId;

    public UseSchedule(){ }

    public String getScheduleId(){ return scheduleId; }

    public void setScheduleId(String scheduleId){ this.scheduleId = scheduleId;}

    public String getUnitId(){ return unitId;}

    public void setUnitId(){ String unitId;}

    public Date getStartDateTime(){return startDateTime;}

    public void setStartDateTime(Date startDate){ this.startDateTime = startDate;}

    public Date getEndDateTime(){return endDateTime;}

    public void setEndDateTime(Date endDate){ this.endDateTime = endDate;}

    public String getUserId(){ return userId;}

    public void setUserId(){ String userId;}

}
