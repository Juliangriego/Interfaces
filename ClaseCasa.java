public class ClaseCasa {
    String techo;
    String piso;
    String color;
    String direccion;
    int ambientes;
    double superficie;

    //Constructores
    public ClaseCasa() {}
    public ClaseCasa(String t,String p, String c, String d, int a, double s) {
        this.techo = t;this.piso=p;this.color=c;this.direccion=d;this.ambientes=a;this.superficie=s;}
    
    //Metodos
    void SuelaAlarma() {
        System.out.println("IIIIIIIUUUUUUIIIIIIIIIUUUUUUU");
    }
    void DesbloquearPuertas(){
        System.out.println("Puertas desbloqueadas");
    }
    void EncenderCalefaccion(){
        int temp;
        System.out.println("Ingrese temperatura");
        temp = Integer.parseInt(System.console().readLine());
        System.out.println("La temperatura es de " + temp + " grados centígrados.");
    }
}
