package com.lwcindustry.edward.schedulewidget.feature;

public class CustomIdFinder {
    public int getTimeId(int id){
        switch (id) {
            case 1: return R.id.time1;
            case 2: return R.id.time2;
            case 3: return R.id.time3;
        }
        return 0;
    }

    public int getSubId(int id) {
        switch (id) {
            case 1: return R.id.sub1;
            case 2: return R.id.sub2;
            case 3: return R.id.sub3;
        }
        return 0;
    }

    public int getCabId(int id){
        switch (id){
            case 1: return R.id.cab1;
            case 2: return R.id.cab2;
            case 3: return R.id.cab3;
        }
        return 0;
    }
}
