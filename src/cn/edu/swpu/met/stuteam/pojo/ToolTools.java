package cn.edu.swpu.met.stuteam.pojo;

public class ToolTools {
    private Integer id;

    private String toolid;

    private String toolname;

    private Double toolprice;

    private Integer station;

    private String tooldes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToolid() {
        return toolid;
    }

    public void setToolid(String toolid) {
        this.toolid = toolid == null ? null : toolid.trim();
    }

    public String getToolname() {
        return toolname;
    }

    public void setToolname(String toolname) {
        this.toolname = toolname == null ? null : toolname.trim();
    }

    public Double getToolprice() {
        return toolprice;
    }

    public void setToolprice(Double toolprice) {
        this.toolprice = toolprice;
    }

    public Integer getStation() {
        return station;
    }

    public void setStation(Integer station) {
        this.station = station;
    }

    public String getTooldes() {
        return tooldes;
    }

    public void setTooldes(String tooldes) {
        this.tooldes = tooldes == null ? null : tooldes.trim();
    }
}