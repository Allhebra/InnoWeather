package ru.innopolis.innoweather.data.repository.datasource;

import ru.innopolis.innoweather.data.entity.WeatherEntity;
import ru.innopolis.innoweather.data.net.RestApi;
import rx.Observable;

public class CloudWeatherDataStore implements WeatherDataStore {
    private static final String TAG = "CloudWeatherDataStore";

    private RestApi restApi;

    @Override
    public Observable<WeatherEntity> weatherEntityDetails(int cityId) {
        return restApi.getCityWeatherByCityId(cityId);
    }

    public CloudWeatherDataStore(RestApi restApi) {
        this.restApi = restApi;
    }
}