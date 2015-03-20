package com.harishkamath.befit.models;

import com.google.gson.annotations.SerializedName;

public class ActivitySummaryStats
{
	
    @SerializedName("count")
    private int count;

    @SerializedName("distance")
    private float distance;

    @SerializedName("moving_time")
    private float movingTime;
    
    @SerializedName("elapsed_time")
    private float elapsedTime;
    
    @SerializedName("elevation_gain")
    private float elevationGain;

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public float getDistance()
	{
		return distance;
	}

	public void setDistance(int distance)
	{
		this.distance = distance;
	}

	public float getMovingTime()
	{
		return movingTime;
	}

	public void setMovingTime(float movingTime)
	{
		this.movingTime = movingTime;
	}

	public float getElapsedTime()
	{
		return elapsedTime;
	}

	public void setElapsedTime(float elapsedTime)
	{
		this.elapsedTime = elapsedTime;
	}

	public float getElevationGain()
	{
		return elevationGain;
	}

	public void setElevationGain(int elevationGain)
	{
		this.elevationGain = elevationGain;
	}
    
    @Override
    public String toString() {

        return "ActivitySummary{" +
                "count='" + count + '\'' +
                ", distance='" + distance + '\'' +
                ", moving_time='" + movingTime + '\'' +
                ", elapsed_time='" + elapsedTime + '\'' +
                ", elevation_gain='" + elevationGain + '\'' +
                '}';
    }	
    
}
