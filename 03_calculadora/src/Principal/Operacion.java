package Principal;

public class Operacion {

	//1. Atributos
	double op1;
	double op2;
	
	//2. Constructores
	public Operacion(double op1, double op2){
		this.op1 = op1;
		this.op2 = op2;
	}
	
	//3. Get y set
	public double getOp1(){
		return op1;
	}
	public void setOp1(double op1){
		this.op1 = op1;
	}
	public double getOp2(){
		return op2;
	}
	public void setOp2(double op2){
		this.op2 = op2;
	}
	
	//4. Método toString
	
	//5. Otros métodos
	
	public double sumar(double op1, double op2){
		double resultado = op1 + op2;
		return resultado;
	}
	
	public double restar(double op1, double op2){
		double resultado = op1 - op2;
		return resultado;
	}
	
	public double multiplicar(double op1, double op2){
		double resultado = op1 * op2;
		return resultado;
	}
	
	public double dividir(double op1, double op2){
		double resultado = op1 / op2;
		return resultado;
	}
	
	
}
