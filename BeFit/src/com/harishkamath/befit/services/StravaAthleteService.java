package com.harishkamath.befit.services;

import com.harishkamath.befit.models.Athlete;
import com.harishkamath.befit.models.AthleteStats;

import retrofit.http.*;

public interface StravaAthleteService
{

    public static final String BASE_URL = "https://www.strava.com";

    @GET("/api/v3/athlete")
    Athlete getCurrentAthlete();
    
    @GET("/api/v3/athletes/{athleteId}")
    Athlete getAthleteWithId(
        @Path("athleteId") int athleteId
    );	
    
    @GET("/api/v3/athletes/{athleteId}/stats")
    AthleteStats getAthleteStats(
        @Path("athleteId") int athleteId
    );	
    
}
