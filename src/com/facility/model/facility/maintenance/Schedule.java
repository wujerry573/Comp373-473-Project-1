package com.facility.model.facility.maintenance;

import java.util.List;

public class Schedule {

    private List<Maintenance> schedule;

    public Schedule() {};

    public List<Maintenance> listSchedule() {return schedule;}

    public void scheduleMaintenance(Maintenance maintenance) {schedule.add(maintenance);}

    public void cancelMaintenance(Maintenance maintenance) {schedule.remove(maintenance);}

}
