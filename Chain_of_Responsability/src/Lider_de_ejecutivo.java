public class Lider_de_ejecutivo implements Aprobador{
    private Aprobador next;
    
    public Aprobador getNext(){
        return next;
    }
public void SolicitudPrestamo (int monto){
    if (monto > 10000 && monto <= 50000){
        System.out.println("El Lider");
    }else{
    next.SolicitudPrestamo(monto);
    }
}
public void setNext(Aprobador aprobador){
    next = aprobador;
}
    
}
