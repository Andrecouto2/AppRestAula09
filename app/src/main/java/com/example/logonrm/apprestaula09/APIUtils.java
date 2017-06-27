package com.example.logonrm.apprestaula09;

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "http://10.3.1.30:3000";

    public static LinhaAPI getLinhaApiService() {
        return RetrofitClient.getClient(BASE_URL).create(LinhaAPI.class);
    }
}
