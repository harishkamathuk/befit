package com.harishkamath.befit.models;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Athlete
{
    @SerializedName("id")
    private int id;

    @SerializedName("resource_state")	
    private int resourceState;
    
    @SerializedName("firstname")
    private String firstName;
    
    @SerializedName("lastname")
    private String lastName;
    
    @SerializedName("profile_medium")
    private String imageMedium;
    
    @SerializedName("profile")
    private String imageLarge;    
    
    @SerializedName("city")
    private String city;
    
    @SerializedName("state")
    private String state;
    
    @SerializedName("country")
    private String country;
    
    @SerializedName("sex")
    private char sex;

    @SerializedName("friend")
    private StravaLinkStatus friend;
    
    @SerializedName("follower")
    private StravaLinkStatus follower;
    
    @SerializedName("premium")
    private boolean premium;
    
    @SerializedName("created_at")
    private Date createdAt;
    
    @SerializedName("updated_at")
    private Date updatedAt;
 
    @SerializedName("approve_followers")
    private boolean approveFollowers;
    
    @SerializedName("follower_count")
    private int followerCount;
   
    @SerializedName("friend_count")
    private int friendCount;
    
    @SerializedName("mutual_friend_count")
    private int mutualFriendCount;

    @SerializedName("date_preference")
    private String datePreference;

    /* ‘feet’ or ‘meters’*/	
    @SerializedName("measurement_preference")
    private String measurementPreference;
        
    @SerializedName("email")
    private String email;
    
    @SerializedName("ftp")
    private int ftp;
    
    @SerializedName("weight")
    private float weight;
    
    @SerializedName("clubs")
    List<Club> clubs;
    
    @SerializedName("bikes")
    List<Bike> bikes;
    
    @SerializedName("shoes")
    List<Shoe> shoes;
    
    AthleteStats stats;

    
    
    public int getId()
	{
		return id;
	}



	public void setId(int id)
	{
		this.id = id;
	}



	public int getResourceState()
	{
		return resourceState;
	}



	public void setResourceState(int resourceState)
	{
		this.resourceState = resourceState;
	}



	public String getFirstName()
	{
		return firstName;
	}



	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}



	public String getLastName()
	{
		return lastName;
	}



	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}



	public String getImageMedium()
	{
		return imageMedium;
	}



	public void setImageMedium(String imageMedium)
	{
		this.imageMedium = imageMedium;
	}



	public String getImageLarge()
	{
		return imageLarge;
	}



	public void setImageLarge(String imageLarge)
	{
		this.imageLarge = imageLarge;
	}



	public String getCity()
	{
		return city;
	}



	public void setCity(String city)
	{
		this.city = city;
	}



	public String getState()
	{
		return state;
	}



	public void setState(String state)
	{
		this.state = state;
	}



	public String getCountry()
	{
		return country;
	}



	public void setCountry(String country)
	{
		this.country = country;
	}



	public char getSex()
	{
		return sex;
	}



	public void setSex(char sex)
	{
		this.sex = sex;
	}



	public StravaLinkStatus getFriend()
	{
		return friend;
	}



	public void setFriend(StravaLinkStatus friend)
	{
		this.friend = friend;
	}



	public StravaLinkStatus getFollower()
	{
		return follower;
	}



	public void setFollower(StravaLinkStatus follower)
	{
		this.follower = follower;
	}



	public boolean isPremium()
	{
		return premium;
	}



	public void setPremium(boolean premium)
	{
		this.premium = premium;
	}



	public Date getCreatedAt()
	{
		return createdAt;
	}



	public void setCreatedAt(Date createdAt)
	{
		this.createdAt = createdAt;
	}



	public Date getUpdatedAt()
	{
		return updatedAt;
	}



	public void setUpdatedAt(Date updatedAt)
	{
		this.updatedAt = updatedAt;
	}



	public boolean isApproveFollowers()
	{
		return approveFollowers;
	}



	public void setApproveFollowers(boolean approveFollowers)
	{
		this.approveFollowers = approveFollowers;
	}



	public int getFollowerCount()
	{
		return followerCount;
	}



	public void setFollowerCount(int followerCount)
	{
		this.followerCount = followerCount;
	}



	public int getFriendCount()
	{
		return friendCount;
	}



	public void setFriendCount(int friendCount)
	{
		this.friendCount = friendCount;
	}



	public int getMutualFriendCount()
	{
		return mutualFriendCount;
	}



	public void setMutualFriendCount(int mutualFriendCount)
	{
		this.mutualFriendCount = mutualFriendCount;
	}



	public String getDatePreference()
	{
		return datePreference;
	}



	public void setDatePreference(String datePreference)
	{
		this.datePreference = datePreference;
	}



	public String getMeasurementPreference()
	{
		return measurementPreference;
	}



	public void setMeasurementPreference(String measurementPreference)
	{
		this.measurementPreference = measurementPreference;
	}



	public String getEmail()
	{
		return email;
	}



	public void setEmail(String email)
	{
		this.email = email;
	}



	public int getFtp()
	{
		return ftp;
	}



	public void setFtp(int ftp)
	{
		this.ftp = ftp;
	}



	public float getWeight()
	{
		return weight;
	}



	public void setWeight(float weight)
	{
		this.weight = weight;
	}



	public List<Club> getClubs()
	{
		return clubs;
	}



	public void setClubs(List<Club> clubs)
	{
		this.clubs = clubs;
	}



	public List<Bike> getBikes()
	{
		return bikes;
	}



	public void setBikes(List<Bike> bikes)
	{
		this.bikes = bikes;
	}



	public List<Shoe> getShoes()
	{
		return shoes;
	}



	public void setShoes(List<Shoe> shoes)
	{
		this.shoes = shoes;
	}



	public AthleteStats getStats()
	{
		return stats;
	}



	public void setStats(AthleteStats stats)
	{
		this.stats = stats;
	}



	public String toString() {
    	return this.firstName + " " + this.lastName;
    }
}
