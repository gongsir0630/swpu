package cn.edu.swpu.met.stuteam.pojo;

public class ToolBikes {
    private Integer id;

    private String bikeid;

    private String bikename;

    private Double bikeprice;

    private Integer station;

    private String bikedes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBikeid() {
        return bikeid;
    }

    public void setBikeid(String bikeid) {
        this.bikeid = bikeid == null ? null : bikeid.trim();
    }

    public String getBikename() {
        return bikename;
    }

    public void setBikename(String bikename) {
        this.bikename = bikename == null ? null : bikename.trim();
    }

    public Double getBikeprice() {
        return bikeprice;
    }

    public void setBikeprice(Double bikeprice) {
        this.bikeprice = bikeprice;
    }

    public Integer getStation() {
        return station;
    }

    public void setStation(Integer station) {
        this.station = station;
    }

    public String getBikedes() {
        return bikedes;
    }

    public void setBikedes(String bikedes) {
        this.bikedes = bikedes == null ? null : bikedes.trim();
    }
}