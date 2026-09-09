package practica4;

import java.util.ArrayList;

public class Catalogo {
    //Se hizo private el ArrayList
    private ArrayList<Pelicula>peliculas;

    public Catalogo() {
        peliculas = new ArrayList<Pelicula>();
    }

    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public String getPeliculas(){      //Se realizo correccion de getPelicula a getPeliculas
        String resultado="";
        for(int i=0;i<peliculas.size();i++){
            Pelicula p=peliculas.get(i);
            resultado= resultado + p.getInformacion()+ "\n" ;
        }
        return resultado;
    }

    public String buscarPeliculaPorTitulo(String titulo){
        for(int i=0;i<peliculas.size();i++){
            Pelicula p=peliculas.get(i);
            if(p.getTitulo().equalsIgnoreCase(titulo)){//Se corrigio el llamado de la variable titulo ajustandolo a su private actual
                System.out.println("practica4.Pelicula Encontrada: "+p.getInformacion());
                return titulo;
            }
        }
        System.out.println("PeliculaEncontrada");
        return titulo;
    }

    public String toString(){
        return "Catalogo con "+peliculas.size()+" peliculas";
    }

    public int getNumeroPeliculas(){
        return peliculas.size();
    }
}
