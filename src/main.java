
import fase2.faseDosControlador;
import fase4.FaseCuatroControlador;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

        // LLAMAR LOS METODOS DE LAS FASES
        //fase 1 --->
        faseDosControlador controladorFase2 = new faseDosControlador();
        //fase 3 --->
        FaseCuatroControlador controladorFase4 = new FaseCuatroControlador();


        int OP;
System.out.println("===============================");
System.out.println("ESCUELA POLITÉCINA NACIONAL");
System.out.println("ARQUITECTURA COMPUTACIONAL");
System.out.println("===============================");
System.out.println("INTEGRANTES:");
System.out.println("- ARIEL SORIA");
System.out.println("- SAMUEL ROBAYO");
System.out.println("- DOMENICA VALVERDE");
System.out.println("- DAVID TENORIO ");
System.out.println("===============================");
 do { 
    System.out.println("***************************************************");
     System.out.println("======= MENU PRINCIPAL ======= ");
        System.out.println("1. FASE CONVERSION DE DECIMAL A OTRAS BASES");
        System.out.println("2. FASE CONVERSION DE OTRAS BASES A DECIMAL");
        System.out.println("3. FASE ARITMÉTICA BINARIA Y COMPLEMENTO A DOS");
        System.out.println("4. FASE SUMA Y RESTA BINARIA COMPLEMENTO 2");
        System.out.println("9. SALIR");
          System.out.printf("SELECCIONE LA FASE QUE DESEA EJECUTAR:");
        OP = sc.nextInt();

        switch (OP) {
            case 1:
                System.out.println("***************************************************");
                //Fase 1
                break;
             case 2:
                System.out.println("***************************************************");
                controladorFase2.iniciarFaseDos();
                break;
            case 3:
                System.out.println("***************************************************");
                //fase 3
                break;
            case 4:
                System.out.println("***************************************************");
                controladorFase4.MostrarFaseCuatro();
                break;
            case 9:
                System.out.println("Saliendo del programa...");
                
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
 } while (OP!=9);

}
}
