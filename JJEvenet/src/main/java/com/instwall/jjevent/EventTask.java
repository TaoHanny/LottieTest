package com.instwall.jjevent;

import com.instwall.jjevent.bean.EventBean;

import java.util.Map;

/**
 * Created by Administrator on 2017/1/13 0013.
 */

public class EventTask implements Runnable {


    private final String ec;
    private final String ea;
    private final String el;
    private final String dockingPlatform; //对接平台
    private  final Map ecp;

    public EventTask(String ec, String ea, String el, String dockingPlatform, Map ecp) {
        this.ec = ec;
        this.ea = ea;
        this.el = el;
        this.dockingPlatform = dockingPlatform;
        this.ecp = ecp;
    }



    @Override
    public void run() {

        if (!JJEventManager.hasInit) {
            ELogger.logError(EConstant.TAG, "please init JJEventManager!");
            return;
        }

        if (EConstant.SWITCH_OFF) {
            ELogger.logWrite(EConstant.TAG, "the sdk is SWITCH_OFF");
            return;
        }

        try {

            EventBean bean = EventDecorator.generateEventBean(ec, ea, el, dockingPlatform,ecp);

            ELogger.logWrite(EConstant.TAG, " event " + bean.toString());

            EDBHelper.addEventData(bean);

//            EventDecorator.pushEventByNum();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public String toString() {
        return "EventTask{" +
                "ec='" + ec + '\'' +
                ", ea='" + ea + '\'' +
                ", el='" + el + '\'' +
                ", ecp=" + ecp +
                '}';
    }
}