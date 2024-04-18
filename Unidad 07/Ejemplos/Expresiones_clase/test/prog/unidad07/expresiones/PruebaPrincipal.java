package prog.unidad07.expresiones;

public class PruebaPrincipal {
  
  public static void main(String[] args) {
    
    Expresion literal1 = new Literal(100);
    Expresion literal2 = new Literal(-999);
    Expresion variable1 = new Variable("a", 10);
    Expresion suma1 = new Suma(literal1, literal2);
    Expresion suma2 = new Suma(literal1, variable1);
    Expresion resta1 = new Resta(literal1, variable1);
    Expresion compleja = new Suma(new Producto(new Literal(2), new Literal(3)), new Literal(5));

    System.out.printf("El valor de la expresion literal es %d%n", literal1.evaluar());
    System.out.printf("El valor de la expresion variable con el valoir inicial es es %d%n", variable1.evaluar());
    ((Variable)variable1).setValor(20);
    System.out.printf("El valor de la expresion variable DESPUES de cambiar el valor de la misma es %d%n", variable1.evaluar());
    
    System.out.printf("El valor de la expresion suma de dos literales es %d%n", suma1.evaluar());
    System.out.printf("El valor de la expresion suma de literal y variable es %d%n", suma2.evaluar());
    
    System.out.printf("El valor de la expresion resta de dos literales es %d%n", resta1.evaluar());

    System.out.printf("El valor de la expresion compleja es %d%n", compleja.evaluar());
    
  }

}
