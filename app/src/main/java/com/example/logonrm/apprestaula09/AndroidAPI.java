package com.example.logonrm.apprestaula09;


import retrofit2.Call;
import retrofit2.http.GET;

public interface AndroidAPI {

    @GET("/v2/58af1fb21000001e1cc94547")
    Call<ResponseAndroid> getVersoes();

}
