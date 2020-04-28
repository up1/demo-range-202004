package demo;

import java.util.Date;

public class ExampleDependency {

    private String data;
    private Date lastUpdated;

    public void upDateData(String newData) {
        this.data = newData;
        this.lastUpdated = new Date(System.currentTimeMillis());
    }

    public void upDateData2(String newData, Date now) {
        this.data = newData;
        this.lastUpdated = now;
    }



}
