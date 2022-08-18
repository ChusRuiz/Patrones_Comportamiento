public class Ejecutivo_de_cuenta implements Aprobador{
    private Aprobador next;
    public Aprobador getNext(){
        return next;
    }
public void SolicitudPrestamo(int monto){
    if (monto <= 10000){
        System.out.println("El ejecutivo de cuentas");
    }else{
    next.SolicitudPrestamo(monto);
    }
}
public void setNext(Aprobador aprobador){
    next = aprobador;
}
}
