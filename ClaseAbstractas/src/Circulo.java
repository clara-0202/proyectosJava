public  class Circulo implements Figura,Dibujable,Rotable {

    private double radio;

    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado= pi*radio*radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("hola estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("hola estoy rotando un circulo");
    }
}



/* va a cambiar extends po implements pq este era para la calse abstracta
public  class Circulo extends Figura {

    private double radio;

    public Circulo() {

    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
       double resultado= pi*radio*radio;
        return resultado;
    }
}*/
