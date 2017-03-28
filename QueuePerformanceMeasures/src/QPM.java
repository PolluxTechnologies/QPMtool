//Clase abstracta que contiene tanto los par�metros de entrada como las medidas de desempe�o
class Queue {

	//Par�metros de entrada
	double arrivalRate; //Tasa de entrada de los clientes al sistema
	//boolean arrivalM; //1 si el proceso de entradas es Markoviano, 0 de lo contrario
	double serviceRate; //Tasa de servicio de los servidores
	//boolean serviceM; //1 si el proceso de servicio es Markoviano, 0 de lo contrario
	//int numServers; //N�mero de servidores en paralelo
	//int capacity; //M�ximo n�mero de clientes que admite el sistema en un instante cualquiera
	//double varService; //Varianza en el tiempo de servicio
	//double cvArrival; //Coeficiente de variaci�n al cuadrado de los tiempos entre arribos 
	//double cvService; //Coeficiente de variaci�n al cuadrado de los tiempos de servicio
	
	//Medidas de desempe�o
	//double eeL; //N�mero promedio de entidades en el sistema en estado estable
	//double eeLq; //N�mero promedio de entidades esperando en el sistema en estado estable
	//double eeLs; //N�mero promedio de entidades siendo atendidas en el sistema en estado estable
	//double eeW; //Tiempo promedio que demora un cliente en el sistema en estado estable
	//double eeWq; //Tiempo promedio que demora un cliente esperando en el sistema en estado estable
	//double eeWs; //Tiempo promedio que demora un cliente siendo atendido en el sistema en estado estable
	//double exitRate; //Tasa de salida efectiva de los clientes
	//double util; //Utilizaci�n del servidor
	//double pij; //Probabilidades en estado estable de que hayan j clientes en el sistema
	//double cvDeparture; //Coeficiente de variaci�n al cuadrado de los tiempos entre salidas
	
	//M�todos
	void setArrivalRate(double lambda){arrivalRate=lambda;}
	void setServiceRate(double mu){serviceRate=mu;}
}

//Clase que define las propiedades de modelo de cola M/M/1
class mmOne extends Queue {
	
	//Constructor
	mmOne(double l, double m){//l Lambda: tasa de arribos, m Mu: tasa de servicios
		if(l/m >=1){//Verifico estabilidad
			throw new ArithmeticException();
		} else {//Si el sistema es estable realizo la asignaci�n de par�metros
			setArrivalRate(l); //Tasa de arribos=lambda
			setServiceRate(m); //Tasa de servicios=mu
		}		
	}
	
	//M�todo c�lculo de ocupaci�n
	double util(){
		return arrivalRate/serviceRate;
	}
	
	//M�todo c�lculo de L
	double eeL(){
		return util()/(1-util());
	}
	
	//M�todo c�lculo de Lq
	double eeLq(){
		return Math.pow(util(), 2)/(1-util());
	}
	
	//M�todo c�lculo de Ls
	double eeLs(){
		return eeL()-eeLq();
	}
	
	//M�todo c�lculo de W
	double eeW(){
		return eeL()/arrivalRate;
	}
	
	//M�todo c�lculo de Wq
		double eeWq(){
			return eeLq()/arrivalRate;
		}
		
	//M�todo c�lculo de Ws
	double eeWs(){
		return eeLs()/arrivalRate;
	}
	
	double pij(int j){
		return Math.pow(util(),j)*(1-util());
	}
}


class QPM{
	public static void main(String[] args) {
		try{//Se verifica estabilidad del sistema
			mmOne line = new mmOne(4,4);
		
			System.out.println("La ocupaci�n del servidor es " + line.util());
			System.out.println("Ws es " + line.eeWs());
			System.out.println("Ls prob en e.e. de 3 clientes en la l�nea es " + line.pij(3));
		}
		catch(ArithmeticException exc){//Si el sistema no estable devuelve un mensaje de error
			System.out.println("El sistema no es estable. Por favor verifique los par�metros ingresados.");
		}
	}
}