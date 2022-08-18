public class Director implements Aprobador {
    private Aprobador next;
    
    public Aprobador getNext(){
        return next;
    }
public void SolicitudPrestamo (int monto){
    if (monto >=  100000){
        System.out.println("El Director");
    }
}
public void setNext(Aprobador aprobador){
    next = aprobador;
}
}