package Tarea6;

public class ejercicio6App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
      
        Pelicula pelicula= new Pelicula("Toy Story",120,6,"John Lasseter");
        final double preciopelicula=5;
        
        Cine cine= new Cine(pelicula,preciopelicula);
       
        cine.crearEspectador();
        cine.crearAsiento();
        cine.asignarAsiento();
        //cine.crearAsientos();
        cine.mostrarSala();
        
        //cine.comprobarEspectador();
        
       
     
        





    }

}