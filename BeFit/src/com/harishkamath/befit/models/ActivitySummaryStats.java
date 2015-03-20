package com.harishkamath.befit.models;

import com.google.gson.annotations.SerializedName;

public class ActivitySummaryStats
{
	
    @SerializedName("count")
    private int count;

    @SerializedName("distance")
    private int distance;

    @SerializedName("moving_time")
    private int movingTime;
    
    @SerializedName("elapsed_time")
    private int elapsedTime;
    
    @SerializedName("elevation_gain")
    private int elevationGain;

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public int getDistance()
	{
		return distance;
	}

	public void setDistance(int distance)
	{
		this.distance = distance;
	}

	public int getMovingTime()
	{
		return movingTime;
	}

	public void setMovingTime(int movingTime)
	{
		this.movingTime = movingTime;
	}

	public int getElapsedTime()
	{
		return elapsedTime;
	}

	public void setElapsedTime(int elapsedTime)
	{
		this.elapsedTime = elapsedTime;
	}

	public int getElevationGain()
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
