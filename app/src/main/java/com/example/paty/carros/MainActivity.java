package com.example.paty.carros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarroAPI carroAPI=APIUtils.getAPIService();
        carroAPI.listarTodos().enqueue(new Callback<List<Carro>>() {
            @Override
            public void onResponse(Call<List<Carro>> call, Response<List<Carro>> response) {
                for(Carro carro:response.body()) {
                    Log.i("Carro", carro.getMarca());
                }
            }

            @Override
            public void onFailure(Call<List<Carro>> call, Throwable t) {

            }
        });
    }
}
 