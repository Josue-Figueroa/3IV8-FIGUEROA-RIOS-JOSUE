/*
va a ser la clase principal para poder hacer las invocaciones de los difeerentes
objetos de clase y sus metodos de un reino animal
*/

public class Principal{

    //al metodo principal de todo el programa
    public static void main(String[] args){
        //y ahora no ponemos anda y utilizare git como se debe 

        //ahora vamos a realizar los objetos de las clases y sus invocaciones

        Perro dog = new Perro("Teddy", "Callejero", "Croquetas", 2, "fuerte");
        Gato cat = new Gato("Miau", "Hogareño", "atun", 1, 7);
        Perico per = new Perico("Pancrasio", "Hogañero", "Pistache", 3, "Grosero");
        Tortuga tor = new Tortuga("Valencia", "Mar", "Cochitos", 50, "fuerte");
        Hamster ham = new Hamster("Juan", "Hogareño", "Lechuga", 4, "mucho");
        //dog.setNombre(variable);

        //los metodos
        dog.mostrarPerro();
        System.out.println("------");
        cat.mostrarGato();
        System.out.println("-------");
        per.mostrarPerico();
        System.out.println("-------");
        tor.mostrarTortuga();
        System.out.println("-------");
        ham.mostrarHamster();
    }
}