import java.util.Scanner;
public class Cliente {
    
    public static void main(String[] args){
        Scanner Cantidad = new Scanner(System.in);
        int monto;  
        System.out.println("Ingrese la cantidad de su prestamo a solicitar:");
        monto = Cantidad.nextInt();
        System.out.println("Su prestamo de "+monto+".Q"+" debe ser aprobado por");
        Banco banco = new Banco();
        banco.SolicitudPrestamo(monto);
    }
}
