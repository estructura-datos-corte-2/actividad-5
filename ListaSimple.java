import java.io.*;

public class ListaSimple {
    Nodo cabeza;

    public void insertarFinal(Producto p) {
        Nodo nuevo = new Nodo(p);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo aux = cabeza;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }
        aux.siguiente = nuevo;
    }

    public void eliminarPorId(int id) {
        if (cabeza == null) return;
        if (cabeza.dato.id == id) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo aux = cabeza;
        while (aux.siguiente != null && aux.siguiente.dato.id != id) {
            aux = aux.siguiente;
        }
        if (aux.siguiente != null) {
            aux.siguiente = aux.siguiente.siguiente;
        }
    }

    public Producto buscarPorId(int id) {
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.dato.id == id) return aux.dato;
            aux = aux.siguiente;
        }
        return null;
    }

    public void ordenar() {
        Nodo i = cabeza;
        while (i != null) {
            Nodo j = i.siguiente;
            while (j != null) {
                if (i.dato.precio > j.dato.precio) {
                    Producto t = i.dato;
                    i.dato = j.dato;
                    j.dato = t;
                }
                j = j.siguiente;
            }
            i = i.siguiente;
        }
    }

    public void guardar(String archivo) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        Nodo aux = cabeza;
        while (aux != null) {
            bw.write(aux.dato.id + "," + aux.dato.nombre + "," + aux.dato.precio);
            bw.newLine();
            aux = aux.siguiente;
        }
        bw.close();
    }

    public void cargar(String archivo) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String l;
        while ((l = br.readLine()) != null) {
            String[] p = l.split(",");
            insertarFinal(new Producto(Integer.parseInt(p[0]), p[1], Double.parseDouble(p[2])));
        }
        br.close();
    }

    public void mostrar() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.dato.id + " " + aux.dato.nombre + " " + aux.dato.precio);
            aux = aux.siguiente;
        }
    }
}