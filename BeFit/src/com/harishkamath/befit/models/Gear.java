package com.harishkamath.befit.models;

import com.google.gson.annotations.SerializedName;

public class Gear
{
    @SerializedName("id")
	private int id;
    
    @SerializedName("primary")
	private boolean primary;
    
    @SerializedName("name")
	private String name;
    
    @SerializedName("distance")
	private float distance;
    
    @SerializedName("resource_state")
	private int resourceState;
    
    @SerializedName("brand_name")
	private String brandName;
    
    @SerializedName("model_name")
	private String modelName;
    
    @SerializedName("description")
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPrimary() {
		return primary;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public int getResourceState() {
		return resourceState;
	}

	public void setResourceState(int resourceState) {
		this.resourceState = resourceState;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
    
    

}
