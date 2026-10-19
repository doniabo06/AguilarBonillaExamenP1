package NodoComunicacion;

public class NodoRed {

    private int ID;
    private int maxconexiones;
    private boolean cactivas;
    private int capacidad;
    private static  int totalconexiones = 0;

    public int getID() {
        return ID;
    }

    public int getMaxconexiones() {
        return maxconexiones;
    }



    public NodoRed (int ID,   int capacidad  ){
        totalconexiones++;
        this.ID = ID;
        this.capacidad = capacidad;

    }

    public void activar(){
        boolean activar = cactivas == true;
    }

    public  void desactivar(){
        boolean desactivar = cactivas== false;
    }

    public void setCactivas (){
        if (cactivas == true){
            totalconexiones++;
        }
        else {
         totalconexiones--;
        }
    }


    public void setMaxconexiones (){
        capacidad = totalconexiones;
        if (totalconexiones > 0 && totalconexiones<=10){
            this.maxconexiones= totalconexiones;
        }
        else {
            System.out.println("Las conecciones sobrepasan el rango");
        }

    }

    public void mostrar (){
        System.out.println("crea Nodo: " + ID);
        System.out.println("Capacidad: "+ capacidad);
        System.out.println(" acivas " + cactivas);
    }








}
