public class Banco implements Aprobador{
    private Aprobador next;
  
    public Aprobador getNext(){
        return next;
    }
    public void SolicitudPrestamo (int monto){
        
    Ejecutivo_de_cuenta ejecutivo = new  Ejecutivo_de_cuenta();
    this.setNext(ejecutivo);
    
    Lider_de_ejecutivo lider = new  Lider_de_ejecutivo();
    ejecutivo.setNext(lider);
    
    Gerente gerente = new Gerente();
    lider.setNext((gerente));
    
    Director director = new Director ();
    gerente.setNext(director);
    
    next.SolicitudPrestamo(monto);
    }
    public void setNext(Aprobador aprobador){
    next = aprobador;
    }
}
