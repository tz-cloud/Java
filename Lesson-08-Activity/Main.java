class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	//1
	void print(String word){
		System.out.println(word);
	}

	//2
	double FtoC(double f){
		double c = (f-32)*(9.0/5);
		return c;
	}

	//3
	double sphereVolume(double r){
		double v = (4/3.0)*Math.PI*Math.pow(r, 3);
		return v;
	}

	//4
	double coneVolume(double r, double h){
		double v = Math.PI*Math.pow(r, 2)*(h/3.0);
		return v;
	}

	//5
	void distance(double x1, double y1, double x2, double y2){
		double d = Math.sqrt(Math.pow((x2 - x1) + (y2 - y1), 2));
		System.out.print(d);
	}
	
	//testing
	void init(){
		print("Hello");
		System.out.println(FtoC(32));
		System.out.println(sphereVolume(1));
		System.out.println(coneVolume(2, 3));
		distance(1.0, 1.0, 1.4, 1.4);
  }



	
 
}