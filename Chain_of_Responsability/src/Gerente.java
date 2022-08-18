public class Gerente implements Aprobador{
    private Aprobador next;
    
    public Aprobador getNext(){
        return next;
    }
public void SolicitudPrestamo (int monto){
    if (monto > 50000 && monto <= 100000){
        System.out.println("El Gerente");
    }else{
    next.SolicitudPrestamo(monto);
    }
}
public void setNext(Aprobador aprobador){
    next = aprobador;
}
}
