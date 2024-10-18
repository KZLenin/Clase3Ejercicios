import static java.lang.Math.*;

public class Operaciones {
    private double n1;
    private double n2;

    public Operaciones(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operaciones() {
    }

    private double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    private double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    //metodos personalizados
    public void imprimirDatos() {
        System.out.println("N1: " + getN1());
        System.out.println("N2: " + getN2());
    }

    public double sumatoria(){
        return n1 + n2;
    }
    public void sumaImpresion(){
        System.out.printf("Suma: %.2f\n", n1+n2);
    }

    public void restaImpresion(){
        System.out.printf("Resta: %.2f\n",n1-n2);
    }

    public void raizImpresion(){
        if (n1>=0||n2>=0){
            System.out.printf("Raiz de n1: %.2f\n", sqrt(n1));
            if (n2>=0) {
                System.out.printf("Raiz de n2: %.2f\n", sqrt(n2));
            } else {
                System.out.println("No existe la raiz de n1 y n2");
            }
        }
        
    }

    public void multiplicacionImpresion(){
        System.out.printf("Multiplicacion: %.2f\n", n1*n2);
    }
    public void divisionImpresion(){
        if (n2!=0.0) {
            System.out.printf("Division: %.2f\n", n1 / n2);
        } else {
            System.out.println("No se puede dividir");
        }
    }
}
