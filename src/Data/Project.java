package Data;

import java.util.Date;

public class Project {

    private String name,id;
    private Date startDate,endDate;
    private int activities;
    private Developer projectLeader, developers;

    public Project(String name, String id, Date startDate, Date endDate, int activities, Developer projectleader, Developer developers) {
        this.name = name;
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.activities = activities;
        this.projectLeader = projectleader;
        this.developers = developers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getActivities() {
        return activities;
    }

    public void setActivities(int activities) {
        this.activities = activities;
    }

    public Developer getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(Developer projectLeader) {
        this.projectLeader = projectLeader;
    }

    public Developer getDevelopers() {
        return developers;
    }

    public void setDevelopers(Developer developers) {
        this.developers = developers;
    }



}
