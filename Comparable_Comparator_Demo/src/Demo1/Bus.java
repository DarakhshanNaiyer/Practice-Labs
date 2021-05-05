package Demo1;

public class Bus implements Comparable <Bus>{
	 
	private Integer busId;
	private String busName;
	private Double Fare;
	private Double Ratings;

	public Integer getBusId() {
		return busId;
	}



	public void setBusId(Integer busId) {
		this.busId = busId;
	}



	public String getBusName() {
		return busName;
	}



	public void setBusName(String busName) {
		this.busName = busName;
	}



	public Double getFare() {
		return Fare;
	}



	public void setFare(Double fare) {
		Fare = fare;
	}



	public Double getRatings() {
		return Ratings;
	}



	public void setRatings(Double ratings) {
		Ratings = ratings;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bus [busId="+busId+ ", busName="+busName+", Fare="+Fare+", Ratings="+Ratings+"]";
		
	}

	public Bus () {
	}

	public Bus (Integer busId, String busName, Double Fare, Double Ratings) {
		
		super();
		this.busId=busId;
		this.busName=busName;
		this.Fare=Fare;
		this.Ratings=Ratings;
	}

	@Override
	public int compareTo(Bus o) {
		// TODO Auto-generated method stub
		return o.busId.compareTo(this.busId);
	}
}
	


