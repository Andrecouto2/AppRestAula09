package com.example.logonrm.apprestaula09;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseAndroid {

    @SerializedName("android")
    private List<Android> androids;

    public List<Android> getAndroids() {
        return androids;
    }

    public void setAndroids(List<Android> androids) {
        this.androids = androids;
    }
}
