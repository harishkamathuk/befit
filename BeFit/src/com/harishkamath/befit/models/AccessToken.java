package com.harishkamath.befit.models;

import com.google.gson.annotations.SerializedName;

public class AccessToken extends BaseResponse {

    @SerializedName("access_token")
    private String accessToken;
    private String tokenType = "Bearer";

    public String getAccessToken() {
        return accessToken;
    }

    public AccessToken() {
    }
    
    public AccessToken(String accessTokenString) {
    	this.accessToken = accessTokenString;
    }
    
    @SerializedName("athlete")
    private Athlete athlete;

    @Override
    public String toString() {

        if (super.getError() != null) {
            return "AccessToken{error='" + super.getError() + "'}";
        }

        return "AccessToken{" +
                "accessToken='" + accessToken + '\'' +
                ", athlete= " + athlete.toString() + '}';
    }

	public String getTokenType() {
		return this.tokenType;
	}
}
