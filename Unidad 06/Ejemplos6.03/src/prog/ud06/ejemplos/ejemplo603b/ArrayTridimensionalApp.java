package prog.ud06.ejemplos.ejemplo603b;

public class ArrayTridimensionalApp {

  public static void main(String[] args) {
/*
 * Creamos un array tridimensional. Va a contener la cantidad de lluvia 
 * en cada capital de andalucia en un dia determinado
 * La primera coordenada es la ciudad siendo 0 = Almeria, 1 = Cadiz,
 * etc. en orden alfabético
 * La segunda es el mes 0 = enero, 1 = febrero, etc.
 * La tercera es el día. Usaremos 31 para que valga para todos los meses, aunque en algunos
 * meses haya casillas vacías que no se emplean
 * Como es un ejemplo vamos a crear 2 capitales y 2 meses para no alargarlo mucho
 */
double[][][] pluviometriaAndalucia = {
  {
    {13.15,10.96,5.98,3.27,3.04,0.50,15.18,0.26,19.74,3.18,12.72,13.31,6.17,12.70,0.69,1.32,1.42,12.36,16.72,9.78,1.69,14.09,8.76,12.41,13.25,6.79,15.41,12.39,18.80,5.47,8.91},
    {11.35,16.34,6.01,17.76,13.92,18.26,5.10,6.15,19.24,10.94,1.94,16.69,10.42,11.72,13.08,12.75,14.04,3.62,2.59,14.70,9.17,0.48,0.84,19.45,11.21,19.65,10.86,1.11,14.79,14.90,13.48}
  },
  {
    {9.62,8.21,4.90,7.68,11.66,17.42,15.95,19.33,5.37,14.40,10.51,9.39,11.56,14.39,16.80,9.42,2.56,17.69,5.37,9.25,9.21,8.91,7.55,7.59,18.90,2.80,5.78,15.20,13.28,19.72,9.82},
    {10.97,15.53,18.82,9.25,3.73,12.64,16.35,6.55,11.63,15.80,6.80,1.24,18.52,15.56,9.01,1.36,2.48,0.48,9.64,4.64,16.54,15.96,13.44,5.05,7.37,17.23,19.43,12.17,11.24,8.36,16.37}

  }
};

// Imprimimos cuanto llovio en Cadiz el 10 de Febrero
// El número de tabla, fila y columna es uno menos porque los índices
// comienzan por cero en lugar de por 1
System.out.println("El 10 de Febrero cayeron en Cádiz " + pluviometriaAndalucia[1][1][9] + " litros por metro cuadrado");

// Podemos pasar una sola tabla e imprimirla
imprimeTabla(1, pluviometriaAndalucia[0]);

// o sólo un mes
imprimeMes(1,1, pluviometriaAndalucia[0][0]);

/*
 * Para recorrer el array se emplean tres ciclos.
 * El primero recorre las tablas, el segundo las filas y el tercero las columnas
 */
for (int i = 0; i < pluviometriaAndalucia.length; i++) {
  System.out.println("Pluviometria de la capital " + (i + 1));
  for (int j = 0; j < pluviometriaAndalucia[i].length; j++) {
    System.out.println("Datos del mes " + (j + 1));
    for (int k = 0; k < pluviometriaAndalucia[i][j].length; k++) {
      System.out.println("El dia " + (k + 1) + " se recogieron " + pluviometriaAndalucia[i][j][k] + " litros por metro cuadrado");
    }
  }
}

// Metodo alternativo usando forEach
for (double[][] tabla: pluviometriaAndalucia) {
  System.out.println("Nueva tabla");
  for (double[] fila: tabla) {
    System.out.println("Nueva fila");
    for(double casilla: fila) {
      System.out.println("Elemento: " + casilla);
    }
  }
}
  }

  private static void imprimeMes(int capital, int mes, double[] datos) {
    System.out.println("Pluviometría en la capital " + capital + " en el mes " + mes);
    for (double lluvia: datos) {
      System.out.println(lluvia);
    }
  }

  private static void imprimeTabla(int capital, double[][] datos) {
    // TODO Auto-generated method stub
    
  }

}
