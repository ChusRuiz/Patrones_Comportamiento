public interface Aprobador {
    public void setNext (Aprobador aprobador);
    public Aprobador getNext();
    public void SolicitudPrestamo(int monto);
}
