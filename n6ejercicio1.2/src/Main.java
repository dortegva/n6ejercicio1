public class Main {
    public static void main(String[] args) {

    Persona pers1=new Persona("Dani","Ortega",28);
    String sudoku="Intermedio";
    byte puntos=5;

    GenericMethods.pruebaMetGenerico(puntos,sudoku,pers1);

    GenericMethods.pruebaMetGenerico(sudoku,pers1,puntos);
    }
}