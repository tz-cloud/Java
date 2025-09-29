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
		double c = (f-32)*9.0/5;
		return c;
	}

	//testing
	void init(){
		print("Hello");
		FtoC(32);
  }



	
 
}