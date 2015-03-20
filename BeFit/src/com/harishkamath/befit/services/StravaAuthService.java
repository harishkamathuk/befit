package com.harishkamath.befit.services;

import com.harishkamath.befit.models.AccessToken;
import com.harishkamath.befit.models.UserCode;

import retrofit.http.*;

public interface StravaAuthService
{

    public static final String BASE_URL = "https://www.strava.com";

    @GET("/oauth/authorize")
    UserCode getUserCode(@Query("client_id") String clientId,
    					 @Query("response_type") String responseType,
                         @Query("redirect_uri") String redirectUri,
                         @Query("state") String state
                         );

    @POST("/oauth/token")
    @FormUrlEncoded
    AccessToken getAccessToken(@Field("client_id") String clientId,
                               @Field("client_secret") String clientSecret,
                               @Field("code") String userCode
                               );

    
}
