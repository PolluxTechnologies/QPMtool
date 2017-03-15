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
	double eeLq; //N�mero promedio de entidades esperando en el sistema en estado estable
	double eeLs; //N�mero promedio de entidades siendo atendidas en el sistema en estado estable
	double eeW; //Tiempo promedio que demora un cliente en el sistema en estado estable
	double eeWq; //Tiempo promedio que demora un cliente esperando en el sistema en estado estable
	double eeWs; //Tiempo promedio que demora un cliente siendo atendido en el sistema en estado estable
	//double exitRate; //Tasa de salida efectiva de los clientes
	//double util; //Utilizaci�n del servidor
	//double pi[]; //Probabilidades en estado estable
	//double cvDeparture; //Coeficiente de variaci�n al cuadrado de los tiempos entre salidas
	
	//M�todos
	void setArrivalRate(double lambda){arrivalRate=lambda;}
	void setServiceRate(double mu){serviceRate=mu;}
}

//Clase que define las propiedades de modelo de cola M/M/1
class mmOne extends Queue {
	
	//Constructor
	mmOne(double l, double m){
		setArrivalRate(l);
		setServiceRate(m);
	}
	
	//M�todos
	double eeL(){
		return arrivalRate/serviceRate;
	}
}


class QPM{
	public static void main(String[] args) {
		mmOne line = new mmOne(1,3);
		System.out.println("La ocupaci�n del servidor es " + line.eeL());
	}
}