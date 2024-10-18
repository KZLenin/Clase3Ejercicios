public class LibroCalificaciones { //crea la clase

    private String nombreDelCurso; //atributo
    private String periodo;
    private int anio;
    private double promedio;


    public LibroCalificaciones(String nombre, String periodo, int anio, double promedio) { //constructor
        nombreDelCurso = nombre;
        this.periodo = periodo;
        this.anio = anio;
        this.promedio = promedio;
    }

    public LibroCalificaciones() {
    }

    private void setNombreDelCurso(String nombre) { //setter
        nombreDelCurso = nombre;
    }

    private String getNombreDelCurso(){ //getter
        return nombreDelCurso;
    }

    private String getPeriodo() {
        return periodo;
    }

    private void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getAnio() {
        return anio;
    }

    private void setAnio(int anio) {
        this. anio = anio;
    }

    private double getPromedio() {
        return promedio;
    }

    private void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void mostrarMensaje(){ // crea el metodo
        System.out.printf("Bienvenido al Libro Calificaciones del curso para \n%s %s!\nMatriculado el %d\nSu promedio es: %.2f",getNombreDelCurso(),getPeriodo(),getAnio(),getPromedio());
    }

    public void metodo1(){}

    private void metodo2(){} // no sale en el main
}

