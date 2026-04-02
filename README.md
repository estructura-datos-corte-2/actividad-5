# actividad-5
# Sistema de Inventario en Java (Lista Enlazada)

## Descripción

Este proyecto implementa un sistema de inventario en Java utilizando una lista enlazada simple. Permite gestionar productos mediante operaciones básicas como agregar, eliminar, buscar, ordenar, guardar y cargar información desde un archivo.

---

## Estructura del Proyecto

El proyecto está dividido en las siguientes clases:

### Producto.java

Representa un producto con los siguientes atributos:

* id: identificador único
* nombre: nombre del producto
* precio: valor del producto

### Nodo.java

Define un nodo de la lista enlazada:

* dato: objeto de tipo Producto
* siguiente: referencia al siguiente nodo

### ListaSimple.java

Implementa la lógica de la lista enlazada con los siguientes métodos:

* insertarFinal: agrega un producto al final de la lista
* eliminarPorId: elimina un producto según su id
* buscarPorId: busca un producto por id
* ordenar: ordena los productos por precio
* guardar: guarda los datos en un archivo
* cargar: carga los datos desde un archivo
* mostrar: imprime los productos en consola

### MainInventario.java

Contiene el programa principal con un menú interactivo que permite al usuario ejecutar las operaciones del sistema.

---

## Funcionalidades

* Agregar productos
* Eliminar productos por ID
* Buscar productos
* Ordenar productos por precio
* Mostrar lista de productos
* Guardar datos en archivo
* Cargar datos desde archivo

---

## Cómo ejecutar el programa

1. Compilar los archivos:

```bash
javac *.java
```

2. Ejecutar el programa:

```bash
java MainInventario
```

---

## Uso del programa

Al ejecutar el programa, se muestra el siguiente menú:

1 Agregar
2 Eliminar
3 Buscar
4 Ordenar
5 Mostrar
6 Guardar
7 Cargar
0 Salir

El usuario debe ingresar el número correspondiente a la operación que desea realizar.

---

## Formato del archivo

Los datos se almacenan en un archivo llamado:

inventario.csv

Cada línea del archivo tiene el siguiente formato:

id,nombre,precio

Ejemplo:

1,Arroz,2500
2,Leche,3000

---

## Conceptos aplicados

* Programación orientada a objetos
* Listas enlazadas
* Manejo de archivos en Java
* Estructuras dinámicas
* Algoritmos de ordenamiento

---

## Posibles mejoras

* Validar IDs duplicados
* Implementar actualización de productos
* Agregar interfaz gráfica
* Mejorar manejo de errores

---

## Notas

Todos los archivos deben estar en la misma carpeta para su correcta compilación y ejecución. El archivo inventario.csv se crea automáticamente al guardar los datos.
