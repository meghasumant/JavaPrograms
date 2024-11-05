class Complex{
	float real;
	float imag;
	public Complex(){
		real = 0.0f;
		imag = 0.0f;
	}
	public Complex(float r, float i){
		real = r;
		imag = i;
	}
	public Complex add(Complex a1,Complex a2){
		Complex a3= new Complex();
		a3.imag = a1.imag + a2.imag;
		a3.real = a1.real + a2.real;
		return a3;
	}
	public void show(){
		System.out.println(real + "+i" + imag );
	}
}