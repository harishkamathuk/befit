package com.harishkamath.befit;

import retrofit.RetrofitError;

import com.harishkamath.befit.models.Athlete;
import com.harishkamath.befit.models.AthleteStats;
import com.harishkamath.befit.models.UserCode;
import com.harishkamath.befit.services.ServiceGenerator;
import com.harishkamath.befit.services.StravaAthleteService;
import com.harishkamath.befit.services.StravaAuthService;
import com.harishkamath.befit.models.AccessToken;

@SuppressWarnings("unused")
public class BefitLauncher
{

	public static void main(String[] args) {

	    final String clientId = "";
	    final String clientSecret = "";
	    final String redirectUri = "";
	    final String responseType = "";
	    final String state = "";
	    final String accessTokenSecret = ""; 

	    try {
	
		    StravaAuthService accountsService = ServiceGenerator.createService(StravaAuthService.class, StravaAuthService.BASE_URL);

		    // First get the code the user will enter in a browser.
		    // UserCode userCode = accountsService.getUserCode(clientId, responseType, redirectUri, state);
		    // UserCode userCode = new UserCode();
		    // userCode.setUserCode("");
		    
            // Get the access token after the user verified access.
            // AccessToken accessToken = accountsService.getAccessToken(
            //        clientId, clientSecret, userCode.getUserCode());
            // System.out.println(accessToken);
            AccessToken accessToken = new AccessToken(accessTokenSecret);   

		    StravaAthleteService athleteService = ServiceGenerator.createService(StravaAthleteService.class, StravaAthleteService.BASE_URL, accessToken);
            
		    Athlete currentAthlete = athleteService.getCurrentAthlete();
		    System.out.println(currentAthlete.toString());
            
			int athleteId = 8053081;
			Athlete athlete = athleteService.getAthleteWithId(athleteId);
			System.out.println(athlete.toString());
			
			AthleteStats athleteStats = athleteService.getAthleteStats(athleteId);
			System.out.println(athleteStats.getAllRideTotals().toString());
  	    
       }
        catch (RetrofitError error) {
            if (error.getResponse() == null) {
                System.out.println("Error - error=" + error);
            }
            else {
                System.out.println("Error - response=" + error.getResponse().getHeaders() + ", status=" + error.getResponse().getStatus());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }	    	
	}
}
