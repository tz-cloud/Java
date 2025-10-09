
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		//Problem 1
		System.out.println(gpa(80)); //return 80
		System.out.println(gpa(91)); //return 100.1

		//Problem 2
			if(isGraduating(12, 44)){
				System.out.println("Student is Graduating");
			}else 
				System.out.println("Student is not graduating");
			//return true

			if(isGraduating(12, 30)){
				System.out.println("Student is Graduating");
			}else 
				System.out.println("Student is not graduating");
			//return false

			if(isGraduating(10, 44)){
				System.out.println("Student is Graduating");
			}else 
				System.out.println("Student is not graduating");
			//return false

		//Problem 3
		System.out.println(BMI(90, 63)); //return 15.9 = Underweight

		//Problem 4 
		System.out.println(shippingCost(12)); //return 10.00

		//Problem 
		System.out.println(blueorViolet(650)); //return true
		System.out.println(blueorViolet(720)); //return true
  	}

	double gpa(double gpa){
		if(gpa > 90){
			return gpa*1.1;
		}else{
			return gpa;
		}
	}

	boolean isGraduating(int gradelvl, int credits){
		if(gradelvl == 12 && credits >= 44){
			return true;
		}else{
			return false;
		}
	}

	String BMI(double weight, double height){
		double bmi = (weight/Math.pow(height,2))*703;
		if( bmi <= 18.4 ){
			return "Underweight";
		}else if(bmi >= 18.5 && bmi <= 24.9){
			return "Normal";
		}else if(bmi >= 25 && bmi <= 39.9){
			return "Overweight";
		}else{
			return "Obese";
		}
	}

	double shippingCost(double weight){
		if( weight <= 10.0 ){
			return 0.00;
		}else if( weight > 10.0 && weight <= 15.0 ){
			return 5.00;
		}else if( weight > 15.0 && weight <= 25.0 ){
			return 10.00;
		}else{
			return 10.00 + ((weight/25)*.02);
		}
	}

	boolean blueorViolet(int lightFrequency){
		if((lightFrequency >= 600 && lightFrequency <= 670) || (lightFrequency >= 700 && lightFrequency <= 750)){
			return true;
		}else{
			return false;
		}
	}
}