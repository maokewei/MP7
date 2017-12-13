import java.util.Scanner;
public class Parking {
	private String carNumber;
	private double inTime;
	private double outTime;
	
	public Parking() {
		
	}	
	
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public String getCarNumber() {
		return this.carNumber;
	}
	
	public void setInTime(double inTime) {
		this.inTime = inTime;
	}
	
	public double getInTime() {
		return this.inTime;
	}
	
	public void setOutTime(double outTime) {
		this.outTime = outTime;
	}
	
	public double getOutTime() {
		return this.outTime;
	}
	
	//Calculate the parking fee.
	public double parkingFee() {
		double moneyPaid = 0;
		double parkingTime = this.getOutTime() - this.getInTime();
		if (parkingTime <= 0.25) {
			moneyPaid = 0;
		} else if (parkingTime > 0.25 && parkingTime <= 2) {
			moneyPaid = parkingTime * 2.5;
		} else {
			moneyPaid = (parkingTime - 2) * 5 + 5;
		}
		return moneyPaid;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parking park = new Parking();
		
		System.out.println("Please enter your carNumber:");
		park.carNumber = sc.nextLine();
		
		System.out.println("Please enter your in time:");
		park.inTime = sc.nextDouble();
		
		System.out.println("Please enter your out time:");
		park.outTime = sc.nextDouble();
		
		double money = park.parkingFee();
		System.out.println(park.carNumber + ", Your parking fee is: $" + money);
		System.out.println("Enjoy yourself!");	
	}
}