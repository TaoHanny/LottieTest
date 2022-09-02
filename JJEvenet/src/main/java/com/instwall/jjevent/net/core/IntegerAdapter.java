package com.instwall.jjevent.net.core;


import com.instwall.jjevent.net.gson.JsonDeserializationContext;
import com.instwall.jjevent.net.gson.JsonDeserializer;
import com.instwall.jjevent.net.gson.JsonElement;

import java.lang.reflect.Type;

/**
 * @author Aidi on 2018/1/8.
 */
public class IntegerAdapter implements JsonDeserializer<Integer> {

    @Override
    public Integer deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        try {
            return json.getAsInt();
        } catch (Exception e) {
            return 0;
        }
    }

}
