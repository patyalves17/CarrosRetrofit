package com.example.paty.carros;

/**
 * Created by logonrm on 19/06/2017.
 */

public class APIUtils {
    private APIUtils() {}

    public static final String BASE_URL = "http://10.3.1.10:3000";

    public static CarroAPI getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(CarroAPI.class);
    }
 

}
