abstract class BasicCalculator implements BasicCalculation
{
	
	public double addition(double v1, double v2){
		return v1+v2;
	}
	public double subtraction(double v1, double v2){
		return v1-v2;
	}
	public double multiplication(double v1, double v2){
		return v1*v2;
	}
	public double division(double v1, double v2){
		return v1/v2;
	}
	public double square(double v1){
		return v1*v1;
	}
	public double cube(double v1){
		return v1*v1*v1;
	}
	public double pow(double base, double exp){

		double p = base;
		for (int i=1; i<exp; i++){
         p = p*base;
      }
      return p;


		//return StrictMath.pow(v1,v2);
	}
}