package com.harishkamath.befit.models;

import com.google.gson.annotations.SerializedName;

public class AthleteStats
{
	
    @SerializedName("biggest_ride_distance")
    private float biggestRideDistance;	

    @SerializedName("biggest_climb_elevation_gain")
    private float biggestClimbElevationGain;	
    
	public float getBiggestRideDistance()
	{
		return biggestRideDistance;
	}

	public void setBiggestRideDistance(float biggestRideDistance)
	{
		this.biggestRideDistance = biggestRideDistance;
	}

	public float getBiggestClimbElevationGain()
	{
		return biggestClimbElevationGain;
	}

	public void setBiggestClimbElevationGain(float biggestClimbElevationGain)
	{
		this.biggestClimbElevationGain = biggestClimbElevationGain;
	}
    

    @SerializedName("recent_ride_totals")
    private ActivitySummaryStats recentRideTotals;	

    @SerializedName("recent_run_totals")
    private ActivitySummaryStats recentRunTotals;	

    @SerializedName("ytd_ride_totals")
    private ActivitySummaryStats ytdRideTotals;	

    @SerializedName("ytd_run_totals")
    private ActivitySummaryStats ytdRunRotals;	

    @SerializedName("all_ride_totals")
    private ActivitySummaryStats allRideTotals;	

    @SerializedName("all_run_totals")
    private ActivitySummaryStats allRunTotals;


	public ActivitySummaryStats getRecentRideTotals()
	{
		return recentRideTotals;
	}

	public void setRecentRideTotals(ActivitySummaryStats recentRideTotals)
	{
		this.recentRideTotals = recentRideTotals;
	}

	public ActivitySummaryStats getRecentRunTotals()
	{
		return recentRunTotals;
	}

	public void setRecentRunTotals(ActivitySummaryStats recentRunTotals)
	{
		this.recentRunTotals = recentRunTotals;
	}

	public ActivitySummaryStats getYtdRideTotals()
	{
		return ytdRideTotals;
	}

	public void setYtdRideTotals(ActivitySummaryStats ytdRideTotals)
	{
		this.ytdRideTotals = ytdRideTotals;
	}

	public ActivitySummaryStats getYtdRunRotals()
	{
		return ytdRunRotals;
	}

	public void setYtdRunRotals(ActivitySummaryStats ytdRunRotals)
	{
		this.ytdRunRotals = ytdRunRotals;
	}

	public ActivitySummaryStats getAllRideTotals()
	{
		return allRideTotals;
	}

	public void setAllRideTotals(ActivitySummaryStats allRideTotals)
	{
		this.allRideTotals = allRideTotals;
	}

	public ActivitySummaryStats getAllRunTotals()
	{
		return allRunTotals;
	}

	public void setAllRunTotals(ActivitySummaryStats allRunTotals)
	{
		this.allRunTotals = allRunTotals;
	}	
}
