import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //input de datos
/*
        System.out.println("Escriba el nombre del curso: ");
        String nombreDelCurso = sc.nextLine(); // lee la entrada como string

        System.out.println("Ingrese el periodo del semestre: ");
        String periodo = sc.nextLine();

        System.out.println("Ingrese el año del semestre: ");
        int anio = sc.nextInt();

        System.out.println("Ingrese el promedio del semestre: ");
        double promedio = sc.nextDouble();

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(nombreDelCurso, periodo,anio,promedio);
/*
        miLibroCalificaciones.setNombreDelCurso(nombreDelCurso);
        miLibroCalificaciones.setPeriodo(periodo);
        miLibroCalificaciones.setAnio(anio);
        miLibroCalificaciones.setPromedio(promedio);

        miLibroCalificaciones.mostrarMensaje(); //llama al metodo creado

        LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones();
        miLibroCalificaciones2.mostrarMensaje();
        */

        Operaciones operaciones = new Operaciones();
        operaciones.setN1(20.0);
        operaciones.setN2(2.0);

        Operaciones operaciones2 = new Operaciones();
        System.out.println("Ingrese el valor de n1:");
        double n1 = sc.nextDouble();
        System.out.println("Ingrese el valor de n2:");
        double n2 = sc.nextDouble();

        operaciones2.setN1(n1);
        operaciones2.setN2(n2);

       operaciones2.sumaImpresion();
       operaciones2.restaImpresion();
       operaciones2.multiplicacionImpresion();
       operaciones2.divisionImpresion();
       operaciones2.raizImpresion();
    }
}