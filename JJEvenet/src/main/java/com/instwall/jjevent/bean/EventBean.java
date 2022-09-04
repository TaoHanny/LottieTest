package com.instwall.jjevent.bean;


import com.instwall.jjevent.db.annotations.Table;
import com.instwall.jjevent.db.annotations.Transient;

import java.io.Serializable;

/**
 * Created by yangtao on 22/9/4
 */

@Table(name = "eventlist")
public class EventBean implements Serializable{

    @Transient
    private static final long serialVersionUID = 9009411034336334765L;

    private int id;

    private String type;//统计类别,  EVENT,PV 等等
    private String it;//日志事件
    private String  v; //当前值为packageName。只有出现不向后兼容的更改时，此值才会改变。
    private String  ec;//事件类别
    private String  ea;//事件操作
    private String  el;//事件标签
    private String dockingPlatform; //对接平台

    private String customData;//自定义Data

    private int hour; //取值区间[0,23]

    private String timeDay;

    private String exposed_id;//曝光id

    @Override
    public String toString() {
        return "EventBean{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", it='" + it + '\'' +
                ", v='" + v + '\'' +
                ", ec='" + ec + '\'' +
                ", ea='" + ea + '\'' +
                ", el='" + el + '\'' +
                ", customData='" + customData + '\'' +
                ", hour='" + hour + '\'' +
                ", timeDay='" + timeDay + '\'' +
                ", exposed_id='" + exposed_id + '\'' +
                ", dockingPlatform='" + dockingPlatform + '\'' +
                '}';
    }

    public String getDockingPlatform() {
        return dockingPlatform;
    }

    public void setDockingPlatform(String dockingPlatform) {
        this.dockingPlatform = dockingPlatform;
    }

    public String getExposed_id() {
        return exposed_id;
    }

    public void setExposed_id(String exposed_id) {
        this.exposed_id = exposed_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }


    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public String getEa() {
        return ea;
    }

    public void setEa(String ea) {
        this.ea = ea;
    }

    public String getEl() {
        return el;
    }

    public void setEl(String el) {
        this.el = el;
    }

    public String getCustomData() {
        return customData;
    }

    public void setCustomData(String customData) {
        this.customData = customData;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getTimeDay() {
        return timeDay;
    }

    public void setTimeDay(String timeDay) {
        this.timeDay = timeDay;
    }
}
