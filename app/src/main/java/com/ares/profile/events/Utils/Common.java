package com.ares.profile.events.Utils;

import com.ares.profile.events.Helper.DBHelper;
import com.ares.profile.events.Model.Event;

import java.util.List;

/**
 * Created by Administrator on 2/13/2017.
 */

public class Common {
    static Common instance = null;

    public static Common getInstance() {
        if(instance == null){
            instance = new Common();
        }

        return instance;
    }

    public DBHelper dbHelper;
    public List<Event> listEvents;
    public int nCurrentEventIndex;
}
