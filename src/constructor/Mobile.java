package constructor;

public class Mobile {

	String mobileBrand;
	String mobileModel;
	double price;
	int ramSize;

	public Mobile() {

	}

	public Mobile(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public Mobile(String mobileBrand, String mobileModel) {
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
	}

	public Mobile(String mobileBrand, String mobileModel, double price) {
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.price = price;
	}

	public Mobile(String mobileBrand, String mobileModel, double price, int ramSize) {
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.price = price;
		this.ramSize = ramSize;
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile();

	}

}
