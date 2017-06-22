package com.example.logonrm.apprestaula09;


public class APIUtils {

    public static final String BASE_URL = "http://www.mocky.io";

    public static  AndroidAPI getAndroidApiVersion() {
        return  RetrofitClient.getClient(BASE_URL)
                .create(AndroidAPI.class);
    }

}
