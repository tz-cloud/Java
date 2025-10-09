
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		gpa(80);
		gpa(91);
  }

	double gpa(double gpa){
		if(gpa > 90){
			return gpa*1.1;
		}else{
			return gpa;
		}
	}
  
}