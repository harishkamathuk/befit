package com.harishkamath.befit.models;

import com.google.gson.annotations.SerializedName;

public class UserCode extends BaseResponse {

    @SerializedName("code")
    private String userCode;

    @SerializedName("state")
    private String state;

    public String getUserCode()
	{
		return userCode;
	}

	public void setUserCode(String userCode)
	{
		this.userCode = userCode;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	@Override
    public String toString() {

        if (super.getError() != null) {
            return "UserCode{error='" + super.getError() + "'}";
        }

        return "UserCode{" +
                "userCode='" + userCode + '\'' +
                ", state='" + state +
                '}';
    }
}
