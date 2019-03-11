package controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.vo.*;
import model.data_structures.*;


import view.MovingViolationsManagerView;

public class Controller {

	//TODO Completar view

	private MovingViolationsManagerView view;

	/**
	 * Metodo encargado de ejecutar los  metodos segun la opcion indicada por el usuario
	 */

	public void run(){

		long startTime;
		long endTime;
		long duration;

		Scanner sc = new Scanner(System.in);
		boolean fin = false;
		Controller controller = new Controller();

		while(!fin){
			view.printMenu();

			int option = sc.nextInt();

			switch(option){

			case 0:
				view.printMessage("Ingrese semestre a cargar (1 o 2)");
				int semestre = sc.nextInt();
				controller.loadMovingViolations(semestre);

				//TODO Mostrar las infracciones cargadas por mes
				//TODO Mostrar total de infracciones cargadas
				//TODO Mostrar zona Minimax (Xmin, Ymin) y (Xmax, Ymax)
				break;

			case 1:
				view.printMessage("1A. Consultar las N franjas horarias con mas infracciones que desea ver. Ingresar valor de N: ");
				int numeroFranjas = sc.nextInt();

				//TODO Completar para la invocaci�n del metodo 1A

				//TODO Mostrar resultado de tipo Cola con N InfraccionesFranjaHoraria

				break;

			case 2:
				view.printMessage("Ingrese la coordenada en X de la localizacion geografica: ");
				double xcoord = sc.nextDouble();
				view.printMessage("Ingrese la coordenada en Y de la localizacion geografica: ");
				double ycoord = sc.nextDouble();

				//TODO Completar para la invocaci�n del metodo 2A

				//TODO Mostrar resultado de tipo InfraccionesLocalizacion 

				break;

			case 3:
				view.printMessage("Ingrese la fecha inicial del rango. Formato a�o-mes-dia (ej. 2008-06-21)");
				String fechaInicialStr = sc.nextLine();
				LocalDate fechaInicial = convertirFecha_LD( fechaInicialStr );

				view.printMessage("Ingrese la fecha final del rango. Formato a�o-mes-dia (ej. 2008-06-30)");
				String fechaFinalStr = sc.nextLine();
				LocalDate fechaFinal = convertirFecha_LD( fechaFinalStr );

				//TODO Completar para la invocacion del metodo 3A

				//TODO Mostrar resultado de tipo Cola de InfraccionesFecha

				break;


			case 4:
				view.printMessage("1B. Consultar los N Tipos con mas infracciones. Ingrese el valor de N: ");
				int numeroTipos = sc.nextInt();

				//TODO Completar para la invocaci�n del metodo 1B				

				//TODO Mostrar resultado de tipo Cola con N InfraccionesViolationCode

				break;

			case 5:						
				view.printMessage("Ingrese la coordenada en X de la localizacion geografica: ");
				xcoord = sc.nextDouble();
				view.printMessage("Ingrese la coordenada en Y de la localizacion geografica: ");
				ycoord = sc.nextDouble();

				//TODO Completar para la invocaci�n del metodo 2B

				//TODO Mostrar resultado de tipo InfraccionesLocalizacion 

				break;

			case 6:
				view.printMessage("Ingrese la cantidad minima de dinero que deben acumular las infracciones en sus rangos de fecha");
				double cantidadMinima = sc.nextDouble();

				view.printMessage("Ingrese la cantidad maxima de dinero que deben acumular las infracciones en sus rangos de fecha");
				double cantidadMaxima = sc.nextDouble();

				//TODO Completar para la invocaci�n del metodo 3B

				//TODO Mostrar resultado de tipo Cola con InfraccionesFechaHora 

				break;

			case 7:
				view.printMessage("1C. Consultar las infracciones con Address_Id. Ingresar el valor de Address_Id: ");
				int addressID = sc.nextInt();

				startTime = System.currentTimeMillis();
				//TODO Completar para la invocaci�n del metodo 1C


				endTime = System.currentTimeMillis();

				duration = endTime - startTime;
				view.printMessage("Tiempo requerimiento 1C: " + duration + " milisegundos");

				//TODO Mostrar resultado de tipo InfraccionesLocalizacion 	

				break;

			case 8:
				view.printMessage("Ingrese la hora inicial del rango. Formato HH:MM:SS (ej. 09:30:00)");
				String horaInicialStr = sc.nextLine();
				LocalTime horaInicial = convertirHora_LT(horaInicialStr);

				view.printMessage("Ingrese la hora final del rango. Formato HH:MM:SS (ej. 16:00:00)");
				String horaFinalStr = sc.nextLine();
				LocalTime horaFinal = convertirHora_LT(horaFinalStr);

				startTime = System.currentTimeMillis();
				//TODO Completar para la invocacion del metodo 2C


				endTime = System.currentTimeMillis();

				duration = endTime - startTime;
				view.printMessage("Tiempo requerimiento 2C: " + duration + " milisegundos");
				//TODO Mostrar resultado de tipo InfraccionesFranjaHorarioViolationCode

				break;

			case 9:
				view.printMessage("Consultar las N localizaciones geograficas con mas infracciones. Ingrese el valor de N: ");
				int numeroLocalizaciones = sc.nextInt();

				startTime = System.currentTimeMillis();
				//TODO Completar para la invocaci�n del metodo 3C


				endTime = System.currentTimeMillis();

				duration = endTime - startTime;
				view.printMessage("Tiempo requerimiento 3C: " + duration + " milisegundos");
				//TODO Mostrar resultado de tipo Cola con InfraccionesLocalizacion

				break;

			case 10:

				System.out.println("Grafica ASCII con la informacion de las infracciones por ViolationCode");

				startTime = System.currentTimeMillis();
				//TODO Completar para la invocacion del metodo 4C

				endTime = System.currentTimeMillis();

				duration = endTime - startTime;
				view.printMessage("Tiempo requerimiento 3C: " + duration + " milisegundos");
				break;

			case 11:	
				fin = true;
				sc.close();
				break;
			}
		}
	}


	public void loadMovingViolations(int numeroSemestre) {

	}

	/**
	  * Requerimiento 1A: Obtener elranking de las N franjas horarias
	  * que tengan m�s infracciones. Se define las franjas horarias v�lidas
	  * @param int N: N�mero de franjas horarias que tienen m�s infracciones
	  * @return Cola con objetos InfraccionesFranjaHoraria
	  */
	public IQueue<InfraccionesFranjaHoraria> rankingNFranjas(int N)
	{
		// TODO Auto-generated method stub
		return null;		
	}
	
	/**
	  * Requerimiento 2A: Realizar  el  ordenamiento  de  las  infracciones  por
	  * Localizaci�n  Geogr�fica  (Xcoord, Ycoord).
	  * @param  double xCoord : Coordenada X de la posici�n de la zona de infracci�n
	  *			double yCoord : Coordenada Y de la posici�n de la zona de infracci�n
	  * @return Objeto InfraccionesLocalizacion
	  */
	public InfraccionesLocalizacion ordenamientoPorLocalizacionHash(double xCoord, double yCoord)
	{
		// TODO Auto-generated method stub
		return null;		
	}
	
	/**
	  * Requerimiento 3A: Buscar las infracciones por rango de fechas
	  * Las fechas siguen el formato a�o-mes-dia, e.g: 2018-01-01
	  * @param  LocalDate fechaInicial: Fecha inicial del rango de b�squeda
	  * 		LocalDate fechaFinal: Fecha final del rango de b�squeda
	  * @return Cola con objetos InfraccionesFecha
	  */
	public IQueue<InfraccionesFecha> infraccionesPorRangoFechas(LocalDate fechaInicial, LocalDate fechaFinal)
	{
		// TODO Auto-generated method stub
		return null;		
	}
	
	/**
	  * Requerimiento 1B: Obtener  el  ranking  de  las  N  tipos  de  infracci�n
	  * (ViolationCode)  que  tengan  m�s infracciones.
	  * @param  int N: Numero de los tipos de ViolationCode con m�s infracciones.
	  * @return Cola con objetos InfraccionesViolationCode con top N infracciones
	  */
	public IQueue<InfraccionesViolationCode> rankingNInfracciones(int N)
	{
		// TODO Auto-generated method stub
		return null;		
	}

	
	/**
	  * Requerimiento 2B: Realizar  el  ordenamiento  de  las  infracciones  por  
	  * Localizaci�n  Geogr�fica  (Xcoord, Ycoord).
	  * @param  double xCoord : Coordenada X de la posici�n de la zona de infracci�n
	  *			double yCoord : Coordenada Y de la posici�n de la zona de infracci�n
	  * @return Objeto InfraccionesLocalizacion
	  */
	public InfraccionesLocalizacion ordenamientoPorLocalizacionArbol(double xCoord, double yCoord)
	{
		// TODO Auto-generated method stub
		return null;		
	}
	
	/**
	  * Requerimiento 3B: Buscar las franjas de fecha-hora donde se tiene un valor acumulado
	  * de infracciones en un rango dado [US$ valor inicial, US$ valor final]. 
	  * @param  double valorInicial: Valor m�nimo acumulado de las infracciones
	  * 		double valorFinal: Valor m�ximo acumulado de las infracciones.
	  * @return Cola con objetos InfraccionesFechaHora
	  */
	public IQueue<InfraccionesFechaHora> franjasAcumuladoEnRango(double valorInicial, double valorFinal)
	{
		// TODO Auto-generated method stub
		return null;		
	}
	
	/**
	  * Requerimiento 1C: Obtener  la informaci�n de  una  localizaci�n dada
	  * @param  int addressID: Localizaci�n de la consulta.
	  * @return Objeto InfraccionesLocalizacion
	  */
	public InfraccionesLocalizacion informacionLocalizacion(int addressID)
	{
		// TODO Auto-generated method stub
		return null;		
	}
	
	/**
	  * Requerimiento 2C: Obtener  las infracciones  en  un  rango de
	  * horas  [HH:MM:SS  inicial,HH:MM:SS  final]
	  * @param  LocalTime horaInicial: Hora  inicial del rango de b�squeda
	  * 		LocalTime horaFinal: Hora final del rango de b�squeda
	  * @return Objeto InfraccionesFranjaHorariaViolationCode
	  */
	public InfraccionesFranjaHorariaViolationCode infraccionesPorRangoHoras(LocalTime horaInicial, LocalTime horaFinal)
	{
		// TODO Auto-generated method stub
		return null;		
	}
	
	/**
	  * Requerimiento 3C: Obtener  el  ranking  de  las  N localizacionesgeogr�ficas
	  * (Xcoord,  Ycoord)  con  la mayor  cantidad  de  infracciones.
	  * @param  int N: Numero de las localizaciones con mayor n�mero de infracciones
	  * @return Cola de objetos InfraccionesLocalizacion
	  */
	public IQueue<InfraccionesLocalizacion> rankingNLocalizaciones(int N)
	{
		// TODO Auto-generated method stub
		return null;		
	}
	
	/**
	  * Requerimiento 4C: Mostrar  una  gr�fica ASCII con la  informaci�n  de  las
	  * infracciones  por  c�digo (ViolationCode).
	  * @return Cola de objetos InfraccionesLocalizacion
	  */
	public IQueue<InfraccionesViolationCode> graficaInformacionInfracciones()
	{
		// TODO Auto-generated method stub
		return null;		
	}

	/**
	 * Convertir fecha - hora a un objeto LocalDate
	 * @param fechaHora fecha - hora en formato yyyy-MM-dd'T'HH:mm:ss'.000Z' con yyyy-MM-dd para la fecha y  HH:mm:ss para la hora
	 * @return objeto LDT con fecha - hora
	 */
	private static LocalDateTime convertirFecha_Hora_LDT(String fechaHora)
	{
		return LocalDateTime.parse(fechaHora, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'.000Z'"));
	}

	/**
	 * Convertir hora a un objeto LocalTime
	 * @param hora hora en formato HH:mm:ss con HH para hora, mm para minutos y ss para segundos
	 * @return objeto LD con fecha
	 */
	private static LocalTime convertirHora_LT(String hora)
	{
		return LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	/**
	 * Convertir fecha a un objeto LocalDate
	 * @param fecha fecha en formato yyyy-MM-dd con yyyy para agno, MM para mes y dd para dia
	 * @return objeto LD con fecha
	 */
	private static LocalDate convertirFecha_LD(String fecha)
	{
		return LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}


}
