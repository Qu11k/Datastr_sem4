package model;

public class City {
	private String title;
	private float areaKm2;
	private String postalcode;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getAreaKm2() {
		return areaKm2;
	}
	public void setAreaKm2(float areaKm2) {
		this.areaKm2 = areaKm2;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public City() {}
	public City (String title,float areaKm2,String postalCode) {
		setTitle(title);
		setAreaKm2(areaKm2);
		setPostalcode(postalCode);
	}
	public String toString() {
		return title+", "+areaKm2+", "+"km2, "+postalcode;
	}
}
