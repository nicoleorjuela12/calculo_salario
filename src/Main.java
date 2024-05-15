import java.util.Scanner;

public class Main {

    private static double SUBSIDIO_TRANSPORTE_MENSUAL = 160000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar numero de empleados a crear su liquidacion:");
        int cant = sc.nextInt();

        for (int i = 1; i <=cant; i++) {
            System.out.println("Ingresar nombre del empleado numero" +  i +":" );
            String nombre = sc.next();
            System.out.println("Ingresar apellido del empleado numero" +  i +":" );
            String apellido = sc.next();
            System.out.println("Ingrese el documento del empleado numero" +  i+":" );
            int documento = sc.nextInt();
            System.out.println("Ingrese cuantos dias trabajo el empleado numero " +  i +":" );
            int diasTrabajados = sc.nextInt();
            System.out.println("El empleado numero" +  i + "recibe subsidio de transporte (si/no):");
            boolean recibeSubsidioTransporte = sc.next().equalsIgnoreCase("si");
            System.out.println("Ingrese el salario mensual del empleado numero" +  i +":" );
            double salarioMensual = sc.nextDouble();


            double salarioProporcional = (salarioMensual / 30) * diasTrabajados;


            double subsidioTransporte = 0;
            if (recibeSubsidioTransporte) {
                subsidioTransporte = (SUBSIDIO_TRANSPORTE_MENSUAL / 30) * diasTrabajados;
            }
            else{
                subsidioTransporte = subsidioTransporte = 0;
            }


            double totalBruto = salarioProporcional + subsidioTransporte;


            double seguridadSocial = salarioProporcional * 0.04;
            double pension = salarioProporcional * 0.04;
            double descuentos = seguridadSocial + pension;



            double netoAPagar = totalBruto - descuentos;


            System.out.println("Nombre: " + nombre + " " + apellido);
            System.out.println("Documento: " + documento);
            System.out.println("Días trabajados: " + diasTrabajados);
            System.out.println("Salario proporcional: " + (double)Math.round(salarioProporcional));
            System.out.println("Subsidio de transporte: " + (double)Math.round(subsidioTransporte));
            System.out.println("Total bruto: " + (double)Math.round(totalBruto));
            System.out.println("Descuentos: " +(double)Math.round(descuentos));
            System.out.println("Neto a pagar: " + (double)Math.round(netoAPagar));
            System.out.println("------------------------------");
        }


    }
}

