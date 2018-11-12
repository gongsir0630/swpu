package cn.edu.swpu.met.stuteam.pojo;

public class ToolKeys {
    private Integer id;

    private String keyid;

    private String keyname;

    private Integer station;

    private String keydes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname == null ? null : keyname.trim();
    }

    public Integer getStation() {
        return station;
    }

    public void setStation(Integer station) {
        this.station = station;
    }

    public String getKeydes() {
        return keydes;
    }

    public void setKeydes(String keydes) {
        this.keydes = keydes == null ? null : keydes.trim();
    }
}