package Immutability;

public final class Address {

	private int cityId;
	private String cityName;
	
	public Address(int cityId, String cityName) {
		
		this.cityId = cityId;
		this.cityName = cityName;
	}
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	
}
