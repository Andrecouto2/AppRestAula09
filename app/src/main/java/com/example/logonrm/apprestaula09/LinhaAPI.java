package com.example.logonrm.apprestaula09;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LinhaAPI {

    @GET("/linhas")
    Call<List<Linha>> getLinhas();

}
