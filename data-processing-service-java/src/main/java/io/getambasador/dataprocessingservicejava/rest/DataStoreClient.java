package io.getambasador.dataprocessingservicejava.rest;

import java.util.List;

import io.getambasador.dataprocessingservicejava.dto.EdgyMerch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataStoreClient {
    @GET("/recordCount")
    public Call<String> getRecordCount();
    @GET("/findMerch")
    public Call<List<EdgyMerch>> findEdgyMerch(@Query("country") String country, @Query("season") String season);
    @GET("/seasons")
    public Call<String> getSeasons();
}
