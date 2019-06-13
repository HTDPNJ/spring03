package com.hfut.pojo;

public class Airport {
    private int id;
    private String cityName;
    private String portName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", portName='" + portName + '\'' +
                '}';
    }
}
