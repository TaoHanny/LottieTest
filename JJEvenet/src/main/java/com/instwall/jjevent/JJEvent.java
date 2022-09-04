package com.instwall.jjevent;

import com.instwall.jjevent.thread.JJPoolExecutor;

import java.util.Map;
import java.util.concurrent.FutureTask;


/**
 * 统计入口
 */
public final class JJEvent {


    /**
     * 点击事件
     *
     * @param ec event category 事件类别
     * @param ea event action 事件操作
     * @param el event label 事件标签
     */
    public static void event(String ec, String ea, String el,String dockingPlatform) {
        event(ec, ea, el, dockingPlatform,null);
    }

    /**
     * 点击事件
     *
     * @param ec  event category 事件类别
     * @param ea  event action 事件操作
     * @param el  event label 事件标签
     * @param ecp event custom Parameters 自定义参数Map<key,value>
     */
    public static void event(String ec, String ea, String el, String dockingPlatform,Map ecp) {

        try {
            EventTask eventTask =new EventTask(ec,ea,el,dockingPlatform,ecp);
            JJPoolExecutor.getInstance().execute(new FutureTask<Object>(eventTask,null));
        } catch (Exception e) {
            e.printStackTrace();
            ELogger.logWrite(EConstant.TAG, "event error " + e.getMessage());

        }





    }




    /**
     * 曝光
     * @param exposeID 去重用
     * @param ec  event category 事件类别
     * @param ea  event action 事件操作
     * @param ecp event custom Parameters 自定义参数Map<key,value>
     */
    public static synchronized void expose(String exposeID, String ec, String ea, Map ecp) {

        // expose(exposeID, ec, ea, ecp, null);

        try {
            ExposeTask exposeTask =new ExposeTask(exposeID,ec,ea,ecp);

            JJPoolExecutor.getInstance().execute(new FutureTask<Object>(exposeTask,null));
        } catch (Exception e) {
            e.printStackTrace();
            ELogger.logWrite(EConstant.TAG, "expose error " + e.getMessage());

        }


    }


}
