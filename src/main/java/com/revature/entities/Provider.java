package com.revature.entities;


//@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})

public class Provider {
	
	private int providerId;
	private String description;
	private int statusId;
	private String providerName;
	private int cost;
	public int getProviderId() {
		return providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + providerId;
		result = prime * result + ((providerName == null) ? 0 : providerName.hashCode());
		result = prime * result + statusId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provider other = (Provider) obj;
		if (cost != other.cost)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (providerId != other.providerId)
			return false;
		if (providerName == null) {
			if (other.providerName != null)
				return false;
		} else if (!providerName.equals(other.providerName))
			return false;
		if (statusId != other.statusId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Provider [providerId=" + providerId + ", description=" + description + ", statusId=" + statusId
				+ ", providerName=" + providerName + ", cost=" + cost + "]";
	}
	public Provider(int providerId, String description, int statusId, String providerName, int cost) {
		super();
		this.providerId = providerId;
		this.description = description;
		this.statusId = statusId;
		this.providerName = providerName;
		this.cost = cost;
	}
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
