import java.util.Scanner;

public class MainInventario {
    public static void main(String[] args) throws Exception {
        ListaSimple lista = new ListaSimple();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("1 Agregar 2 Eliminar 3 Buscar 4 Ordenar 5 Mostrar 6 Guardar 7 Cargar 0 Salir");
            op = sc.nextInt();

            if (op == 1) {
                lista.insertarFinal(new Producto(sc.nextInt(), sc.next(), sc.nextDouble()));
            } else if (op == 2) {
                lista.eliminarPorId(sc.nextInt());
            } else if (op == 3) {
                Producto p = lista.buscarPorId(sc.nextInt());
                if (p != null) System.out.println(p.nombre);
            } else if (op == 4) {
                lista.ordenar();
            } else if (op == 5) {
                lista.mostrar();
            } else if (op == 6) {
                lista.guardar("inventario.csv");
            } else if (op == 7) {
                lista.cargar("inventario.csv");
            }

        } while (op != 0);
    }
}