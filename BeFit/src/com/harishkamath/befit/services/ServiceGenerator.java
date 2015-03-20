package com.harishkamath.befit.services;

import java.net.InetSocketAddress;
import java.net.Proxy;

import com.harishkamath.befit.models.AccessToken;
import com.squareup.okhttp.OkHttpClient;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;


public final class ServiceGenerator {

    // No need to instantiate this class.
    private ServiceGenerator() {
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl) {
        return createService(serviceClass, baseUrl, null);
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl, final AccessToken accessToken) {

        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(baseUrl)
                // .setLogLevel(RestAdapter.LogLevel.FULL) // this is the important line
                .setClient(new OkClient(new OkHttpClient()));

        if (accessToken != null) {
            builder.setRequestInterceptor(new RequestInterceptor() {
                @Override
                public void intercept(RequestFacade request) {
                    request.addHeader("Accept", "application/json;versions=1");
                    request.addHeader("Authorization", accessToken.getTokenType() +
                            " " + accessToken.getAccessToken());
                }
            });
        }

        RestAdapter adapter = builder.build();

        return adapter.create(serviceClass);
    }
}
