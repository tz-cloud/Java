class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void print(String word){
		System.out.println(word);
	}

	double FtoC(double f){
		double c = (f-32)*9.0/5;
		return c;
	}

	void init(){
		print("Hello");
		FtoC(32);
  }



	
 
}